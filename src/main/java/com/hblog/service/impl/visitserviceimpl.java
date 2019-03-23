package com.hblog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hblog.bean.Visit;
import com.hblog.mapper.BlogMapper;
import com.hblog.mapper.UserMapper;
import com.hblog.mapper.UserinfoMapper;
import com.hblog.mapper.VisitMapper;

@Service
@Scope("prototype")
@Transactional
public class visitserviceimpl {
	@Autowired
	VisitMapper VisitMapper;
	@Autowired
	Visit visit;
	//增加一次访问量
	public void addvisit(){
		System.err.println("1");
		visit = VisitMapper.selectByPrimaryKey(1);
		int localvisit = Integer.parseInt(visit.getVisit());
		int nowvisit = localvisit+1;
		String nowvisit2=String.valueOf(nowvisit);
		visit.setVisit(nowvisit2);
		VisitMapper.updateByPrimaryKey(visit);
	}
}
