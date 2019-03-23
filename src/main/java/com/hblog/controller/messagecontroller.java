package com.hblog.controller;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hblog.bean.Message;
import com.hblog.bean.User;
import com.hblog.bean.Userinfo;
import com.hblog.bean.Visit;
import com.hblog.service.impl.blogserviceimpl;
import com.hblog.service.impl.messageserviceimpl;
import com.hblog.service.impl.userserviceimpl;
import com.hblog.util.gettime;

@Controller
@Scope("prototype")
@RequestMapping("message")
public class messagecontroller {
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
	@Autowired
	Visit visit;
	@Autowired
	messageserviceimpl mepl;
	/*从其他人你的主页里进入chat,查询双方私信记录*/
	@RequestMapping("/getmessagefromother")
	public List<Message> getmessagefromother(HttpServletRequest request,HttpSession session){
		String othername = request.getParameter("othername");
		User user = (User) session.getAttribute("user");
		int userid = user.getUserId();
		int otherid = usim.serchuserbyname(othername).getUserId();
		//查询双方私信记录
		List<Message> messages = mepl.getchatrecord(userid,otherid);
		return null;
	}
	/*从首页进入chat，查询所有人的私信记录*/
	@RequestMapping("/getmessagefromindex")
	public String  getmessagefromindex(HttpServletRequest request,HttpSession session,Model model){
		User user = (User) session.getAttribute("user");
		int userid = user.getUserId();
		//同时装载聊天对象的聊天记录和聊天对象的名字
		//Map<String, List<?>> allchat = new HashMap();
		//查询到所有的user
		List<User> users = this.getcontactlist(session);
		//chats 里面放map
		//List<Map> chats = new ArrayList<Map>();
		List<List<Message>> otherchat = new ArrayList<List<Message>>();
		//List放每个人的私信记录
		List<List<Message>> userchat = new ArrayList<List<Message>>();
		//查询userfo
		List<Userinfo> userinfos = new ArrayList<Userinfo>();
		for(int i=0;i<users.size();i++){
			int otherid = users.get(i).getUserId();
			String username = users.get(i).getUserName();
			//查询本人的发信记录
			List<Message> usermessages = mepl.getchatrecord(userid,otherid);
			userchat.add(usermessages);
			//查询好友的发信记录
			List<Message> othermessages = mepl.getchatrecord(otherid,userid);
			otherchat.add(othermessages);
			userinfos.add(usim.queryuserinfobyuserid(users.get(i).getUserId()));
		}
		 model.addAttribute("users", users);
		 model.addAttribute("userchat", userchat);
		 model.addAttribute("otherchat", otherchat);
		 System.err.println(otherchat.size());
		 model.addAttribute("userinfos", userinfos);
		 System.err.println("测试："+otherchat.size());
		return "/view_front/chat.jsp";
	}
	/*查询所有联系人*/
	@RequestMapping("/getcontactlist")
	public List<User> getcontactlist(HttpSession session){
		User user = (User) session.getAttribute("user");
		int userid = user.getUserId();
		List<Message> contacts = mepl.getcontactlist(userid);
		List<User> users = new ArrayList<User>();
		for(int i=0;i<contacts.size();i++){
			User user1 = usim.serchuserbyid(contacts.get(i).getReceiveId());
			users.add(user1);
		}
		return users;
	}
	/*增加聊天记录（一条*/
	@RequestMapping("/insertchatrecord")
	public void insertchatrecord(HttpServletRequest request,Message message){
		String messagecontent = request.getParameter("messagecontent");
		int receiveid = Integer.parseInt(request.getParameter("receiveid"));
		User user = (User) session.getAttribute("user");
		int userid = user.getUserId();
		message.setSendId(userid);
		message.setReceiveId(receiveid);
		message.setMessageTime(gettime.getWebsiteDatetime());
		message.setMessageContent(messagecontent);
		System.err.println(messagecontent);
		mepl.insertchatrecord(message);
	}
	/*查询双方两天记录*/
	@RequestMapping("/getmessageto2man")
	public String  getmessageto2man(HttpServletRequest request,HttpSession session,Model model){
		User user = (User) session.getAttribute("user");
		int userid = user.getUserId();
/*		for(int i=0;i<users.size();i++){
			int otherid = users.get(i).getUserId();
			String username = users.get(i).getUserName();
			//查询本人的发信记录
			List<Message> c = mepl.getchatrecord(userid,otherid);
			//查询好友的发信记录
			List<Message> othermessages = mepl.getchatrecord(otherid,userid);
		}*/
		return null;
	}
}
