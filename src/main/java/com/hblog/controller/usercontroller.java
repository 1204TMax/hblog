package com.hblog.controller;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.hblog.bean.Blog;
import com.hblog.bean.User;
import com.hblog.bean.Userinfo;
import com.hblog.bean.Visit;
import com.hblog.mapper.VisitMapper;
import com.hblog.service.userservice;
import com.hblog.service.impl.blogserviceimpl;
import com.hblog.service.impl.userserviceimpl;
import com.hblog.service.impl.visitserviceimpl;
import com.hblog.util.gettime;

@Controller
@Scope("prototype")
@RequestMapping("/user")
public class usercontroller {
	@Autowired
	userservice us;
	@Autowired
	userserviceimpl usim;
	@Autowired
	blogserviceimpl blim;
	@Autowired
	gettime gettime;
	@Autowired
	VisitMapper VisitMapper;
	@Autowired
	visitserviceimpl visitserviceimpl;
	@Autowired
	Visit visit;
	int page = 1;

	// 查询所有user
	@RequestMapping("/userlist")
	public String queryuserlist(Model model) {
		List<User> users = us.selectalluser(null);
		model.addAttribute("users", users);
		return "/list.jsp";
	}

	// 根据name查询用户User
	@RequestMapping("/serchuserbyname")
	public User serchuserbyname(String username, Model model, HttpSession session, HttpServletRequest request) {
		User user = usim.serchuserbyname(username);
		return user;
	}

	// 根据id查询用户User
	@RequestMapping("/serchuserbyid")
	public User serchuserbyid(int userid, Model model, HttpSession session, HttpServletRequest request) {
		User user = usim.serchuserbyid(userid);
		return user;
	}

	// 注册
	@RequestMapping("/adduser")
	public String adduser(User user, Model model, HttpSession session, HttpServletRequest request) {
		String aa = us.insert(user);
		if (aa == "success") {
			String time = this.gettime.getWebsiteDatetime();
			User user1 = usim.serchuserbyname(user.getUserName());
			// 注册时间
			usim.updateuserregistertimebyid(user1.getUserId(), time);
			// 最近登录时间
			usim.updateusertimebyid(user1.getUserId(), time);
			session.setAttribute("userid", user1.getUserId());
			session.setAttribute("user", user);
			return "/view_front/userinfo.jsp";
		} else {
			model.addAttribute("msg", "此昵称已存在，请重新输入");
			return "/view_front/register.jsp";
		}
	}

	// 增加用户详细信息
	@RequestMapping("/adduserinfo")
	public String adduserinfo(Userinfo userinfo, Model model, HttpSession session, HttpServletRequest request) {
		int userid = (Integer) request.getSession().getAttribute("userid");
		userinfo.setUserId(userid);
		String src = "酷.png";
		userinfo.setUserHeadimageSrc(src);
		usim.insertuserinfo(userinfo);
		session.setAttribute("userinfo", userinfo);
		session.setAttribute("page", page);
		// session中设置头像路径
		session.setAttribute("headimgsrc", src);
		visitserviceimpl.addvisit();
		return "/blog/getList?page=1";
	}

	// 登录
	@RequestMapping("/login")
	public String login(User user, Model model, HttpSession session) {
		String aaa = usim.login(user);
		if (aaa.length() < 7) {
			System.err.println(aaa);
			int userid = Integer.parseInt(aaa);
			// sesion设置userid，页数，头像路径，user对象，userinfo
			session.setAttribute("userid", userid);
			session.setAttribute("page", page);
			session.setAttribute("headimgsrc", usim.queryheadimgsrc(userid));
			session.setAttribute("user", usim.serchuserbyid(userid));
			session.setAttribute("userinfo", usim.queryuserinfobyuserid(userid));
			// 获取当前时间
			String logindate = this.gettime.getWebsiteDatetime();
			// 插入最近登录时间
			usim.updateusertimebyid(userid, logindate);
			visitserviceimpl.addvisit();
			return "/blog/getList?page=1";
		} else if (aaa == "pwderror") {
			model.addAttribute("msg", "密码错误，请重新输入");
			return "/view_front/register.jsp";
		} else {
			model.addAttribute("msg", "此账号不存 在，请重新输入");
			return "/view_front/register.jsp";
		}
	}

