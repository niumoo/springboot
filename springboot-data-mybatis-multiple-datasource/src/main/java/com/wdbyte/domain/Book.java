package com.wdbyte.domain;

import java.util.Date;

public class Book {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Book.id
     *
     * @mbg.generated Sat Dec 19 16:22:25 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Book.author
     *
     * @mbg.generated Sat Dec 19 16:22:25 CST 2020
     */
    private String author;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Book.name
     *
     * @mbg.generated Sat Dec 19 16:22:25 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Book.price
     *
     * @mbg.generated Sat Dec 19 16:22:25 CST 2020
     */
    private Long price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Book.createTime
     *
     * @mbg.generated Sat Dec 19 16:22:25 CST 2020
     */
    private Date createtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Book.description
     *
     * @mbg.generated Sat Dec 19 16:22:25 CST 2020
     */
    private String description;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Book.id
     *
     * @return the value of Book.id
     *
     * @mbg.generated Sat Dec 19 16:22:25 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Book.id
     *
     * @param id the value for Book.id
     *
     * @mbg.generated Sat Dec 19 16:22:25 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Book.author
     *
     * @return the value of Book.author
     *
     * @mbg.generated Sat Dec 19 16:22:25 CST 2020
     */
    public String getAuthor() {
        return author;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Book.author
     *
     * @param author the value for Book.author
     *
     * @mbg.generated Sat Dec 19 16:22:25 CST 2020
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Book.name
     *
     * @return the value of Book.name
     *
     * @mbg.generated Sat Dec 19 16:22:25 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Book.name
     *
     * @param name the value for Book.name
     *
     * @mbg.generated Sat Dec 19 16:22:25 CST 2020
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Book.price
     *
     * @return the value of Book.price
     *
     * @mbg.generated Sat Dec 19 16:22:25 CST 2020
     */
    public Long getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Book.price
     *
     * @param price the value for Book.price
     *
     * @mbg.generated Sat Dec 19 16:22:25 CST 2020
     */
    public void setPrice(Long price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Book.createTime
     *
     * @return the value of Book.createTime
     *
     * @mbg.generated Sat Dec 19 16:22:25 CST 2020
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Book.createTime
     *
     * @param createtime the value for Book.createTime
     *
     * @mbg.generated Sat Dec 19 16:22:25 CST 2020
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Book.description
     *
     * @return the value of Book.description
     *
     * @mbg.generated Sat Dec 19 16:22:25 CST 2020
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Book.description
     *
     * @param description the value for Book.description
     *
     * @mbg.generated Sat Dec 19 16:22:25 CST 2020
     */
    public void setDescription(String description) {
        this.description = description;
    }
}