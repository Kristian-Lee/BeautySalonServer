package com.example.beautysalon.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BusinessHoursExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table business_hours
     *
     * @mbg.generated Wed Apr 14 15:46:13 CST 2021
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table business_hours
     *
     * @mbg.generated Wed Apr 14 15:46:13 CST 2021
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table business_hours
     *
     * @mbg.generated Wed Apr 14 15:46:13 CST 2021
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business_hours
     *
     * @mbg.generated Wed Apr 14 15:46:13 CST 2021
     */
    public BusinessHoursExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business_hours
     *
     * @mbg.generated Wed Apr 14 15:46:13 CST 2021
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business_hours
     *
     * @mbg.generated Wed Apr 14 15:46:13 CST 2021
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business_hours
     *
     * @mbg.generated Wed Apr 14 15:46:13 CST 2021
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business_hours
     *
     * @mbg.generated Wed Apr 14 15:46:13 CST 2021
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business_hours
     *
     * @mbg.generated Wed Apr 14 15:46:13 CST 2021
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business_hours
     *
     * @mbg.generated Wed Apr 14 15:46:13 CST 2021
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business_hours
     *
     * @mbg.generated Wed Apr 14 15:46:13 CST 2021
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business_hours
     *
     * @mbg.generated Wed Apr 14 15:46:13 CST 2021
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business_hours
     *
     * @mbg.generated Wed Apr 14 15:46:13 CST 2021
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business_hours
     *
     * @mbg.generated Wed Apr 14 15:46:13 CST 2021
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table business_hours
     *
     * @mbg.generated Wed Apr 14 15:46:13 CST 2021
     */
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andStylistIdIsNull() {
            addCriterion("stylist_id is null");
            return (Criteria) this;
        }

        public Criteria andStylistIdIsNotNull() {
            addCriterion("stylist_id is not null");
            return (Criteria) this;
        }

        public Criteria andStylistIdEqualTo(Integer value) {
            addCriterion("stylist_id =", value, "stylistId");
            return (Criteria) this;
        }

        public Criteria andStylistIdNotEqualTo(Integer value) {
            addCriterion("stylist_id <>", value, "stylistId");
            return (Criteria) this;
        }

        public Criteria andStylistIdGreaterThan(Integer value) {
            addCriterion("stylist_id >", value, "stylistId");
            return (Criteria) this;
        }

        public Criteria andStylistIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stylist_id >=", value, "stylistId");
            return (Criteria) this;
        }

        public Criteria andStylistIdLessThan(Integer value) {
            addCriterion("stylist_id <", value, "stylistId");
            return (Criteria) this;
        }

        public Criteria andStylistIdLessThanOrEqualTo(Integer value) {
            addCriterion("stylist_id <=", value, "stylistId");
            return (Criteria) this;
        }

        public Criteria andStylistIdIn(List<Integer> values) {
            addCriterion("stylist_id in", values, "stylistId");
            return (Criteria) this;
        }

        public Criteria andStylistIdNotIn(List<Integer> values) {
            addCriterion("stylist_id not in", values, "stylistId");
            return (Criteria) this;
        }

        public Criteria andStylistIdBetween(Integer value1, Integer value2) {
            addCriterion("stylist_id between", value1, value2, "stylistId");
            return (Criteria) this;
        }

        public Criteria andStylistIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stylist_id not between", value1, value2, "stylistId");
            return (Criteria) this;
        }

        public Criteria andDateFromIsNull() {
            addCriterion("date_from is null");
            return (Criteria) this;
        }

        public Criteria andDateFromIsNotNull() {
            addCriterion("date_from is not null");
            return (Criteria) this;
        }

        public Criteria andDateFromEqualTo(Date value) {
            addCriterion("date_from =", value, "dateFrom");
            return (Criteria) this;
        }

        public Criteria andDateFromNotEqualTo(Date value) {
            addCriterion("date_from <>", value, "dateFrom");
            return (Criteria) this;
        }

        public Criteria andDateFromGreaterThan(Date value) {
            addCriterion("date_from >", value, "dateFrom");
            return (Criteria) this;
        }

        public Criteria andDateFromGreaterThanOrEqualTo(Date value) {
            addCriterion("date_from >=", value, "dateFrom");
            return (Criteria) this;
        }

        public Criteria andDateFromLessThan(Date value) {
            addCriterion("date_from <", value, "dateFrom");
            return (Criteria) this;
        }

        public Criteria andDateFromLessThanOrEqualTo(Date value) {
            addCriterion("date_from <=", value, "dateFrom");
            return (Criteria) this;
        }

        public Criteria andDateFromIn(List<Date> values) {
            addCriterion("date_from in", values, "dateFrom");
            return (Criteria) this;
        }

        public Criteria andDateFromNotIn(List<Date> values) {
            addCriterion("date_from not in", values, "dateFrom");
            return (Criteria) this;
        }

        public Criteria andDateFromBetween(Date value1, Date value2) {
            addCriterion("date_from between", value1, value2, "dateFrom");
            return (Criteria) this;
        }

        public Criteria andDateFromNotBetween(Date value1, Date value2) {
            addCriterion("date_from not between", value1, value2, "dateFrom");
            return (Criteria) this;
        }

        public Criteria andDateToIsNull() {
            addCriterion("date_to is null");
            return (Criteria) this;
        }

        public Criteria andDateToIsNotNull() {
            addCriterion("date_to is not null");
            return (Criteria) this;
        }

        public Criteria andDateToEqualTo(Date value) {
            addCriterion("date_to =", value, "dateTo");
            return (Criteria) this;
        }

        public Criteria andDateToNotEqualTo(Date value) {
            addCriterion("date_to <>", value, "dateTo");
            return (Criteria) this;
        }

        public Criteria andDateToGreaterThan(Date value) {
            addCriterion("date_to >", value, "dateTo");
            return (Criteria) this;
        }

        public Criteria andDateToGreaterThanOrEqualTo(Date value) {
            addCriterion("date_to >=", value, "dateTo");
            return (Criteria) this;
        }

        public Criteria andDateToLessThan(Date value) {
            addCriterion("date_to <", value, "dateTo");
            return (Criteria) this;
        }

        public Criteria andDateToLessThanOrEqualTo(Date value) {
            addCriterion("date_to <=", value, "dateTo");
            return (Criteria) this;
        }

        public Criteria andDateToIn(List<Date> values) {
            addCriterion("date_to in", values, "dateTo");
            return (Criteria) this;
        }

        public Criteria andDateToNotIn(List<Date> values) {
            addCriterion("date_to not in", values, "dateTo");
            return (Criteria) this;
        }

        public Criteria andDateToBetween(Date value1, Date value2) {
            addCriterion("date_to between", value1, value2, "dateTo");
            return (Criteria) this;
        }

        public Criteria andDateToNotBetween(Date value1, Date value2) {
            addCriterion("date_to not between", value1, value2, "dateTo");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table business_hours
     *
     * @mbg.generated do_not_delete_during_merge Wed Apr 14 15:46:13 CST 2021
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table business_hours
     *
     * @mbg.generated Wed Apr 14 15:46:13 CST 2021
     */
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