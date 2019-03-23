package com.hblog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.hblog.bean.Message;
import com.hblog.bean.MessageExample;
import com.hblog.mapper.BlogMapper;
import com.hblog.mapper.FocusMapper;
import com.hblog.mapper.MessageMapper;
import com.hblog.mapper.UserMapper;
import com.hblog.mapper.UserinfoMapper;
import com.hblog.util.gettime;

@Service("messageserviceimpl")
@Scope("prototype")
public class messageserviceimpl {
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
	@Autowired
	MessageMapper messagemapper;
	@Autowired
	Message message;
	@Autowired
	gettime gettime;
	/*查询双方聊天记录*/
	public List<Message> getchatrecord(int userid,int otherid){
		MessageExample messageexample = new MessageExample();
		MessageExample.Criteria
		messageCriteria=messageexample.createCriteria();
		messageCriteria.andSendIdEqualTo(userid);
		messageCriteria.andReceiveIdEqualTo(otherid);
		List<Message> messages = this.messagemapper.selectByExample(messageexample);
		return messages;
	}
	/*查询一个user有多少个other*/
	public List<Message> getcontactlist(int userid){
		List<Message> contacts = this.messagemapper.querycontactlist(userid);
		return contacts;
	}
	/*增加聊天记录（一条*/
	public void insertchatrecord(Message message){
		message.setMessageTime(gettime.getWebsiteDatetime());
		this.messagemapper.insert(message);
	}
}
