package com.hblog.bean;

import java.util.List;

public class page {
	private int pageNum = 1; //当前页码
	private int pagesize = 10; //每页记录条数
	private int totalcount; //总记录条数
	private int totalpage; //总页数
	private int start; //开始
	private int end; //结束
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getPagesize() {
		return pagesize;
	}
	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
	}
	public int getTotalcount() {
		return totalcount;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public void setTotalcount(int totalcount) {
		this.totalcount = totalcount;
	}
	public int getTotalpage() {
		return totalpage;
	}
	public void setTotalpage(int totalpage) {
		this.totalpage = totalpage;
	}
	public List<Blog> getBloglistt() {
		return bloglistt;
	}
	public void setBloglistt(List<Blog> bloglistt) {
		this.bloglistt = bloglistt;
	}
	private List<Blog> bloglistt; //当前页需要的数据
	
}
