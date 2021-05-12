package com.example.beautysalon.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class Points implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column points.id
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column points.user_id
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column points.value
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    private Integer value;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column points.create_date
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column points.type
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    private Integer type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table points
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column points.id
     *
     * @return the value of points.id
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column points.id
     *
     * @param id the value for points.id
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column points.user_id
     *
     * @return the value of points.user_id
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column points.user_id
     *
     * @param userId the value for points.user_id
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column points.value
     *
     * @return the value of points.value
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    public Integer getValue() {
        return value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column points.value
     *
     * @param value the value for points.value
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    public void setValue(Integer value) {
        this.value = value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column points.create_date
     *
     * @return the value of points.create_date
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column points.create_date
     *
     * @param createDate the value for points.create_date
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column points.type
     *
     * @return the value of points.type
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column points.type
     *
     * @param type the value for points.type
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table points
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", value=").append(value);
        sb.append(", createDate=").append(createDate);
        sb.append(", type=").append(type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}