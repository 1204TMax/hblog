package com.hblog.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hblog.bean.BlogComment;
import com.hblog.bean.BlogCommentExample;
import com.hblog.bean.Focus;
import com.hblog.bean.FocusExample;
import com.hblog.bean.Message;
import com.hblog.bean.MessageExample;
import com.hblog.bean.User;
import com.hblog.mapper.BlogMapper;
import com.hblog.mapper.FocusMapper;
import com.hblog.mapper.UserMapper;
import com.hblog.mapper.UserinfoMapper;

@Service("focusserviceimpl")
@Scope("prototype")
public class focusserviceimpl {
	@Autowired
	UserMapper UserMapper;
	@Autowired
	UserinfoMapper UserinfoMapper;
	@Autowired
	BlogMapper BlogMapper;
	@Autowired
	userserviceimpl userserviceimpl;
	@Autowired
	FocusMapper focusmapper;
	//添加关注关系
	public void focus(int userid,int otherid){
		Focus focus = new Focus();
		focus.setFocusUserid(userid);
		focus.setFocusFocusid(otherid);
		focusmapper.insert(focus);
	}
	//查询我关注的人
	public List<User> queryfocususer(int userid){
		FocusExample focusexample = new FocusExample();
		FocusExample.Criteria
		focusCriteria=focusexample.createCriteria();
		focusCriteria.andFocusUseridEqualTo(userid);
		List<Focus> focuss = this.focusmapper.selectByExample(focusexample);
		List<User> focususers = new ArrayList<User>();
		for(int i=0;i<focuss.size();i++){
			int otherid = focuss.get(i).getFocusFocusid();
			User other = userserviceimpl.serchuserbyid(otherid);
			focususers.add(other);
		}
		return focususers;
	}
}
