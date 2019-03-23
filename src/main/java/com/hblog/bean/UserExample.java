package com.hblog.bean;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserPwdIsNull() {
            addCriterion("user_pwd is null");
            return (Criteria) this;
        }

        public Criteria andUserPwdIsNotNull() {
            addCriterion("user_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andUserPwdEqualTo(String value) {
            addCriterion("user_pwd =", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotEqualTo(String value) {
            addCriterion("user_pwd <>", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdGreaterThan(String value) {
            addCriterion("user_pwd >", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdGreaterThanOrEqualTo(String value) {
            addCriterion("user_pwd >=", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdLessThan(String value) {
            addCriterion("user_pwd <", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdLessThanOrEqualTo(String value) {
            addCriterion("user_pwd <=", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdLike(String value) {
            addCriterion("user_pwd like", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotLike(String value) {
            addCriterion("user_pwd not like", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdIn(List<String> values) {
            addCriterion("user_pwd in", values, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotIn(List<String> values) {
            addCriterion("user_pwd not in", values, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdBetween(String value1, String value2) {
            addCriterion("user_pwd between", value1, value2, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotBetween(String value1, String value2) {
            addCriterion("user_pwd not between", value1, value2, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserLoginIpIsNull() {
            addCriterion("user_login_IP is null");
            return (Criteria) this;
        }

        public Criteria andUserLoginIpIsNotNull() {
            addCriterion("user_login_IP is not null");
            return (Criteria) this;
        }

        public Criteria andUserLoginIpEqualTo(String value) {
            addCriterion("user_login_IP =", value, "userLoginIp");
            return (Criteria) this;
        }

        public Criteria andUserLoginIpNotEqualTo(String value) {
            addCriterion("user_login_IP <>", value, "userLoginIp");
            return (Criteria) this;
        }

        public Criteria andUserLoginIpGreaterThan(String value) {
            addCriterion("user_login_IP >", value, "userLoginIp");
            return (Criteria) this;
        }

        public Criteria andUserLoginIpGreaterThanOrEqualTo(String value) {
            addCriterion("user_login_IP >=", value, "userLoginIp");
            return (Criteria) this;
        }

        public Criteria andUserLoginIpLessThan(String value) {
            addCriterion("user_login_IP <", value, "userLoginIp");
            return (Criteria) this;
        }

        public Criteria andUserLoginIpLessThanOrEqualTo(String value) {
            addCriterion("user_login_IP <=", value, "userLoginIp");
            return (Criteria) this;
        }

        public Criteria andUserLoginIpLike(String value) {
            addCriterion("user_login_IP like", value, "userLoginIp");
            return (Criteria) this;
        }

        public Criteria andUserLoginIpNotLike(String value) {
            addCriterion("user_login_IP not like", value, "userLoginIp");
            return (Criteria) this;
        }

        public Criteria andUserLoginIpIn(List<String> values) {
            addCriterion("user_login_IP in", values, "userLoginIp");
            return (Criteria) this;
        }

        public Criteria andUserLoginIpNotIn(List<String> values) {
            addCriterion("user_login_IP not in", values, "userLoginIp");
            return (Criteria) this;
        }

        public Criteria andUserLoginIpBetween(String value1, String value2) {
            addCriterion("user_login_IP between", value1, value2, "userLoginIp");
            return (Criteria) this;
        }

        public Criteria andUserLoginIpNotBetween(String value1, String value2) {
            addCriterion("user_login_IP not between", value1, value2, "userLoginIp");
            return (Criteria) this;
        }

        public Criteria andUserRegisterTimeIsNull() {
            addCriterion("user_register_time is null");
            return (Criteria) this;
        }

        public Criteria andUserRegisterTimeIsNotNull() {
            addCriterion("user_register_time is not null");
            return (Criteria) this;
        }

        public Criteria andUserRegisterTimeEqualTo(String value) {
            addCriterion("user_register_time =", value, "userRegisterTime");
            return (Criteria) this;
        }

        public Criteria andUserRegisterTimeNotEqualTo(String value) {
            addCriterion("user_register_time <>", value, "userRegisterTime");
            return (Criteria) this;
        }

        public Criteria andUserRegisterTimeGreaterThan(String value) {
            addCriterion("user_register_time >", value, "userRegisterTime");
            return (Criteria) this;
        }

        public Criteria andUserRegisterTimeGreaterThanOrEqualTo(String value) {
            addCriterion("user_register_time >=", value, "userRegisterTime");
            return (Criteria) this;
        }

        public Criteria andUserRegisterTimeLessThan(String value) {
            addCriterion("user_register_time <", value, "userRegisterTime");
            return (Criteria) this;
        }

        public Criteria andUserRegisterTimeLessThanOrEqualTo(String value) {
            addCriterion("user_register_time <=", value, "userRegisterTime");
            return (Criteria) this;
        }

        public Criteria andUserRegisterTimeLike(String value) {
            addCriterion("user_register_time like", value, "userRegisterTime");
            return (Criteria) this;
        }

        public Criteria andUserRegisterTimeNotLike(String value) {
            addCriterion("user_register_time not like", value, "userRegisterTime");
            return (Criteria) this;
        }

        public Criteria andUserRegisterTimeIn(List<String> values) {
            addCriterion("user_register_time in", values, "userRegisterTime");
            return (Criteria) this;
        }

        public Criteria andUserRegisterTimeNotIn(List<String> values) {
            addCriterion("user_register_time not in", values, "userRegisterTime");
            return (Criteria) this;
        }

        public Criteria andUserRegisterTimeBetween(String value1, String value2) {
            addCriterion("user_register_time between", value1, value2, "userRegisterTime");
            return (Criteria) this;
        }

        public Criteria andUserRegisterTimeNotBetween(String value1, String value2) {
            addCriterion("user_register_time not between", value1, value2, "userRegisterTime");
            return (Criteria) this;
        }

        public Criteria andUserHistoryloginTimeIsNull() {
            addCriterion("user_historylogin_time is null");
            return (Criteria) this;
        }

        public Criteria andUserHistoryloginTimeIsNotNull() {
            addCriterion("user_historylogin_time is not null");
            return (Criteria) this;
        }

        public Criteria andUserHistoryloginTimeEqualTo(String value) {
            addCriterion("user_historylogin_time =", value, "userHistoryloginTime");
            return (Criteria) this;
        }

        public Criteria andUserHistoryloginTimeNotEqualTo(String value) {
            addCriterion("user_historylogin_time <>", value, "userHistoryloginTime");
            return (Criteria) this;
        }

        public Criteria andUserHistoryloginTimeGreaterThan(String value) {
            addCriterion("user_historylogin_time >", value, "userHistoryloginTime");
            return (Criteria) this;
        }

        public Criteria andUserHistoryloginTimeGreaterThanOrEqualTo(String value) {
            addCriterion("user_historylogin_time >=", value, "userHistoryloginTime");
            return (Criteria) this;
        }

        public Criteria andUserHistoryloginTimeLessThan(String value) {
            addCriterion("user_historylogin_time <", value, "userHistoryloginTime");
            return (Criteria) this;
        }

        public Criteria andUserHistoryloginTimeLessThanOrEqualTo(String value) {
            addCriterion("user_historylogin_time <=", value, "userHistoryloginTime");
            return (Criteria) this;
        }

        public Criteria andUserHistoryloginTimeLike(String value) {
            addCriterion("user_historylogin_time like", value, "userHistoryloginTime");
            return (Criteria) this;
        }

        public Criteria andUserHistoryloginTimeNotLike(String value) {
            addCriterion("user_historylogin_time not like", value, "userHistoryloginTime");
            return (Criteria) this;
        }

        public Criteria andUserHistoryloginTimeIn(List<String> values) {
            addCriterion("user_historylogin_time in", values, "userHistoryloginTime");
            return (Criteria) this;
        }

        public Criteria andUserHistoryloginTimeNotIn(List<String> values) {
            addCriterion("user_historylogin_time not in", values, "userHistoryloginTime");
            return (Criteria) this;
        }

        public Criteria andUserHistoryloginTimeBetween(String value1, String value2) {
            addCriterion("user_historylogin_time between", value1, value2, "userHistoryloginTime");
            return (Criteria) this;
        }

        public Criteria andUserHistoryloginTimeNotBetween(String value1, String value2) {
            addCriterion("user_historylogin_time not between", value1, value2, "userHistoryloginTime");
            return (Criteria) this;
        }

        public Criteria andUserHistoryloginDeviceIsNull() {
            addCriterion("user_historylogin_device is null");
            return (Criteria) this;
        }

        public Criteria andUserHistoryloginDeviceIsNotNull() {
            addCriterion("user_historylogin_device is not null");
            return (Criteria) this;
        }

        public Criteria andUserHistoryloginDeviceEqualTo(String value) {
            addCriterion("user_historylogin_device =", value, "userHistoryloginDevice");
            return (Criteria) this;
        }

        public Criteria andUserHistoryloginDeviceNotEqualTo(String value) {
            addCriterion("user_historylogin_device <>", value, "userHistoryloginDevice");
            return (Criteria) this;
        }

        public Criteria andUserHistoryloginDeviceGreaterThan(String value) {
            addCriterion("user_historylogin_device >", value, "userHistoryloginDevice");
            return (Criteria) this;
        }

        public Criteria andUserHistoryloginDeviceGreaterThanOrEqualTo(String value) {
            addCriterion("user_historylogin_device >=", value, "userHistoryloginDevice");
            return (Criteria) this;
        }

        public Criteria andUserHistoryloginDeviceLessThan(String value) {
            addCriterion("user_historylogin_device <", value, "userHistoryloginDevice");
            return (Criteria) this;
        }

        public Criteria andUserHistoryloginDeviceLessThanOrEqualTo(String value) {
            addCriterion("user_historylogin_device <=", value, "userHistoryloginDevice");
            return (Criteria) this;
        }

        public Criteria andUserHistoryloginDeviceLike(String value) {
            addCriterion("user_historylogin_device like", value, "userHistoryloginDevice");
            return (Criteria) this;
        }

        public Criteria andUserHistoryloginDeviceNotLike(String value) {
            addCriterion("user_historylogin_device not like", value, "userHistoryloginDevice");
            return (Criteria) this;
        }

        public Criteria andUserHistoryloginDeviceIn(List<String> values) {
            addCriterion("user_historylogin_device in", values, "userHistoryloginDevice");
            return (Criteria) this;
        }

        public Criteria andUserHistoryloginDeviceNotIn(List<String> values) {
            addCriterion("user_historylogin_device not in", values, "userHistoryloginDevice");
            return (Criteria) this;
        }

        public Criteria andUserHistoryloginDeviceBetween(String value1, String value2) {
            addCriterion("user_historylogin_device between", value1, value2, "userHistoryloginDevice");
            return (Criteria) this;
        }

        public Criteria andUserHistoryloginDeviceNotBetween(String value1, String value2) {
            addCriterion("user_historylogin_device not between", value1, value2, "userHistoryloginDevice");
            return (Criteria) this;
        }

        public Criteria andUserLoginStateIsNull() {
            addCriterion("user_login_state is null");
            return (Criteria) this;
        }

        public Criteria andUserLoginStateIsNotNull() {
            addCriterion("user_login_state is not null");
            return (Criteria) this;
        }

        public Criteria andUserLoginStateEqualTo(String value) {
            addCriterion("user_login_state =", value, "userLoginState");
            return (Criteria) this;
        }

        public Criteria andUserLoginStateNotEqualTo(String value) {
            addCriterion("user_login_state <>", value, "userLoginState");
            return (Criteria) this;
        }

        public Criteria andUserLoginStateGreaterThan(String value) {
            addCriterion("user_login_state >", value, "userLoginState");
            return (Criteria) this;
        }

        public Criteria andUserLoginStateGreaterThanOrEqualTo(String value) {
            addCriterion("user_login_state >=", value, "userLoginState");
            return (Criteria) this;
        }

        public Criteria andUserLoginStateLessThan(String value) {
            addCriterion("user_login_state <", value, "userLoginState");
            return (Criteria) this;
        }

        public Criteria andUserLoginStateLessThanOrEqualTo(String value) {
            addCriterion("user_login_state <=", value, "userLoginState");
            return (Criteria) this;
        }

        public Criteria andUserLoginStateLike(String value) {
            addCriterion("user_login_state like", value, "userLoginState");
            return (Criteria) this;
        }

        public Criteria andUserLoginStateNotLike(String value) {
            addCriterion("user_login_state not like", value, "userLoginState");
            return (Criteria) this;
        }

        public Criteria andUserLoginStateIn(List<String> values) {
            addCriterion("user_login_state in", values, "userLoginState");
            return (Criteria) this;
        }

        public Criteria andUserLoginStateNotIn(List<String> values) {
            addCriterion("user_login_state not in", values, "userLoginState");
            return (Criteria) this;
        }

        public Criteria andUserLoginStateBetween(String value1, String value2) {
            addCriterion("user_login_state between", value1, value2, "userLoginState");
            return (Criteria) this;
        }

        public Criteria andUserLoginStateNotBetween(String value1, String value2) {
            addCriterion("user_login_state not between", value1, value2, "userLoginState");
            return (Criteria) this;
        }

        public Criteria andUserLoginBannedIsNull() {
            addCriterion("user_login_banned is null");
            return (Criteria) this;
        }

        public Criteria andUserLoginBannedIsNotNull() {
            addCriterion("user_login_banned is not null");
            return (Criteria) this;
        }

        public Criteria andUserLoginBannedEqualTo(String value) {
            addCriterion("user_login_banned =", value, "userLoginBanned");
            return (Criteria) this;
        }

        public Criteria andUserLoginBannedNotEqualTo(String value) {
            addCriterion("user_login_banned <>", value, "userLoginBanned");
            return (Criteria) this;
        }

        public Criteria andUserLoginBannedGreaterThan(String value) {
            addCriterion("user_login_banned >", value, "userLoginBanned");
            return (Criteria) this;
        }

        public Criteria andUserLoginBannedGreaterThanOrEqualTo(String value) {
            addCriterion("user_login_banned >=", value, "userLoginBanned");
            return (Criteria) this;
        }

        public Criteria andUserLoginBannedLessThan(String value) {
            addCriterion("user_login_banned <", value, "userLoginBanned");
            return (Criteria) this;
        }

        public Criteria andUserLoginBannedLessThanOrEqualTo(String value) {
            addCriterion("user_login_banned <=", value, "userLoginBanned");
            return (Criteria) this;
        }

        public Criteria andUserLoginBannedLike(String value) {
            addCriterion("user_login_banned like", value, "userLoginBanned");
            return (Criteria) this;
        }

        public Criteria andUserLoginBannedNotLike(String value) {
            addCriterion("user_login_banned not like", value, "userLoginBanned");
            return (Criteria) this;
        }

        public Criteria andUserLoginBannedIn(List<String> values) {
            addCriterion("user_login_banned in", values, "userLoginBanned");
            return (Criteria) this;
        }

        public Criteria andUserLoginBannedNotIn(List<String> values) {
            addCriterion("user_login_banned not in", values, "userLoginBanned");
            return (Criteria) this;
        }

        public Criteria andUserLoginBannedBetween(String value1, String value2) {
            addCriterion("user_login_banned between", value1, value2, "userLoginBanned");
            return (Criteria) this;
        }

        public Criteria andUserLoginBannedNotBetween(String value1, String value2) {
            addCriterion("user_login_banned not between", value1, value2, "userLoginBanned");
            return (Criteria) this;
        }

        public Criteria andUserHeadimageSrcIsNull() {
            addCriterion("user_headimage_src is null");
            return (Criteria) this;
        }

        public Criteria andUserHeadimageSrcIsNotNull() {
            addCriterion("user_headimage_src is not null");
            return (Criteria) this;
        }

        public Criteria andUserHeadimageSrcEqualTo(String value) {
            addCriterion("user_headimage_src =", value, "userHeadimageSrc");
            return (Criteria) this;
        }

        public Criteria andUserHeadimageSrcNotEqualTo(String value) {
            addCriterion("user_headimage_src <>", value, "userHeadimageSrc");
            return (Criteria) this;
        }

        public Criteria andUserHeadimageSrcGreaterThan(String value) {
            addCriterion("user_headimage_src >", value, "userHeadimageSrc");
            return (Criteria) this;
        }

        public Criteria andUserHeadimageSrcGreaterThanOrEqualTo(String value) {
            addCriterion("user_headimage_src >=", value, "userHeadimageSrc");
            return (Criteria) this;
        }

        public Criteria andUserHeadimageSrcLessThan(String value) {
            addCriterion("user_headimage_src <", value, "userHeadimageSrc");
            return (Criteria) this;
        }

        public Criteria andUserHeadimageSrcLessThanOrEqualTo(String value) {
            addCriterion("user_headimage_src <=", value, "userHeadimageSrc");
            return (Criteria) this;
        }

        public Criteria andUserHeadimageSrcLike(String value) {
            addCriterion("user_headimage_src like", value, "userHeadimageSrc");
            return (Criteria) this;
        }

        public Criteria andUserHeadimageSrcNotLike(String value) {
            addCriterion("user_headimage_src not like", value, "userHeadimageSrc");
            return (Criteria) this;
        }

        public Criteria andUserHeadimageSrcIn(List<String> values) {
            addCriterion("user_headimage_src in", values, "userHeadimageSrc");
            return (Criteria) this;
        }

        public Criteria andUserHeadimageSrcNotIn(List<String> values) {
            addCriterion("user_headimage_src not in", values, "userHeadimageSrc");
            return (Criteria) this;
        }

        public Criteria andUserHeadimageSrcBetween(String value1, String value2) {
            addCriterion("user_headimage_src between", value1, value2, "userHeadimageSrc");
            return (Criteria) this;
        }

        public Criteria andUserHeadimageSrcNotBetween(String value1, String value2) {
            addCriterion("user_headimage_src not between", value1, value2, "userHeadimageSrc");
            return (Criteria) this;
        }

        public Criteria andUserScoreIsNull() {
            addCriterion("user_score is null");
            return (Criteria) this;
        }

        public Criteria andUserScoreIsNotNull() {
            addCriterion("user_score is not null");
            return (Criteria) this;
        }

        public Criteria andUserScoreEqualTo(Integer value) {
            addCriterion("user_score =", value, "userScore");
            return (Criteria) this;
        }

        public Criteria andUserScoreNotEqualTo(Integer value) {
            addCriterion("user_score <>", value, "userScore");
            return (Criteria) this;
        }

        public Criteria andUserScoreGreaterThan(Integer value) {
            addCriterion("user_score >", value, "userScore");
            return (Criteria) this;
        }

        public Criteria andUserScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_score >=", value, "userScore");
            return (Criteria) this;
        }

        public Criteria andUserScoreLessThan(Integer value) {
            addCriterion("user_score <", value, "userScore");
            return (Criteria) this;
        }

        public Criteria andUserScoreLessThanOrEqualTo(Integer value) {
            addCriterion("user_score <=", value, "userScore");
            return (Criteria) this;
        }

        public Criteria andUserScoreIn(List<Integer> values) {
            addCriterion("user_score in", values, "userScore");
            return (Criteria) this;
        }

        public Criteria andUserScoreNotIn(List<Integer> values) {
            addCriterion("user_score not in", values, "userScore");
            return (Criteria) this;
        }

        public Criteria andUserScoreBetween(Integer value1, Integer value2) {
            addCriterion("user_score between", value1, value2, "userScore");
            return (Criteria) this;
        }

        public Criteria andUserScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("user_score not between", value1, value2, "userScore");
            return (Criteria) this;
        }

        public Criteria andUserGradeIsNull() {
            addCriterion("user_grade is null");
            return (Criteria) this;
        }

        public Criteria andUserGradeIsNotNull() {
            addCriterion("user_grade is not null");
            return (Criteria) this;
        }

        public Criteria andUserGradeEqualTo(String value) {
            addCriterion("user_grade =", value, "userGrade");
            return (Criteria) this;
        }

        public Criteria andUserGradeNotEqualTo(String value) {
            addCriterion("user_grade <>", value, "userGrade");
            return (Criteria) this;
        }

        public Criteria andUserGradeGreaterThan(String value) {
            addCriterion("user_grade >", value, "userGrade");
            return (Criteria) this;
        }

        public Criteria andUserGradeGreaterThanOrEqualTo(String value) {
            addCriterion("user_grade >=", value, "userGrade");
            return (Criteria) this;
        }

        public Criteria andUserGradeLessThan(String value) {
            addCriterion("user_grade <", value, "userGrade");
            return (Criteria) this;
        }

        public Criteria andUserGradeLessThanOrEqualTo(String value) {
            addCriterion("user_grade <=", value, "userGrade");
            return (Criteria) this;
        }

        public Criteria andUserGradeLike(String value) {
            addCriterion("user_grade like", value, "userGrade");
            return (Criteria) this;
        }

        public Criteria andUserGradeNotLike(String value) {
            addCriterion("user_grade not like", value, "userGrade");
            return (Criteria) this;
        }

        public Criteria andUserGradeIn(List<String> values) {
            addCriterion("user_grade in", values, "userGrade");
            return (Criteria) this;
        }

        public Criteria andUserGradeNotIn(List<String> values) {
            addCriterion("user_grade not in", values, "userGrade");
            return (Criteria) this;
        }

        public Criteria andUserGradeBetween(String value1, String value2) {
            addCriterion("user_grade between", value1, value2, "userGrade");
            return (Criteria) this;
        }

        public Criteria andUserGradeNotBetween(String value1, String value2) {
            addCriterion("user_grade not between", value1, value2, "userGrade");
            return (Criteria) this;
        }

        public Criteria andUserRealIsNull() {
            addCriterion("user_real is null");
            return (Criteria) this;
        }

        public Criteria andUserRealIsNotNull() {
            addCriterion("user_real is not null");
            return (Criteria) this;
        }

        public Criteria andUserRealEqualTo(String value) {
            addCriterion("user_real =", value, "userReal");
            return (Criteria) this;
        }

        public Criteria andUserRealNotEqualTo(String value) {
            addCriterion("user_real <>", value, "userReal");
            return (Criteria) this;
        }

        public Criteria andUserRealGreaterThan(String value) {
            addCriterion("user_real >", value, "userReal");
            return (Criteria) this;
        }

        public Criteria andUserRealGreaterThanOrEqualTo(String value) {
            addCriterion("user_real >=", value, "userReal");
            return (Criteria) this;
        }

        public Criteria andUserRealLessThan(String value) {
            addCriterion("user_real <", value, "userReal");
            return (Criteria) this;
        }

        public Criteria andUserRealLessThanOrEqualTo(String value) {
            addCriterion("user_real <=", value, "userReal");
            return (Criteria) this;
        }

        public Criteria andUserRealLike(String value) {
            addCriterion("user_real like", value, "userReal");
            return (Criteria) this;
        }

        public Criteria andUserRealNotLike(String value) {
            addCriterion("user_real not like", value, "userReal");
            return (Criteria) this;
        }

        public Criteria andUserRealIn(List<String> values) {
            addCriterion("user_real in", values, "userReal");
            return (Criteria) this;
        }

        public Criteria andUserRealNotIn(List<String> values) {
            addCriterion("user_real not in", values, "userReal");
            return (Criteria) this;
        }

        public Criteria andUserRealBetween(String value1, String value2) {
            addCriterion("user_real between", value1, value2, "userReal");
            return (Criteria) this;
        }

        public Criteria andUserRealNotBetween(String value1, String value2) {
            addCriterion("user_real not between", value1, value2, "userReal");
            return (Criteria) this;
        }

        public Criteria andUserLabelIsNull() {
            addCriterion("user_label is null");
            return (Criteria) this;
        }

        public Criteria andUserLabelIsNotNull() {
            addCriterion("user_label is not null");
            return (Criteria) this;
        }

        public Criteria andUserLabelEqualTo(String value) {
            addCriterion("user_label =", value, "userLabel");
            return (Criteria) this;
        }

        public Criteria andUserLabelNotEqualTo(String value) {
            addCriterion("user_label <>", value, "userLabel");
            return (Criteria) this;
        }

        public Criteria andUserLabelGreaterThan(String value) {
            addCriterion("user_label >", value, "userLabel");
            return (Criteria) this;
        }

        public Criteria andUserLabelGreaterThanOrEqualTo(String value) {
            addCriterion("user_label >=", value, "userLabel");
            return (Criteria) this;
        }

        public Criteria andUserLabelLessThan(String value) {
            addCriterion("user_label <", value, "userLabel");
            return (Criteria) this;
        }

        public Criteria andUserLabelLessThanOrEqualTo(String value) {
            addCriterion("user_label <=", value, "userLabel");
            return (Criteria) this;
        }

        public Criteria andUserLabelLike(String value) {
            addCriterion("user_label like", value, "userLabel");
            return (Criteria) this;
        }

        public Criteria andUserLabelNotLike(String value) {
            addCriterion("user_label not like", value, "userLabel");
            return (Criteria) this;
        }

        public Criteria andUserLabelIn(List<String> values) {
            addCriterion("user_label in", values, "userLabel");
            return (Criteria) this;
        }

        public Criteria andUserLabelNotIn(List<String> values) {
            addCriterion("user_label not in", values, "userLabel");
            return (Criteria) this;
        }

        public Criteria andUserLabelBetween(String value1, String value2) {
            addCriterion("user_label between", value1, value2, "userLabel");
            return (Criteria) this;
        }

        public Criteria andUserLabelNotBetween(String value1, String value2) {
            addCriterion("user_label not between", value1, value2, "userLabel");
            return (Criteria) this;
        }

        public Criteria andUserSignatureIsNull() {
            addCriterion("user_signature is null");
            return (Criteria) this;
        }

        public Criteria andUserSignatureIsNotNull() {
            addCriterion("user_signature is not null");
            return (Criteria) this;
        }

        public Criteria andUserSignatureEqualTo(String value) {
            addCriterion("user_signature =", value, "userSignature");
            return (Criteria) this;
        }

        public Criteria andUserSignatureNotEqualTo(String value) {
            addCriterion("user_signature <>", value, "userSignature");
            return (Criteria) this;
        }

        public Criteria andUserSignatureGreaterThan(String value) {
            addCriterion("user_signature >", value, "userSignature");
            return (Criteria) this;
        }

        public Criteria andUserSignatureGreaterThanOrEqualTo(String value) {
            addCriterion("user_signature >=", value, "userSignature");
            return (Criteria) this;
        }

        public Criteria andUserSignatureLessThan(String value) {
            addCriterion("user_signature <", value, "userSignature");
            return (Criteria) this;
        }

        public Criteria andUserSignatureLessThanOrEqualTo(String value) {
            addCriterion("user_signature <=", value, "userSignature");
            return (Criteria) this;
        }

        public Criteria andUserSignatureLike(String value) {
            addCriterion("user_signature like", value, "userSignature");
            return (Criteria) this;
        }

        public Criteria andUserSignatureNotLike(String value) {
            addCriterion("user_signature not like", value, "userSignature");
            return (Criteria) this;
        }

        public Criteria andUserSignatureIn(List<String> values) {
            addCriterion("user_signature in", values, "userSignature");
            return (Criteria) this;
        }

        public Criteria andUserSignatureNotIn(List<String> values) {
            addCriterion("user_signature not in", values, "userSignature");
            return (Criteria) this;
        }

        public Criteria andUserSignatureBetween(String value1, String value2) {
            addCriterion("user_signature between", value1, value2, "userSignature");
            return (Criteria) this;
        }

        public Criteria andUserSignatureNotBetween(String value1, String value2) {
            addCriterion("user_signature not between", value1, value2, "userSignature");
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