package com.hblog.bean;

import java.util.ArrayList;
import java.util.List;

public class UserinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserinfoExample() {
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

        public Criteria andUserinfoIdIsNull() {
            addCriterion("userinfo_id is null");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdIsNotNull() {
            addCriterion("userinfo_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdEqualTo(Integer value) {
            addCriterion("userinfo_id =", value, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdNotEqualTo(Integer value) {
            addCriterion("userinfo_id <>", value, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdGreaterThan(Integer value) {
            addCriterion("userinfo_id >", value, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("userinfo_id >=", value, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdLessThan(Integer value) {
            addCriterion("userinfo_id <", value, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("userinfo_id <=", value, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdIn(List<Integer> values) {
            addCriterion("userinfo_id in", values, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdNotIn(List<Integer> values) {
            addCriterion("userinfo_id not in", values, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdBetween(Integer value1, Integer value2) {
            addCriterion("userinfo_id between", value1, value2, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("userinfo_id not between", value1, value2, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoSexIsNull() {
            addCriterion("userinfo_sex is null");
            return (Criteria) this;
        }

        public Criteria andUserinfoSexIsNotNull() {
            addCriterion("userinfo_sex is not null");
            return (Criteria) this;
        }

        public Criteria andUserinfoSexEqualTo(String value) {
            addCriterion("userinfo_sex =", value, "userinfoSex");
            return (Criteria) this;
        }

        public Criteria andUserinfoSexNotEqualTo(String value) {
            addCriterion("userinfo_sex <>", value, "userinfoSex");
            return (Criteria) this;
        }

        public Criteria andUserinfoSexGreaterThan(String value) {
            addCriterion("userinfo_sex >", value, "userinfoSex");
            return (Criteria) this;
        }

        public Criteria andUserinfoSexGreaterThanOrEqualTo(String value) {
            addCriterion("userinfo_sex >=", value, "userinfoSex");
            return (Criteria) this;
        }

        public Criteria andUserinfoSexLessThan(String value) {
            addCriterion("userinfo_sex <", value, "userinfoSex");
            return (Criteria) this;
        }

        public Criteria andUserinfoSexLessThanOrEqualTo(String value) {
            addCriterion("userinfo_sex <=", value, "userinfoSex");
            return (Criteria) this;
        }

        public Criteria andUserinfoSexLike(String value) {
            addCriterion("userinfo_sex like", value, "userinfoSex");
            return (Criteria) this;
        }

        public Criteria andUserinfoSexNotLike(String value) {
            addCriterion("userinfo_sex not like", value, "userinfoSex");
            return (Criteria) this;
        }

        public Criteria andUserinfoSexIn(List<String> values) {
            addCriterion("userinfo_sex in", values, "userinfoSex");
            return (Criteria) this;
        }

        public Criteria andUserinfoSexNotIn(List<String> values) {
            addCriterion("userinfo_sex not in", values, "userinfoSex");
            return (Criteria) this;
        }

        public Criteria andUserinfoSexBetween(String value1, String value2) {
            addCriterion("userinfo_sex between", value1, value2, "userinfoSex");
            return (Criteria) this;
        }

        public Criteria andUserinfoSexNotBetween(String value1, String value2) {
            addCriterion("userinfo_sex not between", value1, value2, "userinfoSex");
            return (Criteria) this;
        }

        public Criteria andUserinfoAgeIsNull() {
            addCriterion("userinfo_age is null");
            return (Criteria) this;
        }

        public Criteria andUserinfoAgeIsNotNull() {
            addCriterion("userinfo_age is not null");
            return (Criteria) this;
        }

        public Criteria andUserinfoAgeEqualTo(String value) {
            addCriterion("userinfo_age =", value, "userinfoAge");
            return (Criteria) this;
        }

        public Criteria andUserinfoAgeNotEqualTo(String value) {
            addCriterion("userinfo_age <>", value, "userinfoAge");
            return (Criteria) this;
        }

        public Criteria andUserinfoAgeGreaterThan(String value) {
            addCriterion("userinfo_age >", value, "userinfoAge");
            return (Criteria) this;
        }

        public Criteria andUserinfoAgeGreaterThanOrEqualTo(String value) {
            addCriterion("userinfo_age >=", value, "userinfoAge");
            return (Criteria) this;
        }

        public Criteria andUserinfoAgeLessThan(String value) {
            addCriterion("userinfo_age <", value, "userinfoAge");
            return (Criteria) this;
        }

        public Criteria andUserinfoAgeLessThanOrEqualTo(String value) {
            addCriterion("userinfo_age <=", value, "userinfoAge");
            return (Criteria) this;
        }

        public Criteria andUserinfoAgeLike(String value) {
            addCriterion("userinfo_age like", value, "userinfoAge");
            return (Criteria) this;
        }

        public Criteria andUserinfoAgeNotLike(String value) {
            addCriterion("userinfo_age not like", value, "userinfoAge");
            return (Criteria) this;
        }

        public Criteria andUserinfoAgeIn(List<String> values) {
            addCriterion("userinfo_age in", values, "userinfoAge");
            return (Criteria) this;
        }

        public Criteria andUserinfoAgeNotIn(List<String> values) {
            addCriterion("userinfo_age not in", values, "userinfoAge");
            return (Criteria) this;
        }

        public Criteria andUserinfoAgeBetween(String value1, String value2) {
            addCriterion("userinfo_age between", value1, value2, "userinfoAge");
            return (Criteria) this;
        }

        public Criteria andUserinfoAgeNotBetween(String value1, String value2) {
            addCriterion("userinfo_age not between", value1, value2, "userinfoAge");
            return (Criteria) this;
        }

        public Criteria andUserinfoHeightIsNull() {
            addCriterion("userinfo_height is null");
            return (Criteria) this;
        }

        public Criteria andUserinfoHeightIsNotNull() {
            addCriterion("userinfo_height is not null");
            return (Criteria) this;
        }

        public Criteria andUserinfoHeightEqualTo(String value) {
            addCriterion("userinfo_height =", value, "userinfoHeight");
            return (Criteria) this;
        }

        public Criteria andUserinfoHeightNotEqualTo(String value) {
            addCriterion("userinfo_height <>", value, "userinfoHeight");
            return (Criteria) this;
        }

        public Criteria andUserinfoHeightGreaterThan(String value) {
            addCriterion("userinfo_height >", value, "userinfoHeight");
            return (Criteria) this;
        }

        public Criteria andUserinfoHeightGreaterThanOrEqualTo(String value) {
            addCriterion("userinfo_height >=", value, "userinfoHeight");
            return (Criteria) this;
        }

        public Criteria andUserinfoHeightLessThan(String value) {
            addCriterion("userinfo_height <", value, "userinfoHeight");
            return (Criteria) this;
        }

        public Criteria andUserinfoHeightLessThanOrEqualTo(String value) {
            addCriterion("userinfo_height <=", value, "userinfoHeight");
            return (Criteria) this;
        }

        public Criteria andUserinfoHeightLike(String value) {
            addCriterion("userinfo_height like", value, "userinfoHeight");
            return (Criteria) this;
        }

        public Criteria andUserinfoHeightNotLike(String value) {
            addCriterion("userinfo_height not like", value, "userinfoHeight");
            return (Criteria) this;
        }

        public Criteria andUserinfoHeightIn(List<String> values) {
            addCriterion("userinfo_height in", values, "userinfoHeight");
            return (Criteria) this;
        }

        public Criteria andUserinfoHeightNotIn(List<String> values) {
            addCriterion("userinfo_height not in", values, "userinfoHeight");
            return (Criteria) this;
        }

        public Criteria andUserinfoHeightBetween(String value1, String value2) {
            addCriterion("userinfo_height between", value1, value2, "userinfoHeight");
            return (Criteria) this;
        }

        public Criteria andUserinfoHeightNotBetween(String value1, String value2) {
            addCriterion("userinfo_height not between", value1, value2, "userinfoHeight");
            return (Criteria) this;
        }

        public Criteria andUserinfoWeightIsNull() {
            addCriterion("userinfo_weight is null");
            return (Criteria) this;
        }

        public Criteria andUserinfoWeightIsNotNull() {
            addCriterion("userinfo_weight is not null");
            return (Criteria) this;
        }

        public Criteria andUserinfoWeightEqualTo(String value) {
            addCriterion("userinfo_weight =", value, "userinfoWeight");
            return (Criteria) this;
        }

        public Criteria andUserinfoWeightNotEqualTo(String value) {
            addCriterion("userinfo_weight <>", value, "userinfoWeight");
            return (Criteria) this;
        }

        public Criteria andUserinfoWeightGreaterThan(String value) {
            addCriterion("userinfo_weight >", value, "userinfoWeight");
            return (Criteria) this;
        }

        public Criteria andUserinfoWeightGreaterThanOrEqualTo(String value) {
            addCriterion("userinfo_weight >=", value, "userinfoWeight");
            return (Criteria) this;
        }

        public Criteria andUserinfoWeightLessThan(String value) {
            addCriterion("userinfo_weight <", value, "userinfoWeight");
            return (Criteria) this;
        }

        public Criteria andUserinfoWeightLessThanOrEqualTo(String value) {
            addCriterion("userinfo_weight <=", value, "userinfoWeight");
            return (Criteria) this;
        }

        public Criteria andUserinfoWeightLike(String value) {
            addCriterion("userinfo_weight like", value, "userinfoWeight");
            return (Criteria) this;
        }

        public Criteria andUserinfoWeightNotLike(String value) {
            addCriterion("userinfo_weight not like", value, "userinfoWeight");
            return (Criteria) this;
        }

        public Criteria andUserinfoWeightIn(List<String> values) {
            addCriterion("userinfo_weight in", values, "userinfoWeight");
            return (Criteria) this;
        }

        public Criteria andUserinfoWeightNotIn(List<String> values) {
            addCriterion("userinfo_weight not in", values, "userinfoWeight");
            return (Criteria) this;
        }

        public Criteria andUserinfoWeightBetween(String value1, String value2) {
            addCriterion("userinfo_weight between", value1, value2, "userinfoWeight");
            return (Criteria) this;
        }

        public Criteria andUserinfoWeightNotBetween(String value1, String value2) {
            addCriterion("userinfo_weight not between", value1, value2, "userinfoWeight");
            return (Criteria) this;
        }

        public Criteria andUserinfoSexChoiceIsNull() {
            addCriterion("userinfo_sex_choice is null");
            return (Criteria) this;
        }

        public Criteria andUserinfoSexChoiceIsNotNull() {
            addCriterion("userinfo_sex_choice is not null");
            return (Criteria) this;
        }

        public Criteria andUserinfoSexChoiceEqualTo(String value) {
            addCriterion("userinfo_sex_choice =", value, "userinfoSexChoice");
            return (Criteria) this;
        }

        public Criteria andUserinfoSexChoiceNotEqualTo(String value) {
            addCriterion("userinfo_sex_choice <>", value, "userinfoSexChoice");
            return (Criteria) this;
        }

        public Criteria andUserinfoSexChoiceGreaterThan(String value) {
            addCriterion("userinfo_sex_choice >", value, "userinfoSexChoice");
            return (Criteria) this;
        }

        public Criteria andUserinfoSexChoiceGreaterThanOrEqualTo(String value) {
            addCriterion("userinfo_sex_choice >=", value, "userinfoSexChoice");
            return (Criteria) this;
        }

        public Criteria andUserinfoSexChoiceLessThan(String value) {
            addCriterion("userinfo_sex_choice <", value, "userinfoSexChoice");
            return (Criteria) this;
        }

        public Criteria andUserinfoSexChoiceLessThanOrEqualTo(String value) {
            addCriterion("userinfo_sex_choice <=", value, "userinfoSexChoice");
            return (Criteria) this;
        }

        public Criteria andUserinfoSexChoiceLike(String value) {
            addCriterion("userinfo_sex_choice like", value, "userinfoSexChoice");
            return (Criteria) this;
        }

        public Criteria andUserinfoSexChoiceNotLike(String value) {
            addCriterion("userinfo_sex_choice not like", value, "userinfoSexChoice");
            return (Criteria) this;
        }

        public Criteria andUserinfoSexChoiceIn(List<String> values) {
            addCriterion("userinfo_sex_choice in", values, "userinfoSexChoice");
            return (Criteria) this;
        }

        public Criteria andUserinfoSexChoiceNotIn(List<String> values) {
            addCriterion("userinfo_sex_choice not in", values, "userinfoSexChoice");
            return (Criteria) this;
        }

        public Criteria andUserinfoSexChoiceBetween(String value1, String value2) {
            addCriterion("userinfo_sex_choice between", value1, value2, "userinfoSexChoice");
            return (Criteria) this;
        }

        public Criteria andUserinfoSexChoiceNotBetween(String value1, String value2) {
            addCriterion("userinfo_sex_choice not between", value1, value2, "userinfoSexChoice");
            return (Criteria) this;
        }

        public Criteria andUserinfoMarriageStateIsNull() {
            addCriterion("userinfo_marriage_state is null");
            return (Criteria) this;
        }

        public Criteria andUserinfoMarriageStateIsNotNull() {
            addCriterion("userinfo_marriage_state is not null");
            return (Criteria) this;
        }

        public Criteria andUserinfoMarriageStateEqualTo(String value) {
            addCriterion("userinfo_marriage_state =", value, "userinfoMarriageState");
            return (Criteria) this;
        }

        public Criteria andUserinfoMarriageStateNotEqualTo(String value) {
            addCriterion("userinfo_marriage_state <>", value, "userinfoMarriageState");
            return (Criteria) this;
        }

        public Criteria andUserinfoMarriageStateGreaterThan(String value) {
            addCriterion("userinfo_marriage_state >", value, "userinfoMarriageState");
            return (Criteria) this;
        }

        public Criteria andUserinfoMarriageStateGreaterThanOrEqualTo(String value) {
            addCriterion("userinfo_marriage_state >=", value, "userinfoMarriageState");
            return (Criteria) this;
        }

        public Criteria andUserinfoMarriageStateLessThan(String value) {
            addCriterion("userinfo_marriage_state <", value, "userinfoMarriageState");
            return (Criteria) this;
        }

        public Criteria andUserinfoMarriageStateLessThanOrEqualTo(String value) {
            addCriterion("userinfo_marriage_state <=", value, "userinfoMarriageState");
            return (Criteria) this;
        }

        public Criteria andUserinfoMarriageStateLike(String value) {
            addCriterion("userinfo_marriage_state like", value, "userinfoMarriageState");
            return (Criteria) this;
        }

        public Criteria andUserinfoMarriageStateNotLike(String value) {
            addCriterion("userinfo_marriage_state not like", value, "userinfoMarriageState");
            return (Criteria) this;
        }

        public Criteria andUserinfoMarriageStateIn(List<String> values) {
            addCriterion("userinfo_marriage_state in", values, "userinfoMarriageState");
            return (Criteria) this;
        }

        public Criteria andUserinfoMarriageStateNotIn(List<String> values) {
            addCriterion("userinfo_marriage_state not in", values, "userinfoMarriageState");
            return (Criteria) this;
        }

        public Criteria andUserinfoMarriageStateBetween(String value1, String value2) {
            addCriterion("userinfo_marriage_state between", value1, value2, "userinfoMarriageState");
            return (Criteria) this;
        }

        public Criteria andUserinfoMarriageStateNotBetween(String value1, String value2) {
            addCriterion("userinfo_marriage_state not between", value1, value2, "userinfoMarriageState");
            return (Criteria) this;
        }

        public Criteria andUserinfoEducationIsNull() {
            addCriterion("userinfo_education is null");
            return (Criteria) this;
        }

        public Criteria andUserinfoEducationIsNotNull() {
            addCriterion("userinfo_education is not null");
            return (Criteria) this;
        }

        public Criteria andUserinfoEducationEqualTo(String value) {
            addCriterion("userinfo_education =", value, "userinfoEducation");
            return (Criteria) this;
        }

        public Criteria andUserinfoEducationNotEqualTo(String value) {
            addCriterion("userinfo_education <>", value, "userinfoEducation");
            return (Criteria) this;
        }

        public Criteria andUserinfoEducationGreaterThan(String value) {
            addCriterion("userinfo_education >", value, "userinfoEducation");
            return (Criteria) this;
        }

        public Criteria andUserinfoEducationGreaterThanOrEqualTo(String value) {
            addCriterion("userinfo_education >=", value, "userinfoEducation");
            return (Criteria) this;
        }

        public Criteria andUserinfoEducationLessThan(String value) {
            addCriterion("userinfo_education <", value, "userinfoEducation");
            return (Criteria) this;
        }

        public Criteria andUserinfoEducationLessThanOrEqualTo(String value) {
            addCriterion("userinfo_education <=", value, "userinfoEducation");
            return (Criteria) this;
        }

        public Criteria andUserinfoEducationLike(String value) {
            addCriterion("userinfo_education like", value, "userinfoEducation");
            return (Criteria) this;
        }

        public Criteria andUserinfoEducationNotLike(String value) {
            addCriterion("userinfo_education not like", value, "userinfoEducation");
            return (Criteria) this;
        }

        public Criteria andUserinfoEducationIn(List<String> values) {
            addCriterion("userinfo_education in", values, "userinfoEducation");
            return (Criteria) this;
        }

        public Criteria andUserinfoEducationNotIn(List<String> values) {
            addCriterion("userinfo_education not in", values, "userinfoEducation");
            return (Criteria) this;
        }

        public Criteria andUserinfoEducationBetween(String value1, String value2) {
            addCriterion("userinfo_education between", value1, value2, "userinfoEducation");
            return (Criteria) this;
        }

        public Criteria andUserinfoEducationNotBetween(String value1, String value2) {
            addCriterion("userinfo_education not between", value1, value2, "userinfoEducation");
            return (Criteria) this;
        }

        public Criteria andUserinfoOftenPlaceIsNull() {
            addCriterion("userinfo_often_place is null");
            return (Criteria) this;
        }

        public Criteria andUserinfoOftenPlaceIsNotNull() {
            addCriterion("userinfo_often_place is not null");
            return (Criteria) this;
        }

        public Criteria andUserinfoOftenPlaceEqualTo(String value) {
            addCriterion("userinfo_often_place =", value, "userinfoOftenPlace");
            return (Criteria) this;
        }

        public Criteria andUserinfoOftenPlaceNotEqualTo(String value) {
            addCriterion("userinfo_often_place <>", value, "userinfoOftenPlace");
            return (Criteria) this;
        }

        public Criteria andUserinfoOftenPlaceGreaterThan(String value) {
            addCriterion("userinfo_often_place >", value, "userinfoOftenPlace");
            return (Criteria) this;
        }

        public Criteria andUserinfoOftenPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("userinfo_often_place >=", value, "userinfoOftenPlace");
            return (Criteria) this;
        }

        public Criteria andUserinfoOftenPlaceLessThan(String value) {
            addCriterion("userinfo_often_place <", value, "userinfoOftenPlace");
            return (Criteria) this;
        }

        public Criteria andUserinfoOftenPlaceLessThanOrEqualTo(String value) {
            addCriterion("userinfo_often_place <=", value, "userinfoOftenPlace");
            return (Criteria) this;
        }

        public Criteria andUserinfoOftenPlaceLike(String value) {
            addCriterion("userinfo_often_place like", value, "userinfoOftenPlace");
            return (Criteria) this;
        }

        public Criteria andUserinfoOftenPlaceNotLike(String value) {
            addCriterion("userinfo_often_place not like", value, "userinfoOftenPlace");
            return (Criteria) this;
        }

        public Criteria andUserinfoOftenPlaceIn(List<String> values) {
            addCriterion("userinfo_often_place in", values, "userinfoOftenPlace");
            return (Criteria) this;
        }

        public Criteria andUserinfoOftenPlaceNotIn(List<String> values) {
            addCriterion("userinfo_often_place not in", values, "userinfoOftenPlace");
            return (Criteria) this;
        }

        public Criteria andUserinfoOftenPlaceBetween(String value1, String value2) {
            addCriterion("userinfo_often_place between", value1, value2, "userinfoOftenPlace");
            return (Criteria) this;
        }

        public Criteria andUserinfoOftenPlaceNotBetween(String value1, String value2) {
            addCriterion("userinfo_often_place not between", value1, value2, "userinfoOftenPlace");
            return (Criteria) this;
        }

        public Criteria andUserinfoRealNameIsNull() {
            addCriterion("userinfo_real_name is null");
            return (Criteria) this;
        }

        public Criteria andUserinfoRealNameIsNotNull() {
            addCriterion("userinfo_real_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserinfoRealNameEqualTo(String value) {
            addCriterion("userinfo_real_name =", value, "userinfoRealName");
            return (Criteria) this;
        }

        public Criteria andUserinfoRealNameNotEqualTo(String value) {
            addCriterion("userinfo_real_name <>", value, "userinfoRealName");
            return (Criteria) this;
        }

        public Criteria andUserinfoRealNameGreaterThan(String value) {
            addCriterion("userinfo_real_name >", value, "userinfoRealName");
            return (Criteria) this;
        }

        public Criteria andUserinfoRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("userinfo_real_name >=", value, "userinfoRealName");
            return (Criteria) this;
        }

        public Criteria andUserinfoRealNameLessThan(String value) {
            addCriterion("userinfo_real_name <", value, "userinfoRealName");
            return (Criteria) this;
        }

        public Criteria andUserinfoRealNameLessThanOrEqualTo(String value) {
            addCriterion("userinfo_real_name <=", value, "userinfoRealName");
            return (Criteria) this;
        }

        public Criteria andUserinfoRealNameLike(String value) {
            addCriterion("userinfo_real_name like", value, "userinfoRealName");
            return (Criteria) this;
        }

        public Criteria andUserinfoRealNameNotLike(String value) {
            addCriterion("userinfo_real_name not like", value, "userinfoRealName");
            return (Criteria) this;
        }

        public Criteria andUserinfoRealNameIn(List<String> values) {
            addCriterion("userinfo_real_name in", values, "userinfoRealName");
            return (Criteria) this;
        }

        public Criteria andUserinfoRealNameNotIn(List<String> values) {
            addCriterion("userinfo_real_name not in", values, "userinfoRealName");
            return (Criteria) this;
        }

        public Criteria andUserinfoRealNameBetween(String value1, String value2) {
            addCriterion("userinfo_real_name between", value1, value2, "userinfoRealName");
            return (Criteria) this;
        }

        public Criteria andUserinfoRealNameNotBetween(String value1, String value2) {
            addCriterion("userinfo_real_name not between", value1, value2, "userinfoRealName");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdNumberIsNull() {
            addCriterion("userinfo_ID_number is null");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdNumberIsNotNull() {
            addCriterion("userinfo_ID_number is not null");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdNumberEqualTo(String value) {
            addCriterion("userinfo_ID_number =", value, "userinfoIdNumber");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdNumberNotEqualTo(String value) {
            addCriterion("userinfo_ID_number <>", value, "userinfoIdNumber");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdNumberGreaterThan(String value) {
            addCriterion("userinfo_ID_number >", value, "userinfoIdNumber");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdNumberGreaterThanOrEqualTo(String value) {
            addCriterion("userinfo_ID_number >=", value, "userinfoIdNumber");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdNumberLessThan(String value) {
            addCriterion("userinfo_ID_number <", value, "userinfoIdNumber");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdNumberLessThanOrEqualTo(String value) {
            addCriterion("userinfo_ID_number <=", value, "userinfoIdNumber");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdNumberLike(String value) {
            addCriterion("userinfo_ID_number like", value, "userinfoIdNumber");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdNumberNotLike(String value) {
            addCriterion("userinfo_ID_number not like", value, "userinfoIdNumber");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdNumberIn(List<String> values) {
            addCriterion("userinfo_ID_number in", values, "userinfoIdNumber");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdNumberNotIn(List<String> values) {
            addCriterion("userinfo_ID_number not in", values, "userinfoIdNumber");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdNumberBetween(String value1, String value2) {
            addCriterion("userinfo_ID_number between", value1, value2, "userinfoIdNumber");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdNumberNotBetween(String value1, String value2) {
            addCriterion("userinfo_ID_number not between", value1, value2, "userinfoIdNumber");
            return (Criteria) this;
        }

        public Criteria andUserinfoQqIsNull() {
            addCriterion("userinfo_qq is null");
            return (Criteria) this;
        }

        public Criteria andUserinfoQqIsNotNull() {
            addCriterion("userinfo_qq is not null");
            return (Criteria) this;
        }

        public Criteria andUserinfoQqEqualTo(String value) {
            addCriterion("userinfo_qq =", value, "userinfoQq");
            return (Criteria) this;
        }

        public Criteria andUserinfoQqNotEqualTo(String value) {
            addCriterion("userinfo_qq <>", value, "userinfoQq");
            return (Criteria) this;
        }

        public Criteria andUserinfoQqGreaterThan(String value) {
            addCriterion("userinfo_qq >", value, "userinfoQq");
            return (Criteria) this;
        }

        public Criteria andUserinfoQqGreaterThanOrEqualTo(String value) {
            addCriterion("userinfo_qq >=", value, "userinfoQq");
            return (Criteria) this;
        }

        public Criteria andUserinfoQqLessThan(String value) {
            addCriterion("userinfo_qq <", value, "userinfoQq");
            return (Criteria) this;
        }

        public Criteria andUserinfoQqLessThanOrEqualTo(String value) {
            addCriterion("userinfo_qq <=", value, "userinfoQq");
            return (Criteria) this;
        }

        public Criteria andUserinfoQqLike(String value) {
            addCriterion("userinfo_qq like", value, "userinfoQq");
            return (Criteria) this;
        }

        public Criteria andUserinfoQqNotLike(String value) {
            addCriterion("userinfo_qq not like", value, "userinfoQq");
            return (Criteria) this;
        }

        public Criteria andUserinfoQqIn(List<String> values) {
            addCriterion("userinfo_qq in", values, "userinfoQq");
            return (Criteria) this;
        }

        public Criteria andUserinfoQqNotIn(List<String> values) {
            addCriterion("userinfo_qq not in", values, "userinfoQq");
            return (Criteria) this;
        }

        public Criteria andUserinfoQqBetween(String value1, String value2) {
            addCriterion("userinfo_qq between", value1, value2, "userinfoQq");
            return (Criteria) this;
        }

        public Criteria andUserinfoQqNotBetween(String value1, String value2) {
            addCriterion("userinfo_qq not between", value1, value2, "userinfoQq");
            return (Criteria) this;
        }

        public Criteria andUserinfoWechatIsNull() {
            addCriterion("userinfo_wechat is null");
            return (Criteria) this;
        }

        public Criteria andUserinfoWechatIsNotNull() {
            addCriterion("userinfo_wechat is not null");
            return (Criteria) this;
        }

        public Criteria andUserinfoWechatEqualTo(String value) {
            addCriterion("userinfo_wechat =", value, "userinfoWechat");
            return (Criteria) this;
        }

        public Criteria andUserinfoWechatNotEqualTo(String value) {
            addCriterion("userinfo_wechat <>", value, "userinfoWechat");
            return (Criteria) this;
        }

        public Criteria andUserinfoWechatGreaterThan(String value) {
            addCriterion("userinfo_wechat >", value, "userinfoWechat");
            return (Criteria) this;
        }

        public Criteria andUserinfoWechatGreaterThanOrEqualTo(String value) {
            addCriterion("userinfo_wechat >=", value, "userinfoWechat");
            return (Criteria) this;
        }

        public Criteria andUserinfoWechatLessThan(String value) {
            addCriterion("userinfo_wechat <", value, "userinfoWechat");
            return (Criteria) this;
        }

        public Criteria andUserinfoWechatLessThanOrEqualTo(String value) {
            addCriterion("userinfo_wechat <=", value, "userinfoWechat");
            return (Criteria) this;
        }

        public Criteria andUserinfoWechatLike(String value) {
            addCriterion("userinfo_wechat like", value, "userinfoWechat");
            return (Criteria) this;
        }

        public Criteria andUserinfoWechatNotLike(String value) {
            addCriterion("userinfo_wechat not like", value, "userinfoWechat");
            return (Criteria) this;
        }

        public Criteria andUserinfoWechatIn(List<String> values) {
            addCriterion("userinfo_wechat in", values, "userinfoWechat");
            return (Criteria) this;
        }

        public Criteria andUserinfoWechatNotIn(List<String> values) {
            addCriterion("userinfo_wechat not in", values, "userinfoWechat");
            return (Criteria) this;
        }

        public Criteria andUserinfoWechatBetween(String value1, String value2) {
            addCriterion("userinfo_wechat between", value1, value2, "userinfoWechat");
            return (Criteria) this;
        }

        public Criteria andUserinfoWechatNotBetween(String value1, String value2) {
            addCriterion("userinfo_wechat not between", value1, value2, "userinfoWechat");
            return (Criteria) this;
        }

        public Criteria andUserinfoMicroblogIsNull() {
            addCriterion("userinfo_microblog is null");
            return (Criteria) this;
        }

        public Criteria andUserinfoMicroblogIsNotNull() {
            addCriterion("userinfo_microblog is not null");
            return (Criteria) this;
        }

        public Criteria andUserinfoMicroblogEqualTo(String value) {
            addCriterion("userinfo_microblog =", value, "userinfoMicroblog");
            return (Criteria) this;
        }

        public Criteria andUserinfoMicroblogNotEqualTo(String value) {
            addCriterion("userinfo_microblog <>", value, "userinfoMicroblog");
            return (Criteria) this;
        }

        public Criteria andUserinfoMicroblogGreaterThan(String value) {
            addCriterion("userinfo_microblog >", value, "userinfoMicroblog");
            return (Criteria) this;
        }

        public Criteria andUserinfoMicroblogGreaterThanOrEqualTo(String value) {
            addCriterion("userinfo_microblog >=", value, "userinfoMicroblog");
            return (Criteria) this;
        }

        public Criteria andUserinfoMicroblogLessThan(String value) {
            addCriterion("userinfo_microblog <", value, "userinfoMicroblog");
            return (Criteria) this;
        }

        public Criteria andUserinfoMicroblogLessThanOrEqualTo(String value) {
            addCriterion("userinfo_microblog <=", value, "userinfoMicroblog");
            return (Criteria) this;
        }

        public Criteria andUserinfoMicroblogLike(String value) {
            addCriterion("userinfo_microblog like", value, "userinfoMicroblog");
            return (Criteria) this;
        }

        public Criteria andUserinfoMicroblogNotLike(String value) {
            addCriterion("userinfo_microblog not like", value, "userinfoMicroblog");
            return (Criteria) this;
        }

        public Criteria andUserinfoMicroblogIn(List<String> values) {
            addCriterion("userinfo_microblog in", values, "userinfoMicroblog");
            return (Criteria) this;
        }

        public Criteria andUserinfoMicroblogNotIn(List<String> values) {
            addCriterion("userinfo_microblog not in", values, "userinfoMicroblog");
            return (Criteria) this;
        }

        public Criteria andUserinfoMicroblogBetween(String value1, String value2) {
            addCriterion("userinfo_microblog between", value1, value2, "userinfoMicroblog");
            return (Criteria) this;
        }

        public Criteria andUserinfoMicroblogNotBetween(String value1, String value2) {
            addCriterion("userinfo_microblog not between", value1, value2, "userinfoMicroblog");
            return (Criteria) this;
        }

        public Criteria andUserinfoConstellationIsNull() {
            addCriterion("userinfo_constellation is null");
            return (Criteria) this;
        }

        public Criteria andUserinfoConstellationIsNotNull() {
            addCriterion("userinfo_constellation is not null");
            return (Criteria) this;
        }

        public Criteria andUserinfoConstellationEqualTo(String value) {
            addCriterion("userinfo_constellation =", value, "userinfoConstellation");
            return (Criteria) this;
        }

        public Criteria andUserinfoConstellationNotEqualTo(String value) {
            addCriterion("userinfo_constellation <>", value, "userinfoConstellation");
            return (Criteria) this;
        }

        public Criteria andUserinfoConstellationGreaterThan(String value) {
            addCriterion("userinfo_constellation >", value, "userinfoConstellation");
            return (Criteria) this;
        }

        public Criteria andUserinfoConstellationGreaterThanOrEqualTo(String value) {
            addCriterion("userinfo_constellation >=", value, "userinfoConstellation");
            return (Criteria) this;
        }

        public Criteria andUserinfoConstellationLessThan(String value) {
            addCriterion("userinfo_constellation <", value, "userinfoConstellation");
            return (Criteria) this;
        }

        public Criteria andUserinfoConstellationLessThanOrEqualTo(String value) {
            addCriterion("userinfo_constellation <=", value, "userinfoConstellation");
            return (Criteria) this;
        }

        public Criteria andUserinfoConstellationLike(String value) {
            addCriterion("userinfo_constellation like", value, "userinfoConstellation");
            return (Criteria) this;
        }

        public Criteria andUserinfoConstellationNotLike(String value) {
            addCriterion("userinfo_constellation not like", value, "userinfoConstellation");
            return (Criteria) this;
        }

        public Criteria andUserinfoConstellationIn(List<String> values) {
            addCriterion("userinfo_constellation in", values, "userinfoConstellation");
            return (Criteria) this;
        }

        public Criteria andUserinfoConstellationNotIn(List<String> values) {
            addCriterion("userinfo_constellation not in", values, "userinfoConstellation");
            return (Criteria) this;
        }

        public Criteria andUserinfoConstellationBetween(String value1, String value2) {
            addCriterion("userinfo_constellation between", value1, value2, "userinfoConstellation");
            return (Criteria) this;
        }

        public Criteria andUserinfoConstellationNotBetween(String value1, String value2) {
            addCriterion("userinfo_constellation not between", value1, value2, "userinfoConstellation");
            return (Criteria) this;
        }

        public Criteria andUserinfoBloodTypeIsNull() {
            addCriterion("userinfo_Blood_type is null");
            return (Criteria) this;
        }

        public Criteria andUserinfoBloodTypeIsNotNull() {
            addCriterion("userinfo_Blood_type is not null");
            return (Criteria) this;
        }

        public Criteria andUserinfoBloodTypeEqualTo(String value) {
            addCriterion("userinfo_Blood_type =", value, "userinfoBloodType");
            return (Criteria) this;
        }

        public Criteria andUserinfoBloodTypeNotEqualTo(String value) {
            addCriterion("userinfo_Blood_type <>", value, "userinfoBloodType");
            return (Criteria) this;
        }

        public Criteria andUserinfoBloodTypeGreaterThan(String value) {
            addCriterion("userinfo_Blood_type >", value, "userinfoBloodType");
            return (Criteria) this;
        }

        public Criteria andUserinfoBloodTypeGreaterThanOrEqualTo(String value) {
            addCriterion("userinfo_Blood_type >=", value, "userinfoBloodType");
            return (Criteria) this;
        }

        public Criteria andUserinfoBloodTypeLessThan(String value) {
            addCriterion("userinfo_Blood_type <", value, "userinfoBloodType");
            return (Criteria) this;
        }

        public Criteria andUserinfoBloodTypeLessThanOrEqualTo(String value) {
            addCriterion("userinfo_Blood_type <=", value, "userinfoBloodType");
            return (Criteria) this;
        }

        public Criteria andUserinfoBloodTypeLike(String value) {
            addCriterion("userinfo_Blood_type like", value, "userinfoBloodType");
            return (Criteria) this;
        }

        public Criteria andUserinfoBloodTypeNotLike(String value) {
            addCriterion("userinfo_Blood_type not like", value, "userinfoBloodType");
            return (Criteria) this;
        }

        public Criteria andUserinfoBloodTypeIn(List<String> values) {
            addCriterion("userinfo_Blood_type in", values, "userinfoBloodType");
            return (Criteria) this;
        }

        public Criteria andUserinfoBloodTypeNotIn(List<String> values) {
            addCriterion("userinfo_Blood_type not in", values, "userinfoBloodType");
            return (Criteria) this;
        }

        public Criteria andUserinfoBloodTypeBetween(String value1, String value2) {
            addCriterion("userinfo_Blood_type between", value1, value2, "userinfoBloodType");
            return (Criteria) this;
        }

        public Criteria andUserinfoBloodTypeNotBetween(String value1, String value2) {
            addCriterion("userinfo_Blood_type not between", value1, value2, "userinfoBloodType");
            return (Criteria) this;
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

        public Criteria andUserinfoModeIsNull() {
            addCriterion("userinfo_mode is null");
            return (Criteria) this;
        }

        public Criteria andUserinfoModeIsNotNull() {
            addCriterion("userinfo_mode is not null");
            return (Criteria) this;
        }

        public Criteria andUserinfoModeEqualTo(String value) {
            addCriterion("userinfo_mode =", value, "userinfoMode");
            return (Criteria) this;
        }

        public Criteria andUserinfoModeNotEqualTo(String value) {
            addCriterion("userinfo_mode <>", value, "userinfoMode");
            return (Criteria) this;
        }

        public Criteria andUserinfoModeGreaterThan(String value) {
            addCriterion("userinfo_mode >", value, "userinfoMode");
            return (Criteria) this;
        }

        public Criteria andUserinfoModeGreaterThanOrEqualTo(String value) {
            addCriterion("userinfo_mode >=", value, "userinfoMode");
            return (Criteria) this;
        }

        public Criteria andUserinfoModeLessThan(String value) {
            addCriterion("userinfo_mode <", value, "userinfoMode");
            return (Criteria) this;
        }

        public Criteria andUserinfoModeLessThanOrEqualTo(String value) {
            addCriterion("userinfo_mode <=", value, "userinfoMode");
            return (Criteria) this;
        }

        public Criteria andUserinfoModeLike(String value) {
            addCriterion("userinfo_mode like", value, "userinfoMode");
            return (Criteria) this;
        }

        public Criteria andUserinfoModeNotLike(String value) {
            addCriterion("userinfo_mode not like", value, "userinfoMode");
            return (Criteria) this;
        }

        public Criteria andUserinfoModeIn(List<String> values) {
            addCriterion("userinfo_mode in", values, "userinfoMode");
            return (Criteria) this;
        }

        public Criteria andUserinfoModeNotIn(List<String> values) {
            addCriterion("userinfo_mode not in", values, "userinfoMode");
            return (Criteria) this;
        }

        public Criteria andUserinfoModeBetween(String value1, String value2) {
            addCriterion("userinfo_mode between", value1, value2, "userinfoMode");
            return (Criteria) this;
        }

        public Criteria andUserinfoModeNotBetween(String value1, String value2) {
            addCriterion("userinfo_mode not between", value1, value2, "userinfoMode");
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