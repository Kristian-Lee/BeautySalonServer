package com.example.beautysalon.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CouponDistributionExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table coupon_distribution
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table coupon_distribution
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table coupon_distribution
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_distribution
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    public CouponDistributionExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_distribution
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_distribution
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_distribution
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_distribution
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_distribution
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_distribution
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_distribution
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_distribution
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
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
     * This method corresponds to the database table coupon_distribution
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_distribution
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table coupon_distribution
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
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

        public Criteria andAdminIdIsNull() {
            addCriterion("admin_id is null");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNotNull() {
            addCriterion("admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdminIdEqualTo(Integer value) {
            addCriterion("admin_id =", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotEqualTo(Integer value) {
            addCriterion("admin_id <>", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThan(Integer value) {
            addCriterion("admin_id >", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_id >=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThan(Integer value) {
            addCriterion("admin_id <", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThanOrEqualTo(Integer value) {
            addCriterion("admin_id <=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdIn(List<Integer> values) {
            addCriterion("admin_id in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotIn(List<Integer> values) {
            addCriterion("admin_id not in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdBetween(Integer value1, Integer value2) {
            addCriterion("admin_id between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_id not between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andValueIsNull() {
            addCriterion("value is null");
            return (Criteria) this;
        }

        public Criteria andValueIsNotNull() {
            addCriterion("value is not null");
            return (Criteria) this;
        }

        public Criteria andValueEqualTo(Integer value) {
            addCriterion("value =", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotEqualTo(Integer value) {
            addCriterion("value <>", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThan(Integer value) {
            addCriterion("value >", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThanOrEqualTo(Integer value) {
            addCriterion("value >=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThan(Integer value) {
            addCriterion("value <", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThanOrEqualTo(Integer value) {
            addCriterion("value <=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueIn(List<Integer> values) {
            addCriterion("value in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotIn(List<Integer> values) {
            addCriterion("value not in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueBetween(Integer value1, Integer value2) {
            addCriterion("value between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotBetween(Integer value1, Integer value2) {
            addCriterion("value not between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andUpToIsNull() {
            addCriterion("up_to is null");
            return (Criteria) this;
        }

        public Criteria andUpToIsNotNull() {
            addCriterion("up_to is not null");
            return (Criteria) this;
        }

        public Criteria andUpToEqualTo(Integer value) {
            addCriterion("up_to =", value, "upTo");
            return (Criteria) this;
        }

        public Criteria andUpToNotEqualTo(Integer value) {
            addCriterion("up_to <>", value, "upTo");
            return (Criteria) this;
        }

        public Criteria andUpToGreaterThan(Integer value) {
            addCriterion("up_to >", value, "upTo");
            return (Criteria) this;
        }

        public Criteria andUpToGreaterThanOrEqualTo(Integer value) {
            addCriterion("up_to >=", value, "upTo");
            return (Criteria) this;
        }

        public Criteria andUpToLessThan(Integer value) {
            addCriterion("up_to <", value, "upTo");
            return (Criteria) this;
        }

        public Criteria andUpToLessThanOrEqualTo(Integer value) {
            addCriterion("up_to <=", value, "upTo");
            return (Criteria) this;
        }

        public Criteria andUpToIn(List<Integer> values) {
            addCriterion("up_to in", values, "upTo");
            return (Criteria) this;
        }

        public Criteria andUpToNotIn(List<Integer> values) {
            addCriterion("up_to not in", values, "upTo");
            return (Criteria) this;
        }

        public Criteria andUpToBetween(Integer value1, Integer value2) {
            addCriterion("up_to between", value1, value2, "upTo");
            return (Criteria) this;
        }

        public Criteria andUpToNotBetween(Integer value1, Integer value2) {
            addCriterion("up_to not between", value1, value2, "upTo");
            return (Criteria) this;
        }

        public Criteria andValidDateFromIsNull() {
            addCriterion("valid_date_from is null");
            return (Criteria) this;
        }

        public Criteria andValidDateFromIsNotNull() {
            addCriterion("valid_date_from is not null");
            return (Criteria) this;
        }

        public Criteria andValidDateFromEqualTo(Date value) {
            addCriterion("valid_date_from =", value, "validDateFrom");
            return (Criteria) this;
        }

        public Criteria andValidDateFromNotEqualTo(Date value) {
            addCriterion("valid_date_from <>", value, "validDateFrom");
            return (Criteria) this;
        }

        public Criteria andValidDateFromGreaterThan(Date value) {
            addCriterion("valid_date_from >", value, "validDateFrom");
            return (Criteria) this;
        }

        public Criteria andValidDateFromGreaterThanOrEqualTo(Date value) {
            addCriterion("valid_date_from >=", value, "validDateFrom");
            return (Criteria) this;
        }

        public Criteria andValidDateFromLessThan(Date value) {
            addCriterion("valid_date_from <", value, "validDateFrom");
            return (Criteria) this;
        }

        public Criteria andValidDateFromLessThanOrEqualTo(Date value) {
            addCriterion("valid_date_from <=", value, "validDateFrom");
            return (Criteria) this;
        }

        public Criteria andValidDateFromIn(List<Date> values) {
            addCriterion("valid_date_from in", values, "validDateFrom");
            return (Criteria) this;
        }

        public Criteria andValidDateFromNotIn(List<Date> values) {
            addCriterion("valid_date_from not in", values, "validDateFrom");
            return (Criteria) this;
        }

        public Criteria andValidDateFromBetween(Date value1, Date value2) {
            addCriterion("valid_date_from between", value1, value2, "validDateFrom");
            return (Criteria) this;
        }

        public Criteria andValidDateFromNotBetween(Date value1, Date value2) {
            addCriterion("valid_date_from not between", value1, value2, "validDateFrom");
            return (Criteria) this;
        }

        public Criteria andValidDateToIsNull() {
            addCriterion("valid_date_to is null");
            return (Criteria) this;
        }

        public Criteria andValidDateToIsNotNull() {
            addCriterion("valid_date_to is not null");
            return (Criteria) this;
        }

        public Criteria andValidDateToEqualTo(Date value) {
            addCriterion("valid_date_to =", value, "validDateTo");
            return (Criteria) this;
        }

        public Criteria andValidDateToNotEqualTo(Date value) {
            addCriterion("valid_date_to <>", value, "validDateTo");
            return (Criteria) this;
        }

        public Criteria andValidDateToGreaterThan(Date value) {
            addCriterion("valid_date_to >", value, "validDateTo");
            return (Criteria) this;
        }

        public Criteria andValidDateToGreaterThanOrEqualTo(Date value) {
            addCriterion("valid_date_to >=", value, "validDateTo");
            return (Criteria) this;
        }

        public Criteria andValidDateToLessThan(Date value) {
            addCriterion("valid_date_to <", value, "validDateTo");
            return (Criteria) this;
        }

        public Criteria andValidDateToLessThanOrEqualTo(Date value) {
            addCriterion("valid_date_to <=", value, "validDateTo");
            return (Criteria) this;
        }

        public Criteria andValidDateToIn(List<Date> values) {
            addCriterion("valid_date_to in", values, "validDateTo");
            return (Criteria) this;
        }

        public Criteria andValidDateToNotIn(List<Date> values) {
            addCriterion("valid_date_to not in", values, "validDateTo");
            return (Criteria) this;
        }

        public Criteria andValidDateToBetween(Date value1, Date value2) {
            addCriterion("valid_date_to between", value1, value2, "validDateTo");
            return (Criteria) this;
        }

        public Criteria andValidDateToNotBetween(Date value1, Date value2) {
            addCriterion("valid_date_to not between", value1, value2, "validDateTo");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(Integer value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Integer value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Integer value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Integer value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Integer value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Integer> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Integer> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Integer value1, Integer value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Integer value1, Integer value2) {
            addCriterion("num not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andTotalNumIsNull() {
            addCriterion("total_num is null");
            return (Criteria) this;
        }

        public Criteria andTotalNumIsNotNull() {
            addCriterion("total_num is not null");
            return (Criteria) this;
        }

        public Criteria andTotalNumEqualTo(Integer value) {
            addCriterion("total_num =", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumNotEqualTo(Integer value) {
            addCriterion("total_num <>", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumGreaterThan(Integer value) {
            addCriterion("total_num >", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_num >=", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumLessThan(Integer value) {
            addCriterion("total_num <", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumLessThanOrEqualTo(Integer value) {
            addCriterion("total_num <=", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumIn(List<Integer> values) {
            addCriterion("total_num in", values, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumNotIn(List<Integer> values) {
            addCriterion("total_num not in", values, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumBetween(Integer value1, Integer value2) {
            addCriterion("total_num between", value1, value2, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumNotBetween(Integer value1, Integer value2) {
            addCriterion("total_num not between", value1, value2, "totalNum");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table coupon_distribution
     *
     * @mbg.generated do_not_delete_during_merge Wed May 12 15:43:13 CST 2021
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table coupon_distribution
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
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