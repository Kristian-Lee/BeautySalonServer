package com.example.beautysalon.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class Information implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column information.id
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column information.title
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column information.admin_id
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    private Integer adminId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column information.create_date
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column information.content
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column information.web_view
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    private String webView;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table information
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column information.id
     *
     * @return the value of information.id
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column information.id
     *
     * @param id the value for information.id
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column information.title
     *
     * @return the value of information.title
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column information.title
     *
     * @param title the value for information.title
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column information.admin_id
     *
     * @return the value of information.admin_id
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    public Integer getAdminId() {
        return adminId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column information.admin_id
     *
     * @param adminId the value for information.admin_id
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column information.create_date
     *
     * @return the value of information.create_date
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column information.create_date
     *
     * @param createDate the value for information.create_date
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column information.content
     *
     * @return the value of information.content
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column information.content
     *
     * @param content the value for information.content
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column information.web_view
     *
     * @return the value of information.web_view
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    public String getWebView() {
        return webView;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column information.web_view
     *
     * @param webView the value for information.web_view
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    public void setWebView(String webView) {
        this.webView = webView;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table information
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
        sb.append(", title=").append(title);
        sb.append(", adminId=").append(adminId);
        sb.append(", createDate=").append(createDate);
        sb.append(", content=").append(content);
        sb.append(", webView=").append(webView);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}