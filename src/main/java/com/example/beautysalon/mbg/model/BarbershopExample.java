package com.example.beautysalon.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BarbershopExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table barbershop
     *
     * @mbg.generated Thu May 13 00:55:17 CST 2021
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table barbershop
     *
     * @mbg.generated Thu May 13 00:55:17 CST 2021
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table barbershop
     *
     * @mbg.generated Thu May 13 00:55:17 CST 2021
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table barbershop
     *
     * @mbg.generated Thu May 13 00:55:17 CST 2021
     */
    public BarbershopExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table barbershop
     *
     * @mbg.generated Thu May 13 00:55:17 CST 2021
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table barbershop
     *
     * @mbg.generated Thu May 13 00:55:17 CST 2021
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table barbershop
     *
     * @mbg.generated Thu May 13 00:55:17 CST 2021
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table barbershop
     *
     * @mbg.generated Thu May 13 00:55:17 CST 2021
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table barbershop
     *
     * @mbg.generated Thu May 13 00:55:17 CST 2021
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table barbershop
     *
     * @mbg.generated Thu May 13 00:55:17 CST 2021
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table barbershop
     *
     * @mbg.generated Thu May 13 00:55:17 CST 2021
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table barbershop
     *
     * @mbg.generated Thu May 13 00:55:17 CST 2021
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
     * This method corresponds to the database table barbershop
     *
     * @mbg.generated Thu May 13 00:55:17 CST 2021
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table barbershop
     *
     * @mbg.generated Thu May 13 00:55:17 CST 2021
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table barbershop
     *
     * @mbg.generated Thu May 13 00:55:17 CST 2021
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

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
        }

        public Criteria andBarbershopIdIsNull() {
            addCriterion("barbershop_id is null");
            return (Criteria) this;
        }

        public Criteria andBarbershopIdIsNotNull() {
            addCriterion("barbershop_id is not null");
            return (Criteria) this;
        }

        public Criteria andBarbershopIdEqualTo(Integer value) {
            addCriterion("barbershop_id =", value, "barbershopId");
            return (Criteria) this;
        }

        public Criteria andBarbershopIdNotEqualTo(Integer value) {
            addCriterion("barbershop_id <>", value, "barbershopId");
            return (Criteria) this;
        }

        public Criteria andBarbershopIdGreaterThan(Integer value) {
            addCriterion("barbershop_id >", value, "barbershopId");
            return (Criteria) this;
        }

        public Criteria andBarbershopIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("barbershop_id >=", value, "barbershopId");
            return (Criteria) this;
        }

        public Criteria andBarbershopIdLessThan(Integer value) {
            addCriterion("barbershop_id <", value, "barbershopId");
            return (Criteria) this;
        }

        public Criteria andBarbershopIdLessThanOrEqualTo(Integer value) {
            addCriterion("barbershop_id <=", value, "barbershopId");
            return (Criteria) this;
        }

        public Criteria andBarbershopIdIn(List<Integer> values) {
            addCriterion("barbershop_id in", values, "barbershopId");
            return (Criteria) this;
        }

        public Criteria andBarbershopIdNotIn(List<Integer> values) {
            addCriterion("barbershop_id not in", values, "barbershopId");
            return (Criteria) this;
        }

        public Criteria andBarbershopIdBetween(Integer value1, Integer value2) {
            addCriterion("barbershop_id between", value1, value2, "barbershopId");
            return (Criteria) this;
        }

        public Criteria andBarbershopIdNotBetween(Integer value1, Integer value2) {
            addCriterion("barbershop_id not between", value1, value2, "barbershopId");
            return (Criteria) this;
        }

        public Criteria andBarbershopNameIsNull() {
            addCriterion("barbershop_name is null");
            return (Criteria) this;
        }

        public Criteria andBarbershopNameIsNotNull() {
            addCriterion("barbershop_name is not null");
            return (Criteria) this;
        }

        public Criteria andBarbershopNameEqualTo(String value) {
            addCriterion("barbershop_name =", value, "barbershopName");
            return (Criteria) this;
        }

        public Criteria andBarbershopNameNotEqualTo(String value) {
            addCriterion("barbershop_name <>", value, "barbershopName");
            return (Criteria) this;
        }

        public Criteria andBarbershopNameGreaterThan(String value) {
            addCriterion("barbershop_name >", value, "barbershopName");
            return (Criteria) this;
        }

        public Criteria andBarbershopNameGreaterThanOrEqualTo(String value) {
            addCriterion("barbershop_name >=", value, "barbershopName");
            return (Criteria) this;
        }

        public Criteria andBarbershopNameLessThan(String value) {
            addCriterion("barbershop_name <", value, "barbershopName");
            return (Criteria) this;
        }

        public Criteria andBarbershopNameLessThanOrEqualTo(String value) {
            addCriterion("barbershop_name <=", value, "barbershopName");
            return (Criteria) this;
        }

        public Criteria andBarbershopNameLike(String value) {
            addCriterion("barbershop_name like", value, "barbershopName");
            return (Criteria) this;
        }

        public Criteria andBarbershopNameNotLike(String value) {
            addCriterion("barbershop_name not like", value, "barbershopName");
            return (Criteria) this;
        }

        public Criteria andBarbershopNameIn(List<String> values) {
            addCriterion("barbershop_name in", values, "barbershopName");
            return (Criteria) this;
        }

        public Criteria andBarbershopNameNotIn(List<String> values) {
            addCriterion("barbershop_name not in", values, "barbershopName");
            return (Criteria) this;
        }

        public Criteria andBarbershopNameBetween(String value1, String value2) {
            addCriterion("barbershop_name between", value1, value2, "barbershopName");
            return (Criteria) this;
        }

        public Criteria andBarbershopNameNotBetween(String value1, String value2) {
            addCriterion("barbershop_name not between", value1, value2, "barbershopName");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andOwnerIdIsNull() {
            addCriterion("owner_id is null");
            return (Criteria) this;
        }

        public Criteria andOwnerIdIsNotNull() {
            addCriterion("owner_id is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerIdEqualTo(Integer value) {
            addCriterion("owner_id =", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdNotEqualTo(Integer value) {
            addCriterion("owner_id <>", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdGreaterThan(Integer value) {
            addCriterion("owner_id >", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("owner_id >=", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdLessThan(Integer value) {
            addCriterion("owner_id <", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdLessThanOrEqualTo(Integer value) {
            addCriterion("owner_id <=", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdIn(List<Integer> values) {
            addCriterion("owner_id in", values, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdNotIn(List<Integer> values) {
            addCriterion("owner_id not in", values, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdBetween(Integer value1, Integer value2) {
            addCriterion("owner_id between", value1, value2, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("owner_id not between", value1, value2, "ownerId");
            return (Criteria) this;
        }

        public Criteria andPictureIsNull() {
            addCriterion("picture is null");
            return (Criteria) this;
        }

        public Criteria andPictureIsNotNull() {
            addCriterion("picture is not null");
            return (Criteria) this;
        }

        public Criteria andPictureEqualTo(String value) {
            addCriterion("picture =", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotEqualTo(String value) {
            addCriterion("picture <>", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThan(String value) {
            addCriterion("picture >", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThanOrEqualTo(String value) {
            addCriterion("picture >=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThan(String value) {
            addCriterion("picture <", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThanOrEqualTo(String value) {
            addCriterion("picture <=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLike(String value) {
            addCriterion("picture like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotLike(String value) {
            addCriterion("picture not like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureIn(List<String> values) {
            addCriterion("picture in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotIn(List<String> values) {
            addCriterion("picture not in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureBetween(String value1, String value2) {
            addCriterion("picture between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotBetween(String value1, String value2) {
            addCriterion("picture not between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andOpenIsNull() {
            addCriterion("open is null");
            return (Criteria) this;
        }

        public Criteria andOpenIsNotNull() {
            addCriterion("open is not null");
            return (Criteria) this;
        }

        public Criteria andOpenEqualTo(Date value) {
            addCriterionForJDBCTime("open =", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenNotEqualTo(Date value) {
            addCriterionForJDBCTime("open <>", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenGreaterThan(Date value) {
            addCriterionForJDBCTime("open >", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("open >=", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenLessThan(Date value) {
            addCriterionForJDBCTime("open <", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("open <=", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenIn(List<Date> values) {
            addCriterionForJDBCTime("open in", values, "open");
            return (Criteria) this;
        }

        public Criteria andOpenNotIn(List<Date> values) {
            addCriterionForJDBCTime("open not in", values, "open");
            return (Criteria) this;
        }

        public Criteria andOpenBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("open between", value1, value2, "open");
            return (Criteria) this;
        }

        public Criteria andOpenNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("open not between", value1, value2, "open");
            return (Criteria) this;
        }

        public Criteria andCloseIsNull() {
            addCriterion("close is null");
            return (Criteria) this;
        }

        public Criteria andCloseIsNotNull() {
            addCriterion("close is not null");
            return (Criteria) this;
        }

        public Criteria andCloseEqualTo(Date value) {
            addCriterionForJDBCTime("close =", value, "close");
            return (Criteria) this;
        }

        public Criteria andCloseNotEqualTo(Date value) {
            addCriterionForJDBCTime("close <>", value, "close");
            return (Criteria) this;
        }

        public Criteria andCloseGreaterThan(Date value) {
            addCriterionForJDBCTime("close >", value, "close");
            return (Criteria) this;
        }

        public Criteria andCloseGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("close >=", value, "close");
            return (Criteria) this;
        }

        public Criteria andCloseLessThan(Date value) {
            addCriterionForJDBCTime("close <", value, "close");
            return (Criteria) this;
        }

        public Criteria andCloseLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("close <=", value, "close");
            return (Criteria) this;
        }

        public Criteria andCloseIn(List<Date> values) {
            addCriterionForJDBCTime("close in", values, "close");
            return (Criteria) this;
        }

        public Criteria andCloseNotIn(List<Date> values) {
            addCriterionForJDBCTime("close not in", values, "close");
            return (Criteria) this;
        }

        public Criteria andCloseBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("close between", value1, value2, "close");
            return (Criteria) this;
        }

        public Criteria andCloseNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("close not between", value1, value2, "close");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table barbershop
     *
     * @mbg.generated do_not_delete_during_merge Thu May 13 00:55:17 CST 2021
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table barbershop
     *
     * @mbg.generated Thu May 13 00:55:17 CST 2021
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