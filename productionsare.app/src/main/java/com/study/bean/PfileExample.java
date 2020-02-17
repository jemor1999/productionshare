package com.study.bean;

import java.util.ArrayList;
import java.util.List;

public class PfileExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PfileExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andPfileIdIsNull() {
            addCriterion("pfile_id is null");
            return (Criteria) this;
        }

        public Criteria andPfileIdIsNotNull() {
            addCriterion("pfile_id is not null");
            return (Criteria) this;
        }

        public Criteria andPfileIdEqualTo(Integer value) {
            addCriterion("pfile_id =", value, "pfileId");
            return (Criteria) this;
        }

        public Criteria andPfileIdNotEqualTo(Integer value) {
            addCriterion("pfile_id <>", value, "pfileId");
            return (Criteria) this;
        }

        public Criteria andPfileIdGreaterThan(Integer value) {
            addCriterion("pfile_id >", value, "pfileId");
            return (Criteria) this;
        }

        public Criteria andPfileIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pfile_id >=", value, "pfileId");
            return (Criteria) this;
        }

        public Criteria andPfileIdLessThan(Integer value) {
            addCriterion("pfile_id <", value, "pfileId");
            return (Criteria) this;
        }

        public Criteria andPfileIdLessThanOrEqualTo(Integer value) {
            addCriterion("pfile_id <=", value, "pfileId");
            return (Criteria) this;
        }

        public Criteria andPfileIdIn(List<Integer> values) {
            addCriterion("pfile_id in", values, "pfileId");
            return (Criteria) this;
        }

        public Criteria andPfileIdNotIn(List<Integer> values) {
            addCriterion("pfile_id not in", values, "pfileId");
            return (Criteria) this;
        }

        public Criteria andPfileIdBetween(Integer value1, Integer value2) {
            addCriterion("pfile_id between", value1, value2, "pfileId");
            return (Criteria) this;
        }

        public Criteria andPfileIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pfile_id not between", value1, value2, "pfileId");
            return (Criteria) this;
        }

        public Criteria andPfileNameIsNull() {
            addCriterion("pfile_name is null");
            return (Criteria) this;
        }

        public Criteria andPfileNameIsNotNull() {
            addCriterion("pfile_name is not null");
            return (Criteria) this;
        }

        public Criteria andPfileNameEqualTo(String value) {
            addCriterion("pfile_name =", value, "pfileName");
            return (Criteria) this;
        }

        public Criteria andPfileNameNotEqualTo(String value) {
            addCriterion("pfile_name <>", value, "pfileName");
            return (Criteria) this;
        }

        public Criteria andPfileNameGreaterThan(String value) {
            addCriterion("pfile_name >", value, "pfileName");
            return (Criteria) this;
        }

        public Criteria andPfileNameGreaterThanOrEqualTo(String value) {
            addCriterion("pfile_name >=", value, "pfileName");
            return (Criteria) this;
        }

        public Criteria andPfileNameLessThan(String value) {
            addCriterion("pfile_name <", value, "pfileName");
            return (Criteria) this;
        }

        public Criteria andPfileNameLessThanOrEqualTo(String value) {
            addCriterion("pfile_name <=", value, "pfileName");
            return (Criteria) this;
        }

        public Criteria andPfileNameLike(String value) {
            addCriterion("pfile_name like", value, "pfileName");
            return (Criteria) this;
        }

        public Criteria andPfileNameNotLike(String value) {
            addCriterion("pfile_name not like", value, "pfileName");
            return (Criteria) this;
        }

        public Criteria andPfileNameIn(List<String> values) {
            addCriterion("pfile_name in", values, "pfileName");
            return (Criteria) this;
        }

        public Criteria andPfileNameNotIn(List<String> values) {
            addCriterion("pfile_name not in", values, "pfileName");
            return (Criteria) this;
        }

        public Criteria andPfileNameBetween(String value1, String value2) {
            addCriterion("pfile_name between", value1, value2, "pfileName");
            return (Criteria) this;
        }

        public Criteria andPfileNameNotBetween(String value1, String value2) {
            addCriterion("pfile_name not between", value1, value2, "pfileName");
            return (Criteria) this;
        }

        public Criteria andPfilePathIsNull() {
            addCriterion("pfile_path is null");
            return (Criteria) this;
        }

        public Criteria andPfilePathIsNotNull() {
            addCriterion("pfile_path is not null");
            return (Criteria) this;
        }

        public Criteria andPfilePathEqualTo(String value) {
            addCriterion("pfile_path =", value, "pfilePath");
            return (Criteria) this;
        }

        public Criteria andPfilePathNotEqualTo(String value) {
            addCriterion("pfile_path <>", value, "pfilePath");
            return (Criteria) this;
        }

        public Criteria andPfilePathGreaterThan(String value) {
            addCriterion("pfile_path >", value, "pfilePath");
            return (Criteria) this;
        }

        public Criteria andPfilePathGreaterThanOrEqualTo(String value) {
            addCriterion("pfile_path >=", value, "pfilePath");
            return (Criteria) this;
        }

        public Criteria andPfilePathLessThan(String value) {
            addCriterion("pfile_path <", value, "pfilePath");
            return (Criteria) this;
        }

        public Criteria andPfilePathLessThanOrEqualTo(String value) {
            addCriterion("pfile_path <=", value, "pfilePath");
            return (Criteria) this;
        }

        public Criteria andPfilePathLike(String value) {
            addCriterion("pfile_path like", value, "pfilePath");
            return (Criteria) this;
        }

        public Criteria andPfilePathNotLike(String value) {
            addCriterion("pfile_path not like", value, "pfilePath");
            return (Criteria) this;
        }

        public Criteria andPfilePathIn(List<String> values) {
            addCriterion("pfile_path in", values, "pfilePath");
            return (Criteria) this;
        }

        public Criteria andPfilePathNotIn(List<String> values) {
            addCriterion("pfile_path not in", values, "pfilePath");
            return (Criteria) this;
        }

        public Criteria andPfilePathBetween(String value1, String value2) {
            addCriterion("pfile_path between", value1, value2, "pfilePath");
            return (Criteria) this;
        }

        public Criteria andPfilePathNotBetween(String value1, String value2) {
            addCriterion("pfile_path not between", value1, value2, "pfilePath");
            return (Criteria) this;
        }

        public Criteria andPfileInfoIsNull() {
            addCriterion("pfile_info is null");
            return (Criteria) this;
        }

        public Criteria andPfileInfoIsNotNull() {
            addCriterion("pfile_info is not null");
            return (Criteria) this;
        }

        public Criteria andPfileInfoEqualTo(String value) {
            addCriterion("pfile_info =", value, "pfileInfo");
            return (Criteria) this;
        }

        public Criteria andPfileInfoNotEqualTo(String value) {
            addCriterion("pfile_info <>", value, "pfileInfo");
            return (Criteria) this;
        }

        public Criteria andPfileInfoGreaterThan(String value) {
            addCriterion("pfile_info >", value, "pfileInfo");
            return (Criteria) this;
        }

        public Criteria andPfileInfoGreaterThanOrEqualTo(String value) {
            addCriterion("pfile_info >=", value, "pfileInfo");
            return (Criteria) this;
        }

        public Criteria andPfileInfoLessThan(String value) {
            addCriterion("pfile_info <", value, "pfileInfo");
            return (Criteria) this;
        }

        public Criteria andPfileInfoLessThanOrEqualTo(String value) {
            addCriterion("pfile_info <=", value, "pfileInfo");
            return (Criteria) this;
        }

        public Criteria andPfileInfoLike(String value) {
            addCriterion("pfile_info like", value, "pfileInfo");
            return (Criteria) this;
        }

        public Criteria andPfileInfoNotLike(String value) {
            addCriterion("pfile_info not like", value, "pfileInfo");
            return (Criteria) this;
        }

        public Criteria andPfileInfoIn(List<String> values) {
            addCriterion("pfile_info in", values, "pfileInfo");
            return (Criteria) this;
        }

        public Criteria andPfileInfoNotIn(List<String> values) {
            addCriterion("pfile_info not in", values, "pfileInfo");
            return (Criteria) this;
        }

        public Criteria andPfileInfoBetween(String value1, String value2) {
            addCriterion("pfile_info between", value1, value2, "pfileInfo");
            return (Criteria) this;
        }

        public Criteria andPfileInfoNotBetween(String value1, String value2) {
            addCriterion("pfile_info not between", value1, value2, "pfileInfo");
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