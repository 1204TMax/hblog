package com.hblog.bean;

public class BlogComment {
    private Integer blogCommentId;

    private Integer commentUserId;

    private Integer commentBlogId;

    private String blogCommentContent;

    private Integer fatherCommentId;

    private Integer fabulous;

    private String username;

    private String commenttime;

    private String userimg;

    public Integer getBlogCommentId() {
        return blogCommentId;
    }

    public void setBlogCommentId(Integer blogCommentId) {
        this.blogCommentId = blogCommentId;
    }

    public Integer getCommentUserId() {
        return commentUserId;
    }

    public void setCommentUserId(Integer commentUserId) {
        this.commentUserId = commentUserId;
    }

    public Integer getCommentBlogId() {
        return commentBlogId;
    }

    public void setCommentBlogId(Integer commentBlogId) {
        this.commentBlogId = commentBlogId;
    }

    public String getBlogCommentContent() {
        return blogCommentContent;
    }

    public void setBlogCommentContent(String blogCommentContent) {
        this.blogCommentContent = blogCommentContent == null ? null : blogCommentContent.trim();
    }

    public Integer getFatherCommentId() {
        return fatherCommentId;
    }

    public void setFatherCommentId(Integer fatherCommentId) {
        this.fatherCommentId = fatherCommentId;
    }

    public Integer getFabulous() {
        return fabulous;
    }

    public void setFabulous(Integer fabulous) {
        this.fabulous = fabulous;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getCommenttime() {
        return commenttime;
    }

    public void setCommenttime(String commenttime) {
        this.commenttime = commenttime == null ? null : commenttime.trim();
    }

    public String getUserimg() {
        return userimg;
    }

    public void setUserimg(String userimg) {
        this.userimg = userimg == null ? null : userimg.trim();
    }
}