	// 上传头像
	@RequestMapping("editheadimg")
	public String editheadimg(HttpServletRequest request, Model model) throws IllegalStateException, IOException {
		// 将当前上下文初始化给 CommonsMutipartResolver （多部分解析器）
		CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(
				request.getSession().getServletContext());
		// 检查form中是否有enctype="multipart/form-data"
		if (multipartResolver.isMultipart(request)) {
			// 将request变成多部分request
			MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
			// 获取multiRequest 中所有的文件名
			Iterator iter = multiRequest.getFileNames();
			while (iter.hasNext()) {
				// 一次遍历所有文件
				MultipartFile file = multiRequest.getFile(iter.next().toString());
				if (file != null) {
					System.err.println(file.getOriginalFilename());
					String path = "D:/Hblog/headimage/" + file.getOriginalFilename();
					// 上传
					file.transferTo(new File(path));
					// 图片地址上传数据库
					HttpSession session = request.getSession();
					int userid = (Integer) session.getAttribute("userid");
					// 数据库里的图片只存图片名
					String imgsrc = file.getOriginalFilename();
					session.setAttribute("headimgsrc", imgsrc);
					usim.insertheadimg(imgsrc, userid);
					return "/user/getpersonal?page=1";
				}
			}
		}
		return null;
	}

	// 更改userinfo
	@RequestMapping("/edituserinfo")
	public String edituserinfo(HttpServletRequest request, Userinfo userinfo) {
		HttpSession session = request.getSession();
		int userid = (Integer) session.getAttribute("userid");
		int userinfoid = usim.querybyid(userid);
		userinfo.setUserId(userid);
		userinfo.setUserinfoId(userinfoid);
		usim.updateuserinfo(userinfo);
		session.setAttribute("userinfo", userinfo);
		return "/view_front/personal.jsp";
	}

	// 首页点击链接查看别人的主页
	@RequestMapping("/goother")
	public String goother(HttpServletRequest request, Model model) throws Exception {
		// 获取url里的username和page
		String username = request.getParameter("username");
		int page = Integer.parseInt(request.getParameter("page"));
		// 把当前页,前一页，后一页发送往首页
		int pprepage;
		int plastpage;
		System.err.println(page);
		if (page > 1) {
			pprepage = page - 1;
		} else {
			pprepage = page;
		}
		int pagecount = blim.getpersonpagecount(username);
		System.err.println(pagecount);
		if (page < pagecount) {
			plastpage = page + 1;
		} else {
			plastpage = page;
		}
		// 通过username查询到user,userinfo,并查询第一页的blog
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		String mename = user.getUserName();
		User me = usim.serchuserbyname(mename);
		User other = usim.serchuserbyname(username);
		Userinfo otherinfo = usim.queryuserinfobyuserid(other.getUserId());
		Userinfo simotherinfo = usim.queryuserinfobyuserid(other.getUserId());
		String memode = usim.queryuserinfobyuserid(me.getUserId()).getUserinfoMode();
		String othermode = otherinfo.getUserinfoMode();
		simotherinfo.setUserinfoBloodType("保密");
		simotherinfo.setUserinfoConstellation("保密");
		simotherinfo.setUserinfoEducation("保密");
		simotherinfo.setUserinfoHeight("保密");
		simotherinfo.setUserinfoHeight("保密");
		simotherinfo.setUserinfoIdNumber("保密");
		simotherinfo.setUserinfoMarriageState("保密");
		simotherinfo.setUserinfoMicroblog("保密");
		simotherinfo.setUserinfoOftenPlace("保密");
		simotherinfo.setUserinfoQq("保密");
		simotherinfo.setUserinfoRealName("保密");
		simotherinfo.setUserinfoSexChoice("保密");
		simotherinfo.setUserinfoWechat("保密");
		simotherinfo.setUserinfoWeight("保密");
		System.err.println("me:" + memode);
		System.err.println("other:" + othermode);
		String qmode = "强交友模式";
		if (memode.equals(qmode) && othermode.equals(qmode)) {
			model.addAttribute("otherinfo", otherinfo);
		} else {
			model.addAttribute("otherinfo", simotherinfo);
		}
		model.addAttribute("other", other);
		List<Blog> blogs = this.blim.peopleList(page, username);
		model.addAttribute("personbloglist", blogs);
		System.err.println(blogs);
		model.addAttribute("pprepage", pprepage);
		model.addAttribute("plastpage", plastpage);
		model.addAttribute("preallastpage", pagecount);
		model.addAttribute("page", page);
		model.addAttribute("pagesize", blogs.size());
		session.setAttribute("othername", username);
		return "/view_front/otherpeople.jsp";
	}

