package com.qa.springboot.pojo;

import java.util.ArrayList;
import java.util.List;

public class AdministratorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdministratorExample() {
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

        public Criteria andAidIsNull() {
            addCriterion("aid is null");
            return (Criteria) this;
        }

        public Criteria andAidIsNotNull() {
            addCriterion("aid is not null");
            return (Criteria) this;
        }

        public Criteria andAidEqualTo(Integer value) {
            addCriterion("aid =", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotEqualTo(Integer value) {
            addCriterion("aid <>", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThan(Integer value) {
            addCriterion("aid >", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThanOrEqualTo(Integer value) {
            addCriterion("aid >=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThan(Integer value) {
            addCriterion("aid <", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThanOrEqualTo(Integer value) {
            addCriterion("aid <=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidIn(List<Integer> values) {
            addCriterion("aid in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotIn(List<Integer> values) {
            addCriterion("aid not in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidBetween(Integer value1, Integer value2) {
            addCriterion("aid between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotBetween(Integer value1, Integer value2) {
            addCriterion("aid not between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andAnameIsNull() {
            addCriterion("aname is null");
            return (Criteria) this;
        }

        public Criteria andAnameIsNotNull() {
            addCriterion("aname is not null");
            return (Criteria) this;
        }

        public Criteria andAnameEqualTo(String value) {
            addCriterion("aname =", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameNotEqualTo(String value) {
            addCriterion("aname <>", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameGreaterThan(String value) {
            addCriterion("aname >", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameGreaterThanOrEqualTo(String value) {
            addCriterion("aname >=", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameLessThan(String value) {
            addCriterion("aname <", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameLessThanOrEqualTo(String value) {
            addCriterion("aname <=", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameLike(String value) {
            addCriterion("aname like", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameNotLike(String value) {
            addCriterion("aname not like", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameIn(List<String> values) {
            addCriterion("aname in", values, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameNotIn(List<String> values) {
            addCriterion("aname not in", values, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameBetween(String value1, String value2) {
            addCriterion("aname between", value1, value2, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameNotBetween(String value1, String value2) {
            addCriterion("aname not between", value1, value2, "aname");
            return (Criteria) this;
        }

        public Criteria andApwIsNull() {
            addCriterion("apw is null");
            return (Criteria) this;
        }

        public Criteria andApwIsNotNull() {
            addCriterion("apw is not null");
            return (Criteria) this;
        }

        public Criteria andApwEqualTo(String value) {
            addCriterion("apw =", value, "apw");
            return (Criteria) this;
        }

        public Criteria andApwNotEqualTo(String value) {
            addCriterion("apw <>", value, "apw");
            return (Criteria) this;
        }

        public Criteria andApwGreaterThan(String value) {
            addCriterion("apw >", value, "apw");
            return (Criteria) this;
        }

        public Criteria andApwGreaterThanOrEqualTo(String value) {
            addCriterion("apw >=", value, "apw");
            return (Criteria) this;
        }

        public Criteria andApwLessThan(String value) {
            addCriterion("apw <", value, "apw");
            return (Criteria) this;
        }

        public Criteria andApwLessThanOrEqualTo(String value) {
            addCriterion("apw <=", value, "apw");
            return (Criteria) this;
        }

        public Criteria andApwLike(String value) {
            addCriterion("apw like", value, "apw");
            return (Criteria) this;
        }

        public Criteria andApwNotLike(String value) {
            addCriterion("apw not like", value, "apw");
            return (Criteria) this;
        }

        public Criteria andApwIn(List<String> values) {
            addCriterion("apw in", values, "apw");
            return (Criteria) this;
        }

        public Criteria andApwNotIn(List<String> values) {
            addCriterion("apw not in", values, "apw");
            return (Criteria) this;
        }

        public Criteria andApwBetween(String value1, String value2) {
            addCriterion("apw between", value1, value2, "apw");
            return (Criteria) this;
        }

        public Criteria andApwNotBetween(String value1, String value2) {
            addCriterion("apw not between", value1, value2, "apw");
            return (Criteria) this;
        }

        public Criteria andHeadportraitIsNull() {
            addCriterion("headPortrait is null");
            return (Criteria) this;
        }

        public Criteria andHeadportraitIsNotNull() {
            addCriterion("headPortrait is not null");
            return (Criteria) this;
        }

        public Criteria andHeadportraitEqualTo(String value) {
            addCriterion("headPortrait =", value, "headportrait");
            return (Criteria) this;
        }

        public Criteria andHeadportraitNotEqualTo(String value) {
            addCriterion("headPortrait <>", value, "headportrait");
            return (Criteria) this;
        }

        public Criteria andHeadportraitGreaterThan(String value) {
            addCriterion("headPortrait >", value, "headportrait");
            return (Criteria) this;
        }

        public Criteria andHeadportraitGreaterThanOrEqualTo(String value) {
            addCriterion("headPortrait >=", value, "headportrait");
            return (Criteria) this;
        }

        public Criteria andHeadportraitLessThan(String value) {
            addCriterion("headPortrait <", value, "headportrait");
            return (Criteria) this;
        }

        public Criteria andHeadportraitLessThanOrEqualTo(String value) {
            addCriterion("headPortrait <=", value, "headportrait");
            return (Criteria) this;
        }

        public Criteria andHeadportraitLike(String value) {
            addCriterion("headPortrait like", value, "headportrait");
            return (Criteria) this;
        }

        public Criteria andHeadportraitNotLike(String value) {
            addCriterion("headPortrait not like", value, "headportrait");
            return (Criteria) this;
        }

        public Criteria andHeadportraitIn(List<String> values) {
            addCriterion("headPortrait in", values, "headportrait");
            return (Criteria) this;
        }

        public Criteria andHeadportraitNotIn(List<String> values) {
            addCriterion("headPortrait not in", values, "headportrait");
            return (Criteria) this;
        }

        public Criteria andHeadportraitBetween(String value1, String value2) {
            addCriterion("headPortrait between", value1, value2, "headportrait");
            return (Criteria) this;
        }

        public Criteria andHeadportraitNotBetween(String value1, String value2) {
            addCriterion("headPortrait not between", value1, value2, "headportrait");
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