package com.hblog.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hblog.bean.Visit;
import com.hblog.service.impl.blogserviceimpl;
import com.hblog.service.impl.userserviceimpl;
import com.hblog.service.impl.visitserviceimpl;
import com.hblog.util.gettime;

@Controller
@Scope("prototype")
@RequestMapping("/visit")
public class visitcontroller {
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
	@RequestMapping("/addvisit")
	public void addvisit(){
		visitserviceimpl visitserviceimpl = new visitserviceimpl();
		visitserviceimpl.addvisit();
	}
}