	// 查看自己的主页，添加blog信息,分页信息
	@RequestMapping("/getpersonal")
	public String getpersonal(HttpServletRequest request, Model model) throws Exception {
		int page = Integer.parseInt(request.getParameter("page"));
		// 把当前页,前一页，后一页发送往首页
		int pprepage;
		int plastpage;
		System.err.println(page);
		if (page > 1) {
			pprepage = page - 1;
		} else {
			pprepage = page;
		}
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		String username = user.getUserName();
		int pagecount = blim.getpersonpagecount(username);
		System.err.println(pagecount);
		if (page < pagecount) {
			plastpage = page + 1;
		} else {
			plastpage = page;
		}
		List<Blog> blogs = this.blim.peopleList(page, username);
		model.addAttribute("personalblogs", blogs);
		model.addAttribute("pprepage", pprepage);
		model.addAttribute("plastpage", plastpage);
		model.addAttribute("preallastpage", pagecount);
		model.addAttribute("page", page);
		model.addAttribute("pagesize", blogs.size());
		return "/view_front/personal.jsp";
	}

	// 判断用户是否存在
	@RequestMapping("/serchuser")
	public String serchuser(HttpServletRequest request, Model model, User user1) throws Exception {
		System.err.println("username："+user1.getUserName());
		int page = 1;
		String username = user1.getUserName();
		user1.setUserName(username);
		String aaa = usim.login(user1);
		System.err.println("aaa:"+aaa);
		if (aaa.length() < 7||aaa == "pwderror") {
			System.err.println("jinlaile");
			// 把当前页,前一页，后一页发送往首页
			int pprepage;
			int plastpage;
			System.err.println(page);
			if (page > 1) {
				pprepage = page - 1;
			} else {
				pprepage = page;
			}
			int pagecount = blim.getpersonpagecount(username);
			System.err.println(pagecount);
			if (page < pagecount) {
				plastpage = page + 1;
			} else {
				plastpage = page;
			}
			// 通过username查询到user,userinfo,并查询第一页的blog
			HttpSession session = request.getSession();
			User user = (User) session.getAttribute("user");
			String mename = user.getUserName();
			User me = usim.serchuserbyname(mename);
			User other = usim.serchuserbyname(username);
			Userinfo otherinfo = usim.queryuserinfobyuserid(other.getUserId());
			Userinfo simotherinfo = usim.queryuserinfobyuserid(other.getUserId());
			String memode = usim.queryuserinfobyuserid(me.getUserId()).getUserinfoMode();
			String othermode = otherinfo.getUserinfoMode();
			simotherinfo.setUserinfoBloodType("保密");
			simotherinfo.setUserinfoConstellation("保密");
			simotherinfo.setUserinfoEducation("保密");
			simotherinfo.setUserinfoHeight("保密");
			simotherinfo.setUserinfoHeight("保密");
			simotherinfo.setUserinfoIdNumber("保密");
			simotherinfo.setUserinfoMarriageState("保密");
			simotherinfo.setUserinfoMicroblog("保密");
			simotherinfo.setUserinfoOftenPlace("保密");
			simotherinfo.setUserinfoQq("保密");
			simotherinfo.setUserinfoRealName("保密");
			simotherinfo.setUserinfoSexChoice("保密");
			simotherinfo.setUserinfoWechat("保密");
			simotherinfo.setUserinfoWeight("保密");
			System.err.println("me:" + memode);
			System.err.println("other:" + othermode);
			String qmode = "强交友模式";
			if (memode.equals(qmode) && othermode.equals(qmode)) {
				model.addAttribute("otherinfo", otherinfo);
			} else {
				model.addAttribute("otherinfo", simotherinfo);
			}
			model.addAttribute("other", other);
			List<Blog> blogs = this.blim.peopleList(page, username);
			model.addAttribute("personbloglist", blogs);
			System.err.println(blogs);
			model.addAttribute("pprepage", pprepage);
			model.addAttribute("plastpage", plastpage);
			model.addAttribute("preallastpage", pagecount);
			model.addAttribute("page", page);
			model.addAttribute("pagesize", blogs.size());
			session.setAttribute("othername", username);
			return "/view_front/otherpeople.jsp";
		}else {
			return null;
		}
	}

}
