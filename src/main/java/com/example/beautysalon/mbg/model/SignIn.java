package com.example.beautysalon.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class SignIn implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sign_in.id
     *
     * @mbg.generated Thu May 13 00:55:17 CST 2021
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sign_in.user_id
     *
     * @mbg.generated Thu May 13 00:55:17 CST 2021
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sign_in.last_date
     *
     * @mbg.generated Thu May 13 00:55:17 CST 2021
     */
    private Date lastDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sign_in.consecutive_day
     *
     * @mbg.generated Thu May 13 00:55:17 CST 2021
     */
    private Integer consecutiveDay;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sign_in
     *
     * @mbg.generated Thu May 13 00:55:17 CST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sign_in.id
     *
     * @return the value of sign_in.id
     *
     * @mbg.generated Thu May 13 00:55:17 CST 2021
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sign_in.id
     *
     * @param id the value for sign_in.id
     *
     * @mbg.generated Thu May 13 00:55:17 CST 2021
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sign_in.user_id
     *
     * @return the value of sign_in.user_id
     *
     * @mbg.generated Thu May 13 00:55:17 CST 2021
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sign_in.user_id
     *
     * @param userId the value for sign_in.user_id
     *
     * @mbg.generated Thu May 13 00:55:17 CST 2021
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sign_in.last_date
     *
     * @return the value of sign_in.last_date
     *
     * @mbg.generated Thu May 13 00:55:17 CST 2021
     */
    public Date getLastDate() {
        return lastDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sign_in.last_date
     *
     * @param lastDate the value for sign_in.last_date
     *
     * @mbg.generated Thu May 13 00:55:17 CST 2021
     */
    public void setLastDate(Date lastDate) {
        this.lastDate = lastDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sign_in.consecutive_day
     *
     * @return the value of sign_in.consecutive_day
     *
     * @mbg.generated Thu May 13 00:55:17 CST 2021
     */
    public Integer getConsecutiveDay() {
        return consecutiveDay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sign_in.consecutive_day
     *
     * @param consecutiveDay the value for sign_in.consecutive_day
     *
     * @mbg.generated Thu May 13 00:55:17 CST 2021
     */
    public void setConsecutiveDay(Integer consecutiveDay) {
        this.consecutiveDay = consecutiveDay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sign_in
     *
     * @mbg.generated Thu May 13 00:55:17 CST 2021
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", lastDate=").append(lastDate);
        sb.append(", consecutiveDay=").append(consecutiveDay);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}