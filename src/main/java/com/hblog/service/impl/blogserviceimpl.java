package com.hblog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hblog.mapper.UserMapper;
import com.hblog.mapper.UserinfoMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hblog.bean.Blog;
import com.hblog.bean.BlogExample;
import com.hblog.bean.User;
import com.hblog.bean.UserExample;
import com.hblog.mapper.BlogMapper;

@Service
@Scope("prototype")
@Transactional
public class blogserviceimpl {
	@Autowired
	UserMapper UserMapper;
	@Autowired
	UserinfoMapper UserinfoMapper;
	@Autowired
	BlogMapper BlogMapper;
	@Autowired
	userserviceimpl userserviceimpl;
	// 上传blog
	public void uploadblog(Blog blog) {
		this.BlogMapper.insert(blog);
	}

	// 查询所有blog
	public List<Blog> serchallblog() {
		BlogExample blogexample = new BlogExample();
		BlogExample.Criteria blogCriteria = blogexample.createCriteria();
		blogCriteria.andBlogIdIsNotNull();
		List<Blog> blogs = this.BlogMapper.selectByExample(blogexample);
		return blogs;
	}

	// index分页
	public List<Blog> getList(int page) throws Exception {
		int start = 1;// 第几条记录开始查询
		int end = 1;// 第几条记录结束查询
		int record = 10;// 每页的记录数
		int blogcount = getblogcount();//总记录条数
		int pagecount = getpagecount();
		if (page < pagecount) {// 不是最后一页
			if(page==1){
				start = 0;
			}else{
				start = page * record;
			}
			end = start + 10;
		} else {// 是最后一页
			if(page==1){
				start = 0;
			}else{
				start = page * record;
			}
			end = start + blogcount % 10;
		}
		List<Blog> bloglist = this.BlogMapper.getlist(start, end);
		return bloglist;
	}
	//同城页面分页
	public List<Blog> getsamecityList(int page,String cityname) throws Exception {
		int start = 1;// 第几条记录开始查询
		int end = 1;// 第几条记录结束查询
		int record = 10;// 每页的记录数
		int blogcount = getblogcount();//总记录条数
		int pagecount = getpagecount();
		if (page < pagecount) {// 不是最后一页
			if(page==1){
				start = 0;
			}else{
				start = page * record;
			}
			end = start + 10;
		} else {// 是最后一页
			if(page==1){
				start = 0;
			}else{
				start = page * record;
			}
			end = start + blogcount % 10;
		}
		List<Blog> bloglist = this.BlogMapper.getsamecitylist(cityname,start, end);
		return bloglist;
	}
//用户主页分页
	public List<Blog> peopleList(int page,String userName) throws Exception {
		int start = 1;// 第几条记录开始查询
		int end = 1;// 第几条记录结束查询
		int record = 10;// 每页的记录数
		int blogcount = getpeoplecount(userName);//总记录条数
		int pagecount = getpagecount();
		if (page < pagecount) {// 不是最后一页
			if(page==1){
				start = 0;
			}else{
				start = page * record;
			}
			end = start + 10;
		} else {// 是最后一页
			if(page==1){
				start = 0;
			}else{
				start = page * record;
			}
			end = start + blogcount % 10;
		}
		List<Blog> bloglist = this.BlogMapper.peoplelist(userName,start, end);
		return bloglist;
	}
	//查询单个用户的总动态条数
	public int getpeoplecount(String userName){
		BlogExample blogexample = new BlogExample();
		BlogExample.Criteria blogCriteria = blogexample.createCriteria();
		blogCriteria.andBlogAuthorEqualTo(userName);
		int peopleblogcount = (int) this.BlogMapper.countByExample(blogexample);
		return peopleblogcount;
	}
	// 查询所有用户的总动态条数
	public int getblogcount() {
		// 查询总的记录条数
		BlogExample blogexample = new BlogExample();
		BlogExample.Criteria blogCriteria = blogexample.createCriteria();
		blogCriteria.andBlogIdIsNotNull();
		int blogcount = (int) this.BlogMapper.countByExample(blogexample);
		return blogcount;
	}

	// 查询index总页数
	public int getpagecount() {
		int pagecount;// 总页数
		pagecount = getblogcount() / 10;
		return pagecount;
	}
	// 查询单个用户总页数
		public int getpersonpagecount(String userName) {
			int personpagecount;// 总页数
			personpagecount = getpeoplecount(userName) / 10;
			return personpagecount;
		}
	//根据blogid查询blog
	public Blog queryblogbyblogid(int blogid){
		BlogExample blogexample = new BlogExample();
		BlogExample.Criteria blogCriteria = blogexample.createCriteria();
		blogCriteria.andBlogIdEqualTo(blogid);
		List<Blog> blogs =  this.BlogMapper.selectByExample(blogexample);
		Blog blog = blogs.get(0);
		return blog;
	}
	//根据blogid查询user
	public User queryuserbyblogid(int blogid){
		Blog blog = queryblogbyblogid(blogid);
		int userid = blog.getBlogUserId();
		User user = userserviceimpl.serchuserbyid(userid);
		return user;
	}
	//根据blogid删除blog
	public void delblogbyid(int blogid){
		BlogMapper.deleteByPrimaryKey(blogid);
	}
	//查询blog总数
public int countblog(){
	BlogExample blogexample = new BlogExample();
	BlogExample.Criteria blogCriteria = blogexample.createCriteria();
	int countblog =  (int) this.BlogMapper.countByExample(blogexample);
	return countblog;
}
//根据userid查询blog总数
public int countblogbyuserid(int userid){
	BlogExample blogexample = new BlogExample();
	BlogExample.Criteria blogCriteria = blogexample.createCriteria();
	blogCriteria.andBlogUserIdEqualTo(userid);
	int countblogbyuserid =  (int) this.BlogMapper.countByExample(blogexample);
	return countblogbyuserid;
}
//查询blog的总赞数量
public int counthert(int blogid){
	Blog blog  =  this.BlogMapper.selectByPrimaryKey(blogid);
	return blog.getBlogPraise();
}
//增加赞
public void addhert(Integer blogid){
	Blog blog = this.BlogMapper.selectByPrimaryKey(blogid);
	int localhert = blog.getBlogPraise();
	int nowhert = localhert +1;
	blog.setBlogPraise(nowhert);
	this.BlogMapper.updateByPrimaryKey(blog);
}
//取消赞
public void minushert(int blogid){
	Blog blog = this.BlogMapper.selectByPrimaryKey(blogid);
	int localhert = blog.getBlogPraise();
	int nowhert = localhert -1;
	blog.setBlogPraise(nowhert);
	this.BlogMapper.updateByPrimaryKey(blog);
}
//查询点赞最高的2条Blog
public List<Blog> gethotblog(){
	List<Blog> hotblogs = this.BlogMapper.gethotblogs();
	return hotblogs;
}
//根据页码查询blog(后台)
	public List<Blog> serchblogbypage(int page){
		int start = page;
		int end=page*10;
		List<Blog> blogs = this.BlogMapper.getlist(start,end);
		return blogs;
	}
}
