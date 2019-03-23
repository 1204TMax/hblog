package com.hblog.bean;

import java.util.ArrayList;
import java.util.List;

public class BlogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlogExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andBlogIdIsNull() {
            addCriterion("blog_id is null");
            return (Criteria) this;
        }

        public Criteria andBlogIdIsNotNull() {
            addCriterion("blog_id is not null");
            return (Criteria) this;
        }

        public Criteria andBlogIdEqualTo(Integer value) {
            addCriterion("blog_id =", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdNotEqualTo(Integer value) {
            addCriterion("blog_id <>", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdGreaterThan(Integer value) {
            addCriterion("blog_id >", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("blog_id >=", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdLessThan(Integer value) {
            addCriterion("blog_id <", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdLessThanOrEqualTo(Integer value) {
            addCriterion("blog_id <=", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdIn(List<Integer> values) {
            addCriterion("blog_id in", values, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdNotIn(List<Integer> values) {
            addCriterion("blog_id not in", values, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdBetween(Integer value1, Integer value2) {
            addCriterion("blog_id between", value1, value2, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdNotBetween(Integer value1, Integer value2) {
            addCriterion("blog_id not between", value1, value2, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogUserIdIsNull() {
            addCriterion("blog_user_id is null");
            return (Criteria) this;
        }

        public Criteria andBlogUserIdIsNotNull() {
            addCriterion("blog_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andBlogUserIdEqualTo(Integer value) {
            addCriterion("blog_user_id =", value, "blogUserId");
            return (Criteria) this;
        }

        public Criteria andBlogUserIdNotEqualTo(Integer value) {
            addCriterion("blog_user_id <>", value, "blogUserId");
            return (Criteria) this;
        }

        public Criteria andBlogUserIdGreaterThan(Integer value) {
            addCriterion("blog_user_id >", value, "blogUserId");
            return (Criteria) this;
        }

        public Criteria andBlogUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("blog_user_id >=", value, "blogUserId");
            return (Criteria) this;
        }

        public Criteria andBlogUserIdLessThan(Integer value) {
            addCriterion("blog_user_id <", value, "blogUserId");
            return (Criteria) this;
        }

        public Criteria andBlogUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("blog_user_id <=", value, "blogUserId");
            return (Criteria) this;
        }

        public Criteria andBlogUserIdIn(List<Integer> values) {
            addCriterion("blog_user_id in", values, "blogUserId");
            return (Criteria) this;
        }

        public Criteria andBlogUserIdNotIn(List<Integer> values) {
            addCriterion("blog_user_id not in", values, "blogUserId");
            return (Criteria) this;
        }

        public Criteria andBlogUserIdBetween(Integer value1, Integer value2) {
            addCriterion("blog_user_id between", value1, value2, "blogUserId");
            return (Criteria) this;
        }

        public Criteria andBlogUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("blog_user_id not between", value1, value2, "blogUserId");
            return (Criteria) this;
        }

        public Criteria andBlogTitleIsNull() {
            addCriterion("blog_title is null");
            return (Criteria) this;
        }

        public Criteria andBlogTitleIsNotNull() {
            addCriterion("blog_title is not null");
            return (Criteria) this;
        }

        public Criteria andBlogTitleEqualTo(String value) {
            addCriterion("blog_title =", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleNotEqualTo(String value) {
            addCriterion("blog_title <>", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleGreaterThan(String value) {
            addCriterion("blog_title >", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleGreaterThanOrEqualTo(String value) {
            addCriterion("blog_title >=", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleLessThan(String value) {
            addCriterion("blog_title <", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleLessThanOrEqualTo(String value) {
            addCriterion("blog_title <=", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleLike(String value) {
            addCriterion("blog_title like", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleNotLike(String value) {
            addCriterion("blog_title not like", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleIn(List<String> values) {
            addCriterion("blog_title in", values, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleNotIn(List<String> values) {
            addCriterion("blog_title not in", values, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleBetween(String value1, String value2) {
            addCriterion("blog_title between", value1, value2, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleNotBetween(String value1, String value2) {
            addCriterion("blog_title not between", value1, value2, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogAuthorIsNull() {
            addCriterion("blog_author is null");
            return (Criteria) this;
        }

        public Criteria andBlogAuthorIsNotNull() {
            addCriterion("blog_author is not null");
            return (Criteria) this;
        }

        public Criteria andBlogAuthorEqualTo(String value) {
            addCriterion("blog_author =", value, "blogAuthor");
            return (Criteria) this;
        }

        public Criteria andBlogAuthorNotEqualTo(String value) {
            addCriterion("blog_author <>", value, "blogAuthor");
            return (Criteria) this;
        }

        public Criteria andBlogAuthorGreaterThan(String value) {
            addCriterion("blog_author >", value, "blogAuthor");
            return (Criteria) this;
        }

        public Criteria andBlogAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("blog_author >=", value, "blogAuthor");
            return (Criteria) this;
        }

        public Criteria andBlogAuthorLessThan(String value) {
            addCriterion("blog_author <", value, "blogAuthor");
            return (Criteria) this;
        }

        public Criteria andBlogAuthorLessThanOrEqualTo(String value) {
            addCriterion("blog_author <=", value, "blogAuthor");
            return (Criteria) this;
        }

        public Criteria andBlogAuthorLike(String value) {
            addCriterion("blog_author like", value, "blogAuthor");
            return (Criteria) this;
        }

        public Criteria andBlogAuthorNotLike(String value) {
            addCriterion("blog_author not like", value, "blogAuthor");
            return (Criteria) this;
        }

        public Criteria andBlogAuthorIn(List<String> values) {
            addCriterion("blog_author in", values, "blogAuthor");
            return (Criteria) this;
        }

        public Criteria andBlogAuthorNotIn(List<String> values) {
            addCriterion("blog_author not in", values, "blogAuthor");
            return (Criteria) this;
        }

        public Criteria andBlogAuthorBetween(String value1, String value2) {
            addCriterion("blog_author between", value1, value2, "blogAuthor");
            return (Criteria) this;
        }

        public Criteria andBlogAuthorNotBetween(String value1, String value2) {
            addCriterion("blog_author not between", value1, value2, "blogAuthor");
            return (Criteria) this;
        }

        public Criteria andBlogPublishTimeIsNull() {
            addCriterion("blog_publish_time is null");
            return (Criteria) this;
        }

        public Criteria andBlogPublishTimeIsNotNull() {
            addCriterion("blog_publish_time is not null");
            return (Criteria) this;
        }

        public Criteria andBlogPublishTimeEqualTo(String value) {
            addCriterion("blog_publish_time =", value, "blogPublishTime");
            return (Criteria) this;
        }

        public Criteria andBlogPublishTimeNotEqualTo(String value) {
            addCriterion("blog_publish_time <>", value, "blogPublishTime");
            return (Criteria) this;
        }

        public Criteria andBlogPublishTimeGreaterThan(String value) {
            addCriterion("blog_publish_time >", value, "blogPublishTime");
            return (Criteria) this;
        }

        public Criteria andBlogPublishTimeGreaterThanOrEqualTo(String value) {
            addCriterion("blog_publish_time >=", value, "blogPublishTime");
            return (Criteria) this;
        }

        public Criteria andBlogPublishTimeLessThan(String value) {
            addCriterion("blog_publish_time <", value, "blogPublishTime");
            return (Criteria) this;
        }

        public Criteria andBlogPublishTimeLessThanOrEqualTo(String value) {
            addCriterion("blog_publish_time <=", value, "blogPublishTime");
            return (Criteria) this;
        }

        public Criteria andBlogPublishTimeLike(String value) {
            addCriterion("blog_publish_time like", value, "blogPublishTime");
            return (Criteria) this;
        }

        public Criteria andBlogPublishTimeNotLike(String value) {
            addCriterion("blog_publish_time not like", value, "blogPublishTime");
            return (Criteria) this;
        }

        public Criteria andBlogPublishTimeIn(List<String> values) {
            addCriterion("blog_publish_time in", values, "blogPublishTime");
            return (Criteria) this;
        }

        public Criteria andBlogPublishTimeNotIn(List<String> values) {
            addCriterion("blog_publish_time not in", values, "blogPublishTime");
            return (Criteria) this;
        }

        public Criteria andBlogPublishTimeBetween(String value1, String value2) {
            addCriterion("blog_publish_time between", value1, value2, "blogPublishTime");
            return (Criteria) this;
        }

        public Criteria andBlogPublishTimeNotBetween(String value1, String value2) {
            addCriterion("blog_publish_time not between", value1, value2, "blogPublishTime");
            return (Criteria) this;
        }

        public Criteria andBlogPraiseIsNull() {
            addCriterion("blog_praise is null");
            return (Criteria) this;
        }

        public Criteria andBlogPraiseIsNotNull() {
            addCriterion("blog_praise is not null");
            return (Criteria) this;
        }

        public Criteria andBlogPraiseEqualTo(Integer value) {
            addCriterion("blog_praise =", value, "blogPraise");
            return (Criteria) this;
        }

        public Criteria andBlogPraiseNotEqualTo(Integer value) {
            addCriterion("blog_praise <>", value, "blogPraise");
            return (Criteria) this;
        }

        public Criteria andBlogPraiseGreaterThan(Integer value) {
            addCriterion("blog_praise >", value, "blogPraise");
            return (Criteria) this;
        }

        public Criteria andBlogPraiseGreaterThanOrEqualTo(Integer value) {
            addCriterion("blog_praise >=", value, "blogPraise");
            return (Criteria) this;
        }

        public Criteria andBlogPraiseLessThan(Integer value) {
            addCriterion("blog_praise <", value, "blogPraise");
            return (Criteria) this;
        }

        public Criteria andBlogPraiseLessThanOrEqualTo(Integer value) {
            addCriterion("blog_praise <=", value, "blogPraise");
            return (Criteria) this;
        }

        public Criteria andBlogPraiseIn(List<Integer> values) {
            addCriterion("blog_praise in", values, "blogPraise");
            return (Criteria) this;
        }

        public Criteria andBlogPraiseNotIn(List<Integer> values) {
            addCriterion("blog_praise not in", values, "blogPraise");
            return (Criteria) this;
        }

        public Criteria andBlogPraiseBetween(Integer value1, Integer value2) {
            addCriterion("blog_praise between", value1, value2, "blogPraise");
            return (Criteria) this;
        }

        public Criteria andBlogPraiseNotBetween(Integer value1, Integer value2) {
            addCriterion("blog_praise not between", value1, value2, "blogPraise");
            return (Criteria) this;
        }

        public Criteria andBlogCommentIsNull() {
            addCriterion("blog_comment is null");
            return (Criteria) this;
        }

        public Criteria andBlogCommentIsNotNull() {
            addCriterion("blog_comment is not null");
            return (Criteria) this;
        }

        public Criteria andBlogCommentEqualTo(String value) {
            addCriterion("blog_comment =", value, "blogComment");
            return (Criteria) this;
        }

        public Criteria andBlogCommentNotEqualTo(String value) {
            addCriterion("blog_comment <>", value, "blogComment");
            return (Criteria) this;
        }

        public Criteria andBlogCommentGreaterThan(String value) {
            addCriterion("blog_comment >", value, "blogComment");
            return (Criteria) this;
        }

        public Criteria andBlogCommentGreaterThanOrEqualTo(String value) {
            addCriterion("blog_comment >=", value, "blogComment");
            return (Criteria) this;
        }

        public Criteria andBlogCommentLessThan(String value) {
            addCriterion("blog_comment <", value, "blogComment");
            return (Criteria) this;
        }

        public Criteria andBlogCommentLessThanOrEqualTo(String value) {
            addCriterion("blog_comment <=", value, "blogComment");
            return (Criteria) this;
        }

        public Criteria andBlogCommentLike(String value) {
            addCriterion("blog_comment like", value, "blogComment");
            return (Criteria) this;
        }

        public Criteria andBlogCommentNotLike(String value) {
            addCriterion("blog_comment not like", value, "blogComment");
            return (Criteria) this;
        }

        public Criteria andBlogCommentIn(List<String> values) {
            addCriterion("blog_comment in", values, "blogComment");
            return (Criteria) this;
        }

        public Criteria andBlogCommentNotIn(List<String> values) {
            addCriterion("blog_comment not in", values, "blogComment");
            return (Criteria) this;
        }

        public Criteria andBlogCommentBetween(String value1, String value2) {
            addCriterion("blog_comment between", value1, value2, "blogComment");
            return (Criteria) this;
        }

        public Criteria andBlogCommentNotBetween(String value1, String value2) {
            addCriterion("blog_comment not between", value1, value2, "blogComment");
            return (Criteria) this;
        }

        public Criteria andBlogBrowseTimesIsNull() {
            addCriterion("blog_browse_times is null");
            return (Criteria) this;
        }

        public Criteria andBlogBrowseTimesIsNotNull() {
            addCriterion("blog_browse_times is not null");
            return (Criteria) this;
        }

        public Criteria andBlogBrowseTimesEqualTo(Integer value) {
            addCriterion("blog_browse_times =", value, "blogBrowseTimes");
            return (Criteria) this;
        }

        public Criteria andBlogBrowseTimesNotEqualTo(Integer value) {
            addCriterion("blog_browse_times <>", value, "blogBrowseTimes");
            return (Criteria) this;
        }

        public Criteria andBlogBrowseTimesGreaterThan(Integer value) {
            addCriterion("blog_browse_times >", value, "blogBrowseTimes");
            return (Criteria) this;
        }

        public Criteria andBlogBrowseTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("blog_browse_times >=", value, "blogBrowseTimes");
            return (Criteria) this;
        }

        public Criteria andBlogBrowseTimesLessThan(Integer value) {
            addCriterion("blog_browse_times <", value, "blogBrowseTimes");
            return (Criteria) this;
        }

        public Criteria andBlogBrowseTimesLessThanOrEqualTo(Integer value) {
            addCriterion("blog_browse_times <=", value, "blogBrowseTimes");
            return (Criteria) this;
        }

        public Criteria andBlogBrowseTimesIn(List<Integer> values) {
            addCriterion("blog_browse_times in", values, "blogBrowseTimes");
            return (Criteria) this;
        }

        public Criteria andBlogBrowseTimesNotIn(List<Integer> values) {
            addCriterion("blog_browse_times not in", values, "blogBrowseTimes");
            return (Criteria) this;
        }

        public Criteria andBlogBrowseTimesBetween(Integer value1, Integer value2) {
            addCriterion("blog_browse_times between", value1, value2, "blogBrowseTimes");
            return (Criteria) this;
        }

        public Criteria andBlogBrowseTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("blog_browse_times not between", value1, value2, "blogBrowseTimes");
            return (Criteria) this;
        }

        public Criteria andBlogImageSrcIsNull() {
            addCriterion("blog_image_src is null");
            return (Criteria) this;
        }

        public Criteria andBlogImageSrcIsNotNull() {
            addCriterion("blog_image_src is not null");
            return (Criteria) this;
        }

        public Criteria andBlogImageSrcEqualTo(String value) {
            addCriterion("blog_image_src =", value, "blogImageSrc");
            return (Criteria) this;
        }

        public Criteria andBlogImageSrcNotEqualTo(String value) {
            addCriterion("blog_image_src <>", value, "blogImageSrc");
            return (Criteria) this;
        }

        public Criteria andBlogImageSrcGreaterThan(String value) {
            addCriterion("blog_image_src >", value, "blogImageSrc");
            return (Criteria) this;
        }

        public Criteria andBlogImageSrcGreaterThanOrEqualTo(String value) {
            addCriterion("blog_image_src >=", value, "blogImageSrc");
            return (Criteria) this;
        }

        public Criteria andBlogImageSrcLessThan(String value) {
            addCriterion("blog_image_src <", value, "blogImageSrc");
            return (Criteria) this;
        }

        public Criteria andBlogImageSrcLessThanOrEqualTo(String value) {
            addCriterion("blog_image_src <=", value, "blogImageSrc");
            return (Criteria) this;
        }

        public Criteria andBlogImageSrcLike(String value) {
            addCriterion("blog_image_src like", value, "blogImageSrc");
            return (Criteria) this;
        }

        public Criteria andBlogImageSrcNotLike(String value) {
            addCriterion("blog_image_src not like", value, "blogImageSrc");
            return (Criteria) this;
        }

        public Criteria andBlogImageSrcIn(List<String> values) {
            addCriterion("blog_image_src in", values, "blogImageSrc");
            return (Criteria) this;
        }

        public Criteria andBlogImageSrcNotIn(List<String> values) {
            addCriterion("blog_image_src not in", values, "blogImageSrc");
            return (Criteria) this;
        }

        public Criteria andBlogImageSrcBetween(String value1, String value2) {
            addCriterion("blog_image_src between", value1, value2, "blogImageSrc");
            return (Criteria) this;
        }

        public Criteria andBlogImageSrcNotBetween(String value1, String value2) {
            addCriterion("blog_image_src not between", value1, value2, "blogImageSrc");
            return (Criteria) this;
        }

        public Criteria andBlogContentIsNull() {
            addCriterion("blog_content is null");
            return (Criteria) this;
        }

        public Criteria andBlogContentIsNotNull() {
            addCriterion("blog_content is not null");
            return (Criteria) this;
        }

        public Criteria andBlogContentEqualTo(String value) {
            addCriterion("blog_content =", value, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentNotEqualTo(String value) {
            addCriterion("blog_content <>", value, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentGreaterThan(String value) {
            addCriterion("blog_content >", value, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentGreaterThanOrEqualTo(String value) {
            addCriterion("blog_content >=", value, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentLessThan(String value) {
            addCriterion("blog_content <", value, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentLessThanOrEqualTo(String value) {
            addCriterion("blog_content <=", value, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentLike(String value) {
            addCriterion("blog_content like", value, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentNotLike(String value) {
            addCriterion("blog_content not like", value, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentIn(List<String> values) {
            addCriterion("blog_content in", values, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentNotIn(List<String> values) {
            addCriterion("blog_content not in", values, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentBetween(String value1, String value2) {
            addCriterion("blog_content between", value1, value2, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentNotBetween(String value1, String value2) {
            addCriterion("blog_content not between", value1, value2, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogPublishPlaceIsNull() {
            addCriterion("blog_publish_place is null");
            return (Criteria) this;
        }

        public Criteria andBlogPublishPlaceIsNotNull() {
            addCriterion("blog_publish_place is not null");
            return (Criteria) this;
        }

        public Criteria andBlogPublishPlaceEqualTo(String value) {
            addCriterion("blog_publish_place =", value, "blogPublishPlace");
            return (Criteria) this;
        }

        public Criteria andBlogPublishPlaceNotEqualTo(String value) {
            addCriterion("blog_publish_place <>", value, "blogPublishPlace");
            return (Criteria) this;
        }

        public Criteria andBlogPublishPlaceGreaterThan(String value) {
            addCriterion("blog_publish_place >", value, "blogPublishPlace");
            return (Criteria) this;
        }

        public Criteria andBlogPublishPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("blog_publish_place >=", value, "blogPublishPlace");
            return (Criteria) this;
        }

        public Criteria andBlogPublishPlaceLessThan(String value) {
            addCriterion("blog_publish_place <", value, "blogPublishPlace");
            return (Criteria) this;
        }

        public Criteria andBlogPublishPlaceLessThanOrEqualTo(String value) {
            addCriterion("blog_publish_place <=", value, "blogPublishPlace");
            return (Criteria) this;
        }

        public Criteria andBlogPublishPlaceLike(String value) {
            addCriterion("blog_publish_place like", value, "blogPublishPlace");
            return (Criteria) this;
        }

        public Criteria andBlogPublishPlaceNotLike(String value) {
            addCriterion("blog_publish_place not like", value, "blogPublishPlace");
            return (Criteria) this;
        }

        public Criteria andBlogPublishPlaceIn(List<String> values) {
            addCriterion("blog_publish_place in", values, "blogPublishPlace");
            return (Criteria) this;
        }

        public Criteria andBlogPublishPlaceNotIn(List<String> values) {
            addCriterion("blog_publish_place not in", values, "blogPublishPlace");
            return (Criteria) this;
        }

        public Criteria andBlogPublishPlaceBetween(String value1, String value2) {
            addCriterion("blog_publish_place between", value1, value2, "blogPublishPlace");
            return (Criteria) this;
        }

        public Criteria andBlogPublishPlaceNotBetween(String value1, String value2) {
            addCriterion("blog_publish_place not between", value1, value2, "blogPublishPlace");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}