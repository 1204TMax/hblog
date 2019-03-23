package com.hblog.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hblog.bean.Blog;
import com.hblog.bean.User;
import com.hblog.bean.Userinfo;
import com.hblog.service.impl.blogserviceimpl;
import com.hblog.service.impl.userserviceimpl;
import com.hblog.util.gettime;

@Controller
@Scope("prototype")
@RequestMapping("/blog")
public class blogcontroller {
	@Autowired
	blogserviceimpl blogim;
	@Autowired
	userserviceimpl usim;
	@Autowired
	usercontroller uc;
	@Autowired
	private HttpSession session;
	@Autowired
	gettime gettime;
	// 上传blog
	@RequestMapping("/uploadblog")
	public String uploadblog(Blog blog, Model model, HttpServletRequest request) {
		String cityname = request.getParameter("cityname");
		String content = request.getParameter("content");
		System.err.println(cityname);
		String time = gettime.getWebsiteDatetime();
		int userid = (Integer) request.getSession().getAttribute("userid");
		User user = uc.serchuserbyid(userid, model, session, request);
		blog.setBlogAuthor(user.getUserName());
		blog.setBlogUserId(userid);
		blog.setBlogPublishTime(time);
		blog.setBlogPraise(0);
		blog.setBlogPublishPlace(cityname);
		blog.setBlogContent(content);
		blogim.uploadblog(blog);
		return "/blog/getList?page=1";
	}
	// 查询所有blog
	public List<Blog> serchallblog(Model model, HttpServletRequest request) {
		List<Blog> blogs = blogim.serchallblog();
		return blogs;
	}
	// 分页操作
	@RequestMapping("/getList")
	public String getList(int page, Model model, HttpSession session) throws Exception {
		if (page == 0) {
			page = 1;
		}
		// 把当前页,前一页，后一页发送往首页
				int prepage;
				int lastpage;
				if (page > 1) {
					prepage = page - 1;
				} else {
					prepage = page;
				}
				int pagecount = blogim.getpagecount();
				if (page < pagecount) {
					lastpage = page + 1;
					
				} else {
					lastpage = page;
				}
				session.setAttribute("indexpage", page);
				session.setAttribute("prepage", prepage);
				session.setAttribute("lastpage", lastpage);
				// 查询blog，user，userinfo
				List<User> users = new ArrayList<User>();
				List<Userinfo> userinfos = new ArrayList<Userinfo>();
				List<Blog> blogs = new ArrayList<Blog>();
				for(int i=0;i<blogim.getList(page).size();i++){
					int blogid = blogim.getList(page).get(i).getBlogId();
					User user = blogim.queryuserbyblogid(blogid);
					users.add(user);
					Userinfo userinfo = usim.queryuserinfobyuserid(user.getUserId());
					userinfos.add(userinfo);
				}
				// 发送blog，user，userinfo,pagesize
				int pagesize = blogim.getList(page).size();//当前页的内容数量
				System.err.println("pagesize:"+pagesize);
				session.setAttribute("bloglist", blogim.getList(page));
				session.setAttribute("userlist", users);
				session.setAttribute("userinfolist", userinfos);
				session.setAttribute("pagesize", pagesize);
				session.setAttribute("indexpage", page);
				int reallastpage = blogim.getpagecount();
				session.setAttribute("reallastpage", blogim.getpagecount());
				
		return "/view_front/index.jsp";
	}
	//删除blog
	@RequestMapping("delblogbyid")
	public String delblogbyid(Model model,HttpServletRequest request){
		HttpSession session = request.getSession();
		int blogid = Integer.parseInt(request.getParameter("blogid"));
		this.blogim.delblogbyid(blogid);
		return "/user/getpersonal?page=1";
	}
	//查询blog总数
	@RequestMapping("countblog")
	public int countblog(){
		int countblog = this.blogim.countblog();
		return countblog;
	}
		//根据userid查询blog总数
	@RequestMapping("countblogbyuserid")
	public int countblogbyuserid(int userid){
		int countblogbyuserid = this.blogim.countblogbyuserid(userid);
		return countblogbyuserid;
	}
	//增加赞
	@RequestMapping("addhert")
	public void addhert(HttpServletRequest request){
		Integer blogid = Integer.parseInt(request.getParameter("blogid"));
		this.blogim.addhert(blogid);
	}
	//取消赞
	@RequestMapping("minushert")
	public void minushert(int blogid){
		this.blogim.minushert(blogid);
	}
	//查询blog的赞的数量
	public int counthert(int blogid){
		return this.blogim.counthert(blogid);
	}
	//查询所有同城的blog并分页
	@RequestMapping("samecity")
		public String samecity(int page,Model model, HttpSession session,HttpServletRequest request) throws Exception {
			String cityname = request.getParameter("cityname");
			if (page == 0) {
				page = 1;
			}
			// 把当前页,前一页，后一页发送往首页
					int prepage;
					int lastpage;
					if (page > 1) {
						prepage = page - 1;
					} else {
						prepage = page;
					}
					int pagecount = blogim.getpagecount();
					if (page < pagecount) {
						lastpage = page + 1;
						
					} else {
						lastpage = page;
					}
					session.setAttribute("indexpage", page);
					session.setAttribute("prepage", prepage);
					session.setAttribute("lastpage", lastpage);
					// 查询blog，user，userinfo
					List<User> users = new ArrayList<User>();
					List<Userinfo> userinfos = new ArrayList<Userinfo>();
					List<Blog> blogs = new ArrayList<Blog>();
					for(int i=0;i<blogim.getsamecityList(page,cityname).size();i++){
						int blogid = blogim.getsamecityList(page,cityname).get(i).getBlogId();
						User user = blogim.queryuserbyblogid(blogid);
						users.add(user);
						Userinfo userinfo = usim.queryuserinfobyuserid(user.getUserId());
						userinfos.add(userinfo);
					}
					// 发送blog，user，userinfo,pagesize
					int pagesize = blogim.getsamecityList(page,cityname).size();//当前页的内容数量
					System.err.println("pagesize:"+pagesize);
					session.setAttribute("bloglist", blogim.getsamecityList(page,cityname));
					session.setAttribute("userlist", users);
					session.setAttribute("userinfolist", userinfos);
					session.setAttribute("pagesize", pagesize);
					session.setAttribute("indexpage", page);
					int reallastpage = blogim.getpagecount();
					session.setAttribute("reallastpage", blogim.getpagecount());
			return "/view_front/samecity.jsp";
			
		}
}
