package com.hblog.service;

import java.util.List;

import com.hblog.bean.User;
import com.hblog.bean.UserExample;

public interface userservice {
	
	List<User> selectalluser();
	
	String insert(User record);

}
