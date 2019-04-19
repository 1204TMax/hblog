                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       package com.hblog.service.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hblog.bean.User;
import com.hblog.bean.UserExample;
import com.hblog.bean.Userinfo;
import com.hblog.bean.UserinfoExample;
import com.hblog.mapper.MessageMapper;
import com.hblog.mapper.UserMapper;
import com.hblog.mapper.UserinfoMapper;
import com.hblog.service.userservice;

@Service
@Scope("prototype")
@Transactional
public class userserviceimpl implements userservice{
	@Autowired
	UserMapper UserMapper;
	@Autowired
	UserinfoMapper UserinfoMapper;
	@Autowired
	MessageMapper messagemapper;
	//查询所有用户
	public List<User> selectalluser() {
		UserExample userexample = new UserExample();
		UserExample.Criteria
		userCriteria=userexample.createCriteria();
		userCriteria.andUserIdIsNotNull();
		return this.UserMapper.selectByExample(userexample);
	}
	
	//根据name查询用户User
		@RequestMapping("/serchuserbyname")
		public User serchuserbyname(String username) {
			UserExample userexample = new UserExample();
			UserExample.Criteria
			userCriteria=userexample.createCriteria();
			userCriteria.andUserNameEqualTo(username);
			User user = this.UserMapper.selectByExample(userexample).get(0);
			return user;
		}
		
		//根据id查询用户User
				@RequestMapping("/serchuserbyid")
				public User serchuserbyid(int userid) {
					User user = this.UserMapper.selectByPrimaryKey(userid);
					return user;
				}
	//注册
	@Override
	public String insert(User user) {
		UserExample userexample = new UserExample();
		UserExample.Criteria
		userCriteria=userexample.createCriteria();
		userCriteria.andUserNameEqualTo(user.getUserName());
		if(this.UserMapper.selectByExample(userexample).isEmpty()){
			UserMapper.insert(user);
			return "success";
		}
		else{
			return "error";
		}
	}
	
	//增加用户详细信息
		public void insertuserinfo(Userinfo userinfo) {
			UserinfoMapper.insert(userinfo);
		}
		
	//登录
	public String login(User user){
		UserExample userexample = new UserExample();
		UserExample.Criteria
		userCriteria=userexample.createCriteria();
		userCriteria.andUserNameEqualTo(user.getUserName());
		List<User> users = this.UserMapper.selectByExample(userexample);
		if(users.size() != 0){
			User user1 = this.UserMapper.selectByExample(userexample).get(0);
			int userid = user1.getUserId();
			String userId=String.valueOf(userid);
			String pwd = user1.getUserPwd();
			if(pwd.equals(user.getUserPwd())){
				return userId;
			}else {
				return "pwderror" ;
			}
		}else{
			return "nameerror";
		}
	}
	//验证用户是否存在
	public String serchuser(User user){
		UserExample userexample = new UserExample();
		UserExample.Criteria
		userCriteria=userexample.createCriteria();
		userCriteria.andUserNameEqualTo(user.getUserName());
		List<User> users = this.UserMapper.selectByExample(userexample);
		if(users.size() != 0){
			User user1 = this.UserMapper.selectByExample(userexample).get(0);
			int userid = user1.getUserId();
			String userId=String.valueOf(userid);
			String pwd = user1.getUserPwd();
			if(pwd.equals(user.getUserPwd())){
				return userId;
			}else{
				return userId;
			}
		}else{
			return "nameerror";
		}
	}
	//头像地址上传数据库
	public void insertheadimg(String path,int userid){
		 int userinfoid = querybyid(userid);
		 //把路径属性加到已存在的userinfo对象身上
		Userinfo userinfo = queryinfobyid(userinfoid);
		userinfo.setUserHeadimageSrc(path);
		this.UserinfoMapper.updateByPrimaryKey(userinfo);
	}
	//根据userid查询userinfoid
	public int querybyid(int userid){
		UserinfoExample userinfoexample = new UserinfoExample();
		UserinfoExample.Criteria
		userinfoCriteria=userinfoexample.createCriteria();
		userinfoCriteria.andUserIdEqualTo(userid);
		List<Userinfo> userinfos = UserinfoMapper.selectByExample(userinfoexample);
		System.err.println("err:"+userinfos);
		int userinfoid = userinfos.get(0).getUserinfoId();
		return userinfoid;
	}
	//根据userinfoid查询userinfo对象
	public Userinfo queryinfobyid(int userinfoid){
		 Userinfo userinfo = UserinfoMapper.selectByPrimaryKey(userinfoid);
		return userinfo;
	}
	//根据userid查询他的头像路径
	public String queryheadimgsrc(int userid){
		int userinfoid = querybyid(userid);
		Userinfo userinfo = queryinfobyid(userinfoid);
		String userheadimgsrc = userinfo.getUserHeadimageSrc();
		return userheadimgsrc;
	}
	//根据userid查询userinfo对象
	public Userinfo queryuserinfobyuserid(int userid){
		int userinfoid = querybyid(userid);
		Userinfo userinfo = queryinfobyid(userinfoid);
		return userinfo;
	}
	//修改userinfo资料
	public void updateuserinfo(Userinfo userinfo){
		UserinfoMapper.updateByPrimaryKey(userinfo);
	}
	//增加user的上一次登录时间
	public void updateusertimebyid(int userid,String time){
		User user = serchuserbyid(userid);
		user.setUserHistoryloginTime(time);
		UserMapper.updateByPrimaryKey(user);
	}
	//增加user的注册登录时间
	public void updateuserregistertimebyid(int userid,String time){
		User user = serchuserbyid(userid);
		user.setUserRegisterTime(time);
		UserMapper.updateByPrimaryKey(user);
	}
	//查询用户总数量
	public int countuser() {
		UserExample userexample = new UserExample();
		UserExample.Criteria
		userCriteria=userexample.createCriteria();
		int countuser = (int) UserMapper.countByExample(userexample);
		System.err.println("用户总数量："+countuser);
		return countuser;
	}
	//根据页码查询user
	public List<User> serchuserbypage(int page){
		int head = page;
		int foot;
		if(page==5){
			foot = page*10;
		}else{
			foot = page*10-1;
		}
		List<User> users = this.UserMapper.serchuserbypage(head,foot);
		return users;
	}
	//删除用户
	public void deluser(HttpServletRequest request){
		int userid = Integer.parseInt(request.getParameter("userid"));
		this.UserMapper.deleteByPrimaryKey(userid);
	}
}
