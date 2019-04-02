package com.hblog.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hblog.bean.BlogComment;
import com.hblog.bean.User;
import com.hblog.bean.Userinfo;
import com.hblog.service.impl.blogserviceimpl;
import com.hblog.service.impl.commentserviceimpl;
import com.hblog.service.impl.userserviceimpl;

@Controller
@Scope("prototype")
@RequestMapping("comment")
public class commentcontroller {
	@Autowired
	commentserviceimpl commentserviceimpl;
	@Autowired
	blogserviceimpl blogim;
	@Autowired
	userserviceimpl usim;
	@Autowired
	User user;
	@Autowired
	Userinfo userinfo;
@RequestMapping("getcomment")
@ResponseBody
public Map<String, List<BlogComment>> getcomment(int blogid){
		//查询blogid的所有comment记录
	System.err.println("123");
		List<BlogComment> comments = commentserviceimpl.getcomment(blogid);
		for(int i = 0;i<comments.size();i++){
			//通过blogid查到userid
			User user = usim.serchuserbyname(comments.get(i).getUsername());
			//通过userid查到userinfo
			Userinfo userinfo = usim.queryuserinfobyuserid(user.getUserId());
			//通过userinfo查到现在的头像
			String headurl = userinfo.getUserHeadimageSrc();
			comments.get(i).setUserimg(headurl);
		}
		Map<String, List<BlogComment>> map = new HashMap<String, List<BlogComment>>();
			map.put("comments", comments);
		return map;
	
}
@RequestMapping("setcomment")
public void setcomment(HttpServletRequest request,int blogid,String blogcomment){
	//查询blogid的所有comment记录
	commentserviceimpl.setcomment(request,blogid,blogcomment);
}
@RequestMapping("delcomment")
public void delcomment(int commentid){
	commentserviceimpl.delcomment(commentid);
}
}
