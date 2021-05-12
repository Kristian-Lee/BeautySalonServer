package com.example.beautysalon.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class BusinessHours implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column business_hours.id
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column business_hours.stylist_id
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    private Integer stylistId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column business_hours.date_from
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    private Date dateFrom;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column business_hours.date_to
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    private Date dateTo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table business_hours
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column business_hours.id
     *
     * @return the value of business_hours.id
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column business_hours.id
     *
     * @param id the value for business_hours.id
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column business_hours.stylist_id
     *
     * @return the value of business_hours.stylist_id
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    public Integer getStylistId() {
        return stylistId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column business_hours.stylist_id
     *
     * @param stylistId the value for business_hours.stylist_id
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    public void setStylistId(Integer stylistId) {
        this.stylistId = stylistId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column business_hours.date_from
     *
     * @return the value of business_hours.date_from
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    public Date getDateFrom() {
        return dateFrom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column business_hours.date_from
     *
     * @param dateFrom the value for business_hours.date_from
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column business_hours.date_to
     *
     * @return the value of business_hours.date_to
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    public Date getDateTo() {
        return dateTo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column business_hours.date_to
     *
     * @param dateTo the value for business_hours.date_to
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business_hours
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
        sb.append(", stylistId=").append(stylistId);
        sb.append(", dateFrom=").append(dateFrom);
        sb.append(", dateTo=").append(dateTo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}