package com.example.beautysalon.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class CouponDistribution implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coupon_distribution.id
     *
     * @mbg.generated Tue May 11 23:32:11 CST 2021
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coupon_distribution.admin_id
     *
     * @mbg.generated Tue May 11 23:32:11 CST 2021
     */
    private Integer adminId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coupon_distribution.value
     *
     * @mbg.generated Tue May 11 23:32:11 CST 2021
     */
    private Integer value;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coupon_distribution.up_to
     *
     * @mbg.generated Tue May 11 23:32:11 CST 2021
     */
    private Integer upTo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coupon_distribution.valid_date_from
     *
     * @mbg.generated Tue May 11 23:32:11 CST 2021
     */
    private Date validDateFrom;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coupon_distribution.valid_date_to
     *
     * @mbg.generated Tue May 11 23:32:11 CST 2021
     */
    private Date validDateTo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coupon_distribution.type
     *
     * @mbg.generated Tue May 11 23:32:11 CST 2021
     */
    private Integer type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coupon_distribution.num
     *
     * @mbg.generated Tue May 11 23:32:11 CST 2021
     */
    private Integer num;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coupon_distribution.total_num
     *
     * @mbg.generated Tue May 11 23:32:11 CST 2021
     */
    private Integer totalNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table coupon_distribution
     *
     * @mbg.generated Tue May 11 23:32:11 CST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coupon_distribution.id
     *
     * @return the value of coupon_distribution.id
     *
     * @mbg.generated Tue May 11 23:32:11 CST 2021
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coupon_distribution.id
     *
     * @param id the value for coupon_distribution.id
     *
     * @mbg.generated Tue May 11 23:32:11 CST 2021
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coupon_distribution.admin_id
     *
     * @return the value of coupon_distribution.admin_id
     *
     * @mbg.generated Tue May 11 23:32:11 CST 2021
     */
    public Integer getAdminId() {
        return adminId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coupon_distribution.admin_id
     *
     * @param adminId the value for coupon_distribution.admin_id
     *
     * @mbg.generated Tue May 11 23:32:11 CST 2021
     */
    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coupon_distribution.value
     *
     * @return the value of coupon_distribution.value
     *
     * @mbg.generated Tue May 11 23:32:11 CST 2021
     */
    public Integer getValue() {
        return value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coupon_distribution.value
     *
     * @param value the value for coupon_distribution.value
     *
     * @mbg.generated Tue May 11 23:32:11 CST 2021
     */
    public void setValue(Integer value) {
        this.value = value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coupon_distribution.up_to
     *
     * @return the value of coupon_distribution.up_to
     *
     * @mbg.generated Tue May 11 23:32:11 CST 2021
     */
    public Integer getUpTo() {
        return upTo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coupon_distribution.up_to
     *
     * @param upTo the value for coupon_distribution.up_to
     *
     * @mbg.generated Tue May 11 23:32:11 CST 2021
     */
    public void setUpTo(Integer upTo) {
        this.upTo = upTo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coupon_distribution.valid_date_from
     *
     * @return the value of coupon_distribution.valid_date_from
     *
     * @mbg.generated Tue May 11 23:32:11 CST 2021
     */
    public Date getValidDateFrom() {
        return validDateFrom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coupon_distribution.valid_date_from
     *
     * @param validDateFrom the value for coupon_distribution.valid_date_from
     *
     * @mbg.generated Tue May 11 23:32:11 CST 2021
     */
    public void setValidDateFrom(Date validDateFrom) {
        this.validDateFrom = validDateFrom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coupon_distribution.valid_date_to
     *
     * @return the value of coupon_distribution.valid_date_to
     *
     * @mbg.generated Tue May 11 23:32:11 CST 2021
     */
    public Date getValidDateTo() {
        return validDateTo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coupon_distribution.valid_date_to
     *
     * @param validDateTo the value for coupon_distribution.valid_date_to
     *
     * @mbg.generated Tue May 11 23:32:11 CST 2021
     */
    public void setValidDateTo(Date validDateTo) {
        this.validDateTo = validDateTo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coupon_distribution.type
     *
     * @return the value of coupon_distribution.type
     *
     * @mbg.generated Tue May 11 23:32:11 CST 2021
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coupon_distribution.type
     *
     * @param type the value for coupon_distribution.type
     *
     * @mbg.generated Tue May 11 23:32:11 CST 2021
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coupon_distribution.num
     *
     * @return the value of coupon_distribution.num
     *
     * @mbg.generated Tue May 11 23:32:11 CST 2021
     */
    public Integer getNum() {
        return num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coupon_distribution.num
     *
     * @param num the value for coupon_distribution.num
     *
     * @mbg.generated Tue May 11 23:32:11 CST 2021
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coupon_distribution.total_num
     *
     * @return the value of coupon_distribution.total_num
     *
     * @mbg.generated Tue May 11 23:32:11 CST 2021
     */
    public Integer getTotalNum() {
        return totalNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coupon_distribution.total_num
     *
     * @param totalNum the value for coupon_distribution.total_num
     *
     * @mbg.generated Tue May 11 23:32:11 CST 2021
     */
    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon_distribution
     *
     * @mbg.generated Tue May 11 23:32:11 CST 2021
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", adminId=").append(adminId);
        sb.append(", value=").append(value);
        sb.append(", upTo=").append(upTo);
        sb.append(", validDateFrom=").append(validDateFrom);
        sb.append(", validDateTo=").append(validDateTo);
        sb.append(", type=").append(type);
        sb.append(", num=").append(num);
        sb.append(", totalNum=").append(totalNum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}