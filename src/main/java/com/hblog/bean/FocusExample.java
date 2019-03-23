package com.hblog.bean;

import java.util.ArrayList;
import java.util.List;

public class FocusExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FocusExample() {
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

        public Criteria andFIdIsNull() {
            addCriterion("f_id is null");
            return (Criteria) this;
        }

        public Criteria andFIdIsNotNull() {
            addCriterion("f_id is not null");
            return (Criteria) this;
        }

        public Criteria andFIdEqualTo(Integer value) {
            addCriterion("f_id =", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotEqualTo(Integer value) {
            addCriterion("f_id <>", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdGreaterThan(Integer value) {
            addCriterion("f_id >", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_id >=", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdLessThan(Integer value) {
            addCriterion("f_id <", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdLessThanOrEqualTo(Integer value) {
            addCriterion("f_id <=", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdIn(List<Integer> values) {
            addCriterion("f_id in", values, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotIn(List<Integer> values) {
            addCriterion("f_id not in", values, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdBetween(Integer value1, Integer value2) {
            addCriterion("f_id between", value1, value2, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotBetween(Integer value1, Integer value2) {
            addCriterion("f_id not between", value1, value2, "fId");
            return (Criteria) this;
        }

        public Criteria andFocusUseridIsNull() {
            addCriterion("focus_userid is null");
            return (Criteria) this;
        }

        public Criteria andFocusUseridIsNotNull() {
            addCriterion("focus_userid is not null");
            return (Criteria) this;
        }

        public Criteria andFocusUseridEqualTo(Integer value) {
            addCriterion("focus_userid =", value, "focusUserid");
            return (Criteria) this;
        }

        public Criteria andFocusUseridNotEqualTo(Integer value) {
            addCriterion("focus_userid <>", value, "focusUserid");
            return (Criteria) this;
        }

        public Criteria andFocusUseridGreaterThan(Integer value) {
            addCriterion("focus_userid >", value, "focusUserid");
            return (Criteria) this;
        }

        public Criteria andFocusUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("focus_userid >=", value, "focusUserid");
            return (Criteria) this;
        }

        public Criteria andFocusUseridLessThan(Integer value) {
            addCriterion("focus_userid <", value, "focusUserid");
            return (Criteria) this;
        }

        public Criteria andFocusUseridLessThanOrEqualTo(Integer value) {
            addCriterion("focus_userid <=", value, "focusUserid");
            return (Criteria) this;
        }

        public Criteria andFocusUseridIn(List<Integer> values) {
            addCriterion("focus_userid in", values, "focusUserid");
            return (Criteria) this;
        }

        public Criteria andFocusUseridNotIn(List<Integer> values) {
            addCriterion("focus_userid not in", values, "focusUserid");
            return (Criteria) this;
        }

        public Criteria andFocusUseridBetween(Integer value1, Integer value2) {
            addCriterion("focus_userid between", value1, value2, "focusUserid");
            return (Criteria) this;
        }

        public Criteria andFocusUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("focus_userid not between", value1, value2, "focusUserid");
            return (Criteria) this;
        }

        public Criteria andFocusFocusidIsNull() {
            addCriterion("focus_focusid is null");
            return (Criteria) this;
        }

        public Criteria andFocusFocusidIsNotNull() {
            addCriterion("focus_focusid is not null");
            return (Criteria) this;
        }

        public Criteria andFocusFocusidEqualTo(Integer value) {
            addCriterion("focus_focusid =", value, "focusFocusid");
            return (Criteria) this;
        }

        public Criteria andFocusFocusidNotEqualTo(Integer value) {
            addCriterion("focus_focusid <>", value, "focusFocusid");
            return (Criteria) this;
        }

        public Criteria andFocusFocusidGreaterThan(Integer value) {
            addCriterion("focus_focusid >", value, "focusFocusid");
            return (Criteria) this;
        }

        public Criteria andFocusFocusidGreaterThanOrEqualTo(Integer value) {
            addCriterion("focus_focusid >=", value, "focusFocusid");
            return (Criteria) this;
        }

        public Criteria andFocusFocusidLessThan(Integer value) {
            addCriterion("focus_focusid <", value, "focusFocusid");
            return (Criteria) this;
        }

        public Criteria andFocusFocusidLessThanOrEqualTo(Integer value) {
            addCriterion("focus_focusid <=", value, "focusFocusid");
            return (Criteria) this;
        }

        public Criteria andFocusFocusidIn(List<Integer> values) {
            addCriterion("focus_focusid in", values, "focusFocusid");
            return (Criteria) this;
        }

        public Criteria andFocusFocusidNotIn(List<Integer> values) {
            addCriterion("focus_focusid not in", values, "focusFocusid");
            return (Criteria) this;
        }

        public Criteria andFocusFocusidBetween(Integer value1, Integer value2) {
            addCriterion("focus_focusid between", value1, value2, "focusFocusid");
            return (Criteria) this;
        }

        public Criteria andFocusFocusidNotBetween(Integer value1, Integer value2) {
            addCriterion("focus_focusid not between", value1, value2, "focusFocusid");
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