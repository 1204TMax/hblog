package com.hblog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hblog.bean.Focus;
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
}
