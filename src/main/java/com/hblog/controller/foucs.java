package com.hblog.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hblog.service.userservice;
import com.hblog.service.impl.blogserviceimpl;
import com.hblog.service.impl.focusserviceimpl;
import com.hblog.service.impl.userserviceimpl;

@Controller
@Scope("prototype")
@RequestMapping("focus")
public class foucs {
	@Autowired
	userservice us;
	@Autowired
	userserviceimpl usim;
	@Autowired
	blogserviceimpl blim;
	@Autowired
	focusserviceimpl fuim;
@RequestMapping("focus")
public void focus(HttpSession session){
	System.err.println("asdasd");
	int userid = (int) session.getAttribute("userid");
	String othername = (String) session.getAttribute("othername");
	//查询被关注者的userid
	int otherid = usim.serchuserbyname(othername).getUserId();
	fuim.focus(userid, otherid);
}
}
