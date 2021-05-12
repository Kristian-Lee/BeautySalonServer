package com.example.beautysalon.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class StylistExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table stylist
     *
     * @mbg.generated Wed May 12 19:03:49 CST 2021
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table stylist
     *
     * @mbg.generated Wed May 12 19:03:49 CST 2021
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table stylist
     *
     * @mbg.generated Wed May 12 19:03:49 CST 2021
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stylist
     *
     * @mbg.generated Wed May 12 19:03:49 CST 2021
     */
    public StylistExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stylist
     *
     * @mbg.generated Wed May 12 19:03:49 CST 2021
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stylist
     *
     * @mbg.generated Wed May 12 19:03:49 CST 2021
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stylist
     *
     * @mbg.generated Wed May 12 19:03:49 CST 2021
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stylist
     *
     * @mbg.generated Wed May 12 19:03:49 CST 2021
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stylist
     *
     * @mbg.generated Wed May 12 19:03:49 CST 2021
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stylist
     *
     * @mbg.generated Wed May 12 19:03:49 CST 2021
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stylist
     *
     * @mbg.generated Wed May 12 19:03:49 CST 2021
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stylist
     *
     * @mbg.generated Wed May 12 19:03:49 CST 2021
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
     * This method corresponds to the database table stylist
     *
     * @mbg.generated Wed May 12 19:03:49 CST 2021
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stylist
     *
     * @mbg.generated Wed May 12 19:03:49 CST 2021
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table stylist
     *
     * @mbg.generated Wed May 12 19:03:49 CST 2021
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

        public Criteria andSpecialityIsNull() {
            addCriterion("speciality is null");
            return (Criteria) this;
        }

        public Criteria andSpecialityIsNotNull() {
            addCriterion("speciality is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialityEqualTo(String value) {
            addCriterion("speciality =", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityNotEqualTo(String value) {
            addCriterion("speciality <>", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityGreaterThan(String value) {
            addCriterion("speciality >", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityGreaterThanOrEqualTo(String value) {
            addCriterion("speciality >=", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityLessThan(String value) {
            addCriterion("speciality <", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityLessThanOrEqualTo(String value) {
            addCriterion("speciality <=", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityLike(String value) {
            addCriterion("speciality like", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityNotLike(String value) {
            addCriterion("speciality not like", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityIn(List<String> values) {
            addCriterion("speciality in", values, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityNotIn(List<String> values) {
            addCriterion("speciality not in", values, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityBetween(String value1, String value2) {
            addCriterion("speciality between", value1, value2, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityNotBetween(String value1, String value2) {
            addCriterion("speciality not between", value1, value2, "speciality");
            return (Criteria) this;
        }

        public Criteria andIsPassedIsNull() {
            addCriterion("is_passed is null");
            return (Criteria) this;
        }

        public Criteria andIsPassedIsNotNull() {
            addCriterion("is_passed is not null");
            return (Criteria) this;
        }

        public Criteria andIsPassedEqualTo(Integer value) {
            addCriterion("is_passed =", value, "isPassed");
            return (Criteria) this;
        }

        public Criteria andIsPassedNotEqualTo(Integer value) {
            addCriterion("is_passed <>", value, "isPassed");
            return (Criteria) this;
        }

        public Criteria andIsPassedGreaterThan(Integer value) {
            addCriterion("is_passed >", value, "isPassed");
            return (Criteria) this;
        }

        public Criteria andIsPassedGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_passed >=", value, "isPassed");
            return (Criteria) this;
        }

        public Criteria andIsPassedLessThan(Integer value) {
            addCriterion("is_passed <", value, "isPassed");
            return (Criteria) this;
        }

        public Criteria andIsPassedLessThanOrEqualTo(Integer value) {
            addCriterion("is_passed <=", value, "isPassed");
            return (Criteria) this;
        }

        public Criteria andIsPassedIn(List<Integer> values) {
            addCriterion("is_passed in", values, "isPassed");
            return (Criteria) this;
        }

        public Criteria andIsPassedNotIn(List<Integer> values) {
            addCriterion("is_passed not in", values, "isPassed");
            return (Criteria) this;
        }

        public Criteria andIsPassedBetween(Integer value1, Integer value2) {
            addCriterion("is_passed between", value1, value2, "isPassed");
            return (Criteria) this;
        }

        public Criteria andIsPassedNotBetween(Integer value1, Integer value2) {
            addCriterion("is_passed not between", value1, value2, "isPassed");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNull() {
            addCriterion("real_name is null");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNotNull() {
            addCriterion("real_name is not null");
            return (Criteria) this;
        }

        public Criteria andRealNameEqualTo(String value) {
            addCriterion("real_name =", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotEqualTo(String value) {
            addCriterion("real_name <>", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThan(String value) {
            addCriterion("real_name >", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("real_name >=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThan(String value) {
            addCriterion("real_name <", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThanOrEqualTo(String value) {
            addCriterion("real_name <=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLike(String value) {
            addCriterion("real_name like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotLike(String value) {
            addCriterion("real_name not like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameIn(List<String> values) {
            addCriterion("real_name in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotIn(List<String> values) {
            addCriterion("real_name not in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameBetween(String value1, String value2) {
            addCriterion("real_name between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotBetween(String value1, String value2) {
            addCriterion("real_name not between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsIsNull() {
            addCriterion("working_years is null");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsIsNotNull() {
            addCriterion("working_years is not null");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsEqualTo(Integer value) {
            addCriterion("working_years =", value, "workingYears");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsNotEqualTo(Integer value) {
            addCriterion("working_years <>", value, "workingYears");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsGreaterThan(Integer value) {
            addCriterion("working_years >", value, "workingYears");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsGreaterThanOrEqualTo(Integer value) {
            addCriterion("working_years >=", value, "workingYears");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsLessThan(Integer value) {
            addCriterion("working_years <", value, "workingYears");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsLessThanOrEqualTo(Integer value) {
            addCriterion("working_years <=", value, "workingYears");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsIn(List<Integer> values) {
            addCriterion("working_years in", values, "workingYears");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsNotIn(List<Integer> values) {
            addCriterion("working_years not in", values, "workingYears");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsBetween(Integer value1, Integer value2) {
            addCriterion("working_years between", value1, value2, "workingYears");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsNotBetween(Integer value1, Integer value2) {
            addCriterion("working_years not between", value1, value2, "workingYears");
            return (Criteria) this;
        }

        public Criteria andStylistNameIsNull() {
            addCriterion("stylist_name is null");
            return (Criteria) this;
        }

        public Criteria andStylistNameIsNotNull() {
            addCriterion("stylist_name is not null");
            return (Criteria) this;
        }

        public Criteria andStylistNameEqualTo(String value) {
            addCriterion("stylist_name =", value, "stylistName");
            return (Criteria) this;
        }

        public Criteria andStylistNameNotEqualTo(String value) {
            addCriterion("stylist_name <>", value, "stylistName");
            return (Criteria) this;
        }

        public Criteria andStylistNameGreaterThan(String value) {
            addCriterion("stylist_name >", value, "stylistName");
            return (Criteria) this;
        }

        public Criteria andStylistNameGreaterThanOrEqualTo(String value) {
            addCriterion("stylist_name >=", value, "stylistName");
            return (Criteria) this;
        }

        public Criteria andStylistNameLessThan(String value) {
            addCriterion("stylist_name <", value, "stylistName");
            return (Criteria) this;
        }

        public Criteria andStylistNameLessThanOrEqualTo(String value) {
            addCriterion("stylist_name <=", value, "stylistName");
            return (Criteria) this;
        }

        public Criteria andStylistNameLike(String value) {
            addCriterion("stylist_name like", value, "stylistName");
            return (Criteria) this;
        }

        public Criteria andStylistNameNotLike(String value) {
            addCriterion("stylist_name not like", value, "stylistName");
            return (Criteria) this;
        }

        public Criteria andStylistNameIn(List<String> values) {
            addCriterion("stylist_name in", values, "stylistName");
            return (Criteria) this;
        }

        public Criteria andStylistNameNotIn(List<String> values) {
            addCriterion("stylist_name not in", values, "stylistName");
            return (Criteria) this;
        }

        public Criteria andStylistNameBetween(String value1, String value2) {
            addCriterion("stylist_name between", value1, value2, "stylistName");
            return (Criteria) this;
        }

        public Criteria andStylistNameNotBetween(String value1, String value2) {
            addCriterion("stylist_name not between", value1, value2, "stylistName");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNull() {
            addCriterion("avatar is null");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNotNull() {
            addCriterion("avatar is not null");
            return (Criteria) this;
        }

        public Criteria andAvatarEqualTo(String value) {
            addCriterion("avatar =", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotEqualTo(String value) {
            addCriterion("avatar <>", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThan(String value) {
            addCriterion("avatar >", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThanOrEqualTo(String value) {
            addCriterion("avatar >=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThan(String value) {
            addCriterion("avatar <", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThanOrEqualTo(String value) {
            addCriterion("avatar <=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLike(String value) {
            addCriterion("avatar like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotLike(String value) {
            addCriterion("avatar not like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarIn(List<String> values) {
            addCriterion("avatar in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotIn(List<String> values) {
            addCriterion("avatar not in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarBetween(String value1, String value2) {
            addCriterion("avatar between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotBetween(String value1, String value2) {
            addCriterion("avatar not between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andRoleIsNull() {
            addCriterion("role is null");
            return (Criteria) this;
        }

        public Criteria andRoleIsNotNull() {
            addCriterion("role is not null");
            return (Criteria) this;
        }

        public Criteria andRoleEqualTo(Integer value) {
            addCriterion("role =", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotEqualTo(Integer value) {
            addCriterion("role <>", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThan(Integer value) {
            addCriterion("role >", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThanOrEqualTo(Integer value) {
            addCriterion("role >=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThan(Integer value) {
            addCriterion("role <", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThanOrEqualTo(Integer value) {
            addCriterion("role <=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleIn(List<Integer> values) {
            addCriterion("role in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotIn(List<Integer> values) {
            addCriterion("role not in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleBetween(Integer value1, Integer value2) {
            addCriterion("role between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotBetween(Integer value1, Integer value2) {
            addCriterion("role not between", value1, value2, "role");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table stylist
     *
     * @mbg.generated do_not_delete_during_merge Wed May 12 19:03:49 CST 2021
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table stylist
     *
     * @mbg.generated Wed May 12 19:03:49 CST 2021
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