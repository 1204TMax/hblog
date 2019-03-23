package com.hblog.bean;

import java.util.ArrayList;
import java.util.List;

public class BlogCommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlogCommentExample() {
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

        public Criteria andBlogCommentIdIsNull() {
            addCriterion("blog_comment_id is null");
            return (Criteria) this;
        }

        public Criteria andBlogCommentIdIsNotNull() {
            addCriterion("blog_comment_id is not null");
            return (Criteria) this;
        }

        public Criteria andBlogCommentIdEqualTo(Integer value) {
            addCriterion("blog_comment_id =", value, "blogCommentId");
            return (Criteria) this;
        }

        public Criteria andBlogCommentIdNotEqualTo(Integer value) {
            addCriterion("blog_comment_id <>", value, "blogCommentId");
            return (Criteria) this;
        }

        public Criteria andBlogCommentIdGreaterThan(Integer value) {
            addCriterion("blog_comment_id >", value, "blogCommentId");
            return (Criteria) this;
        }

        public Criteria andBlogCommentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("blog_comment_id >=", value, "blogCommentId");
            return (Criteria) this;
        }

        public Criteria andBlogCommentIdLessThan(Integer value) {
            addCriterion("blog_comment_id <", value, "blogCommentId");
            return (Criteria) this;
        }

        public Criteria andBlogCommentIdLessThanOrEqualTo(Integer value) {
            addCriterion("blog_comment_id <=", value, "blogCommentId");
            return (Criteria) this;
        }

        public Criteria andBlogCommentIdIn(List<Integer> values) {
            addCriterion("blog_comment_id in", values, "blogCommentId");
            return (Criteria) this;
        }

        public Criteria andBlogCommentIdNotIn(List<Integer> values) {
            addCriterion("blog_comment_id not in", values, "blogCommentId");
            return (Criteria) this;
        }

        public Criteria andBlogCommentIdBetween(Integer value1, Integer value2) {
            addCriterion("blog_comment_id between", value1, value2, "blogCommentId");
            return (Criteria) this;
        }

        public Criteria andBlogCommentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("blog_comment_id not between", value1, value2, "blogCommentId");
            return (Criteria) this;
        }

        public Criteria andCommentUserIdIsNull() {
            addCriterion("comment_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCommentUserIdIsNotNull() {
            addCriterion("comment_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommentUserIdEqualTo(Integer value) {
            addCriterion("comment_user_id =", value, "commentUserId");
            return (Criteria) this;
        }

        public Criteria andCommentUserIdNotEqualTo(Integer value) {
            addCriterion("comment_user_id <>", value, "commentUserId");
            return (Criteria) this;
        }

        public Criteria andCommentUserIdGreaterThan(Integer value) {
            addCriterion("comment_user_id >", value, "commentUserId");
            return (Criteria) this;
        }

        public Criteria andCommentUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_user_id >=", value, "commentUserId");
            return (Criteria) this;
        }

        public Criteria andCommentUserIdLessThan(Integer value) {
            addCriterion("comment_user_id <", value, "commentUserId");
            return (Criteria) this;
        }

        public Criteria andCommentUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("comment_user_id <=", value, "commentUserId");
            return (Criteria) this;
        }

        public Criteria andCommentUserIdIn(List<Integer> values) {
            addCriterion("comment_user_id in", values, "commentUserId");
            return (Criteria) this;
        }

        public Criteria andCommentUserIdNotIn(List<Integer> values) {
            addCriterion("comment_user_id not in", values, "commentUserId");
            return (Criteria) this;
        }

        public Criteria andCommentUserIdBetween(Integer value1, Integer value2) {
            addCriterion("comment_user_id between", value1, value2, "commentUserId");
            return (Criteria) this;
        }

        public Criteria andCommentUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_user_id not between", value1, value2, "commentUserId");
            return (Criteria) this;
        }

        public Criteria andCommentBlogIdIsNull() {
            addCriterion("comment_blog_id is null");
            return (Criteria) this;
        }

        public Criteria andCommentBlogIdIsNotNull() {
            addCriterion("comment_blog_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommentBlogIdEqualTo(Integer value) {
            addCriterion("comment_blog_id =", value, "commentBlogId");
            return (Criteria) this;
        }

        public Criteria andCommentBlogIdNotEqualTo(Integer value) {
            addCriterion("comment_blog_id <>", value, "commentBlogId");
            return (Criteria) this;
        }

        public Criteria andCommentBlogIdGreaterThan(Integer value) {
            addCriterion("comment_blog_id >", value, "commentBlogId");
            return (Criteria) this;
        }

        public Criteria andCommentBlogIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_blog_id >=", value, "commentBlogId");
            return (Criteria) this;
        }

        public Criteria andCommentBlogIdLessThan(Integer value) {
            addCriterion("comment_blog_id <", value, "commentBlogId");
            return (Criteria) this;
        }

        public Criteria andCommentBlogIdLessThanOrEqualTo(Integer value) {
            addCriterion("comment_blog_id <=", value, "commentBlogId");
            return (Criteria) this;
        }

        public Criteria andCommentBlogIdIn(List<Integer> values) {
            addCriterion("comment_blog_id in", values, "commentBlogId");
            return (Criteria) this;
        }

        public Criteria andCommentBlogIdNotIn(List<Integer> values) {
            addCriterion("comment_blog_id not in", values, "commentBlogId");
            return (Criteria) this;
        }

        public Criteria andCommentBlogIdBetween(Integer value1, Integer value2) {
            addCriterion("comment_blog_id between", value1, value2, "commentBlogId");
            return (Criteria) this;
        }

        public Criteria andCommentBlogIdNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_blog_id not between", value1, value2, "commentBlogId");
            return (Criteria) this;
        }

        public Criteria andBlogCommentContentIsNull() {
            addCriterion("blog_comment_content is null");
            return (Criteria) this;
        }

        public Criteria andBlogCommentContentIsNotNull() {
            addCriterion("blog_comment_content is not null");
            return (Criteria) this;
        }

        public Criteria andBlogCommentContentEqualTo(String value) {
            addCriterion("blog_comment_content =", value, "blogCommentContent");
            return (Criteria) this;
        }

        public Criteria andBlogCommentContentNotEqualTo(String value) {
            addCriterion("blog_comment_content <>", value, "blogCommentContent");
            return (Criteria) this;
        }

        public Criteria andBlogCommentContentGreaterThan(String value) {
            addCriterion("blog_comment_content >", value, "blogCommentContent");
            return (Criteria) this;
        }

        public Criteria andBlogCommentContentGreaterThanOrEqualTo(String value) {
            addCriterion("blog_comment_content >=", value, "blogCommentContent");
            return (Criteria) this;
        }

        public Criteria andBlogCommentContentLessThan(String value) {
            addCriterion("blog_comment_content <", value, "blogCommentContent");
            return (Criteria) this;
        }

        public Criteria andBlogCommentContentLessThanOrEqualTo(String value) {
            addCriterion("blog_comment_content <=", value, "blogCommentContent");
            return (Criteria) this;
        }

        public Criteria andBlogCommentContentLike(String value) {
            addCriterion("blog_comment_content like", value, "blogCommentContent");
            return (Criteria) this;
        }

        public Criteria andBlogCommentContentNotLike(String value) {
            addCriterion("blog_comment_content not like", value, "blogCommentContent");
            return (Criteria) this;
        }

        public Criteria andBlogCommentContentIn(List<String> values) {
            addCriterion("blog_comment_content in", values, "blogCommentContent");
            return (Criteria) this;
        }

        public Criteria andBlogCommentContentNotIn(List<String> values) {
            addCriterion("blog_comment_content not in", values, "blogCommentContent");
            return (Criteria) this;
        }

        public Criteria andBlogCommentContentBetween(String value1, String value2) {
            addCriterion("blog_comment_content between", value1, value2, "blogCommentContent");
            return (Criteria) this;
        }

        public Criteria andBlogCommentContentNotBetween(String value1, String value2) {
            addCriterion("blog_comment_content not between", value1, value2, "blogCommentContent");
            return (Criteria) this;
        }

        public Criteria andFatherCommentIdIsNull() {
            addCriterion("father_comment_id is null");
            return (Criteria) this;
        }

        public Criteria andFatherCommentIdIsNotNull() {
            addCriterion("father_comment_id is not null");
            return (Criteria) this;
        }

        public Criteria andFatherCommentIdEqualTo(Integer value) {
            addCriterion("father_comment_id =", value, "fatherCommentId");
            return (Criteria) this;
        }

        public Criteria andFatherCommentIdNotEqualTo(Integer value) {
            addCriterion("father_comment_id <>", value, "fatherCommentId");
            return (Criteria) this;
        }

        public Criteria andFatherCommentIdGreaterThan(Integer value) {
            addCriterion("father_comment_id >", value, "fatherCommentId");
            return (Criteria) this;
        }

        public Criteria andFatherCommentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("father_comment_id >=", value, "fatherCommentId");
            return (Criteria) this;
        }

        public Criteria andFatherCommentIdLessThan(Integer value) {
            addCriterion("father_comment_id <", value, "fatherCommentId");
            return (Criteria) this;
        }

        public Criteria andFatherCommentIdLessThanOrEqualTo(Integer value) {
            addCriterion("father_comment_id <=", value, "fatherCommentId");
            return (Criteria) this;
        }

        public Criteria andFatherCommentIdIn(List<Integer> values) {
            addCriterion("father_comment_id in", values, "fatherCommentId");
            return (Criteria) this;
        }

        public Criteria andFatherCommentIdNotIn(List<Integer> values) {
            addCriterion("father_comment_id not in", values, "fatherCommentId");
            return (Criteria) this;
        }

        public Criteria andFatherCommentIdBetween(Integer value1, Integer value2) {
            addCriterion("father_comment_id between", value1, value2, "fatherCommentId");
            return (Criteria) this;
        }

        public Criteria andFatherCommentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("father_comment_id not between", value1, value2, "fatherCommentId");
            return (Criteria) this;
        }

        public Criteria andFabulousIsNull() {
            addCriterion("fabulous is null");
            return (Criteria) this;
        }

        public Criteria andFabulousIsNotNull() {
            addCriterion("fabulous is not null");
            return (Criteria) this;
        }

        public Criteria andFabulousEqualTo(Integer value) {
            addCriterion("fabulous =", value, "fabulous");
            return (Criteria) this;
        }

        public Criteria andFabulousNotEqualTo(Integer value) {
            addCriterion("fabulous <>", value, "fabulous");
            return (Criteria) this;
        }

        public Criteria andFabulousGreaterThan(Integer value) {
            addCriterion("fabulous >", value, "fabulous");
            return (Criteria) this;
        }

        public Criteria andFabulousGreaterThanOrEqualTo(Integer value) {
            addCriterion("fabulous >=", value, "fabulous");
            return (Criteria) this;
        }

        public Criteria andFabulousLessThan(Integer value) {
            addCriterion("fabulous <", value, "fabulous");
            return (Criteria) this;
        }

        public Criteria andFabulousLessThanOrEqualTo(Integer value) {
            addCriterion("fabulous <=", value, "fabulous");
            return (Criteria) this;
        }

        public Criteria andFabulousIn(List<Integer> values) {
            addCriterion("fabulous in", values, "fabulous");
            return (Criteria) this;
        }

        public Criteria andFabulousNotIn(List<Integer> values) {
            addCriterion("fabulous not in", values, "fabulous");
            return (Criteria) this;
        }

        public Criteria andFabulousBetween(Integer value1, Integer value2) {
            addCriterion("fabulous between", value1, value2, "fabulous");
            return (Criteria) this;
        }

        public Criteria andFabulousNotBetween(Integer value1, Integer value2) {
            addCriterion("fabulous not between", value1, value2, "fabulous");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andCommenttimeIsNull() {
            addCriterion("commenttime is null");
            return (Criteria) this;
        }

        public Criteria andCommenttimeIsNotNull() {
            addCriterion("commenttime is not null");
            return (Criteria) this;
        }

        public Criteria andCommenttimeEqualTo(String value) {
            addCriterion("commenttime =", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeNotEqualTo(String value) {
            addCriterion("commenttime <>", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeGreaterThan(String value) {
            addCriterion("commenttime >", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeGreaterThanOrEqualTo(String value) {
            addCriterion("commenttime >=", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeLessThan(String value) {
            addCriterion("commenttime <", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeLessThanOrEqualTo(String value) {
            addCriterion("commenttime <=", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeLike(String value) {
            addCriterion("commenttime like", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeNotLike(String value) {
            addCriterion("commenttime not like", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeIn(List<String> values) {
            addCriterion("commenttime in", values, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeNotIn(List<String> values) {
            addCriterion("commenttime not in", values, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeBetween(String value1, String value2) {
            addCriterion("commenttime between", value1, value2, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeNotBetween(String value1, String value2) {
            addCriterion("commenttime not between", value1, value2, "commenttime");
            return (Criteria) this;
        }

        public Criteria andUserimgIsNull() {
            addCriterion("userimg is null");
            return (Criteria) this;
        }

        public Criteria andUserimgIsNotNull() {
            addCriterion("userimg is not null");
            return (Criteria) this;
        }

        public Criteria andUserimgEqualTo(String value) {
            addCriterion("userimg =", value, "userimg");
            return (Criteria) this;
        }

        public Criteria andUserimgNotEqualTo(String value) {
            addCriterion("userimg <>", value, "userimg");
            return (Criteria) this;
        }

        public Criteria andUserimgGreaterThan(String value) {
            addCriterion("userimg >", value, "userimg");
            return (Criteria) this;
        }

        public Criteria andUserimgGreaterThanOrEqualTo(String value) {
            addCriterion("userimg >=", value, "userimg");
            return (Criteria) this;
        }

        public Criteria andUserimgLessThan(String value) {
            addCriterion("userimg <", value, "userimg");
            return (Criteria) this;
        }

        public Criteria andUserimgLessThanOrEqualTo(String value) {
            addCriterion("userimg <=", value, "userimg");
            return (Criteria) this;
        }

        public Criteria andUserimgLike(String value) {
            addCriterion("userimg like", value, "userimg");
            return (Criteria) this;
        }

        public Criteria andUserimgNotLike(String value) {
            addCriterion("userimg not like", value, "userimg");
            return (Criteria) this;
        }

        public Criteria andUserimgIn(List<String> values) {
            addCriterion("userimg in", values, "userimg");
            return (Criteria) this;
        }

        public Criteria andUserimgNotIn(List<String> values) {
            addCriterion("userimg not in", values, "userimg");
            return (Criteria) this;
        }

        public Criteria andUserimgBetween(String value1, String value2) {
            addCriterion("userimg between", value1, value2, "userimg");
            return (Criteria) this;
        }

        public Criteria andUserimgNotBetween(String value1, String value2) {
            addCriterion("userimg not between", value1, value2, "userimg");
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