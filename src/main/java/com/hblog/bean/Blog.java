package com.hblog.bean;

public class Blog {
    private Integer blogId;

    private Integer blogUserId;

    private String blogTitle;

    private String blogAuthor;

    private String blogPublishTime;

    private Integer blogPraise;

    private String blogComment;

    private Integer blogBrowseTimes;

    private String blogImageSrc;

    private String blogContent;

    private String blogPublishPlace;

    public Integer getBlogId() {
        return blogId;
    }

    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }

    public Integer getBlogUserId() {
        return blogUserId;
    }

    public void setBlogUserId(Integer blogUserId) {
        this.blogUserId = blogUserId;
    }

    public String getBlogTitle() {
        return blogTitle;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle == null ? null : blogTitle.trim();
    }

    public String getBlogAuthor() {
        return blogAuthor;
    }

    public void setBlogAuthor(String blogAuthor) {
        this.blogAuthor = blogAuthor == null ? null : blogAuthor.trim();
    }

    public String getBlogPublishTime() {
        return blogPublishTime;
    }

    public void setBlogPublishTime(String blogPublishTime) {
        this.blogPublishTime = blogPublishTime == null ? null : blogPublishTime.trim();
    }

    public Integer getBlogPraise() {
        return blogPraise;
    }

    public void setBlogPraise(Integer blogPraise) {
        this.blogPraise = blogPraise;
    }

    public String getBlogComment() {
        return blogComment;
    }

    public void setBlogComment(String blogComment) {
        this.blogComment = blogComment == null ? null : blogComment.trim();
    }

    public Integer getBlogBrowseTimes() {
        return blogBrowseTimes;
    }

    public void setBlogBrowseTimes(Integer blogBrowseTimes) {
        this.blogBrowseTimes = blogBrowseTimes;
    }

    public String getBlogImageSrc() {
        return blogImageSrc;
    }

    public void setBlogImageSrc(String blogImageSrc) {
        this.blogImageSrc = blogImageSrc == null ? null : blogImageSrc.trim();
    }

    public String getBlogContent() {
        return blogContent;
    }

    public void setBlogContent(String blogContent) {
        this.blogContent = blogContent == null ? null : blogContent.trim();
    }

    public String getBlogPublishPlace() {
        return blogPublishPlace;
    }

    public void setBlogPublishPlace(String blogPublishPlace) {
        this.blogPublishPlace = blogPublishPlace == null ? null : blogPublishPlace.trim();
    }
}