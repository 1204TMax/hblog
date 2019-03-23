package com.hblog.service.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hblog.bean.BlogComment;
import com.hblog.bean.BlogCommentExample;
import com.hblog.bean.User;
import com.hblog.bean.Userinfo;
import com.hblog.mapper.BlogCommentMapper;
import com.hblog.util.gettime;

@Service
@Scope("prototype")
@Transactional
public class commentserviceimpl {
	@Autowired
	BlogCommentMapper BlogCommentMapper;
	@Autowired
	userserviceimpl userserviceimpl;
	@Autowired
	blogserviceimpl blogserviceimpl;
	@Autowired
	gettime gettime;
	
	public List<BlogComment> getcomment(int blogid){
		System.err.println(blogid);
		BlogComment BlogComment = new BlogComment();
		BlogCommentExample blogcommentexample = new BlogCommentExample();
		BlogCommentExample.Criteria
		BlogCommentCriteria=blogcommentexample.createCriteria();
		BlogCommentCriteria.andCommentBlogIdEqualTo(blogid);
		List<BlogComment> comments = this.BlogCommentMapper.selectByExample(blogcommentexample);
		return comments;
	}
	public void setcomment(HttpServletRequest request,int blogid,String blogcomment){
		//取得评论者的userid
		HttpSession session = request.getSession();
		int userid = (Integer) session.getAttribute("userid");
		//根据userid查询user的username
		User user = userserviceimpl.serchuserbyid(userid);
		String username = user.getUserName();
		//根据userid查询userinfo的headimg
		Userinfo userinfo = userserviceimpl.queryuserinfobyuserid(userid);
		String headimg= userinfo.getUserHeadimageSrc();
		BlogComment comment = new BlogComment();
		comment.setCommentBlogId(blogid);
		comment.setBlogCommentContent(blogcomment);
		comment.setUserimg(headimg);
		comment.setUsername(username);
		comment.setCommentUserId(userid);
		String time = gettime.getWebsiteDatetime();
		comment.setCommenttime(time);
		BlogCommentMapper.insert(comment);
	}
	public void delcomment(int commentid){
		BlogCommentMapper.deleteByPrimaryKey(commentid);
	}
}
