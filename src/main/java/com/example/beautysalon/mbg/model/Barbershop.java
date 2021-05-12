package com.example.beautysalon.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class Barbershop implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column barbershop.barbershop_id
     *
     * @mbg.generated Wed May 12 19:03:49 CST 2021
     */
    private Integer barbershopId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column barbershop.barbershop_name
     *
     * @mbg.generated Wed May 12 19:03:49 CST 2021
     */
    private String barbershopName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column barbershop.address
     *
     * @mbg.generated Wed May 12 19:03:49 CST 2021
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column barbershop.owner_id
     *
     * @mbg.generated Wed May 12 19:03:49 CST 2021
     */
    private Integer ownerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column barbershop.picture
     *
     * @mbg.generated Wed May 12 19:03:49 CST 2021
     */
    private String picture;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column barbershop.open
     *
     * @mbg.generated Wed May 12 19:03:49 CST 2021
     */
    private Date open;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column barbershop.close
     *
     * @mbg.generated Wed May 12 19:03:49 CST 2021
     */
    private Date close;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table barbershop
     *
     * @mbg.generated Wed May 12 19:03:49 CST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column barbershop.barbershop_id
     *
     * @return the value of barbershop.barbershop_id
     *
     * @mbg.generated Wed May 12 19:03:49 CST 2021
     */
    public Integer getBarbershopId() {
        return barbershopId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column barbershop.barbershop_id
     *
     * @param barbershopId the value for barbershop.barbershop_id
     *
     * @mbg.generated Wed May 12 19:03:49 CST 2021
     */
    public void setBarbershopId(Integer barbershopId) {
        this.barbershopId = barbershopId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column barbershop.barbershop_name
     *
     * @return the value of barbershop.barbershop_name
     *
     * @mbg.generated Wed May 12 19:03:49 CST 2021
     */
    public String getBarbershopName() {
        return barbershopName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column barbershop.barbershop_name
     *
     * @param barbershopName the value for barbershop.barbershop_name
     *
     * @mbg.generated Wed May 12 19:03:49 CST 2021
     */
    public void setBarbershopName(String barbershopName) {
        this.barbershopName = barbershopName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column barbershop.address
     *
     * @return the value of barbershop.address
     *
     * @mbg.generated Wed May 12 19:03:49 CST 2021
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column barbershop.address
     *
     * @param address the value for barbershop.address
     *
     * @mbg.generated Wed May 12 19:03:49 CST 2021
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column barbershop.owner_id
     *
     * @return the value of barbershop.owner_id
     *
     * @mbg.generated Wed May 12 19:03:49 CST 2021
     */
    public Integer getOwnerId() {
        return ownerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column barbershop.owner_id
     *
     * @param ownerId the value for barbershop.owner_id
     *
     * @mbg.generated Wed May 12 19:03:49 CST 2021
     */
    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column barbershop.picture
     *
     * @return the value of barbershop.picture
     *
     * @mbg.generated Wed May 12 19:03:49 CST 2021
     */
    public String getPicture() {
        return picture;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column barbershop.picture
     *
     * @param picture the value for barbershop.picture
     *
     * @mbg.generated Wed May 12 19:03:49 CST 2021
     */
    public void setPicture(String picture) {
        this.picture = picture;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column barbershop.open
     *
     * @return the value of barbershop.open
     *
     * @mbg.generated Wed May 12 19:03:49 CST 2021
     */
    public Date getOpen() {
        return open;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column barbershop.open
     *
     * @param open the value for barbershop.open
     *
     * @mbg.generated Wed May 12 19:03:49 CST 2021
     */
    public void setOpen(Date open) {
        this.open = open;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column barbershop.close
     *
     * @return the value of barbershop.close
     *
     * @mbg.generated Wed May 12 19:03:49 CST 2021
     */
    public Date getClose() {
        return close;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column barbershop.close
     *
     * @param close the value for barbershop.close
     *
     * @mbg.generated Wed May 12 19:03:49 CST 2021
     */
    public void setClose(Date close) {
        this.close = close;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table barbershop
     *
     * @mbg.generated Wed May 12 19:03:49 CST 2021
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", barbershopId=").append(barbershopId);
        sb.append(", barbershopName=").append(barbershopName);
        sb.append(", address=").append(address);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", picture=").append(picture);
        sb.append(", open=").append(open);
        sb.append(", close=").append(close);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}