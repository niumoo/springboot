package net.codingme.boot.domain;

import lombok.Data;
import lombok.ToString;

import java.util.Date;
import javax.persistence.*;

@Table(name = "book")
@ToString
public class Book {
    @Id
    private Integer id;

    /**
     * 书籍作者
     */
    private String author;

    /**
     * 书籍名称
     */
    private String name;

    /**
     * 书籍价格
     */
    private Float price;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 书籍描述
     */
    private String description;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取书籍作者
     *
     * @return author - 书籍作者
     */
    public String getAuthor() {
        return author;
    }

    /**
     * 设置书籍作者
     *
     * @param author 书籍作者
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * 获取书籍名称
     *
     * @return name - 书籍名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置书籍名称
     *
     * @param name 书籍名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取书籍价格
     *
     * @return price - 书籍价格
     */
    public Float getPrice() {
        return price;
    }

    /**
     * 设置书籍价格
     *
     * @param price 书籍价格
     */
    public void setPrice(Float price) {
        this.price = price;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取书籍描述
     *
     * @return description - 书籍描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置书籍描述
     *
     * @param description 书籍描述
     */
    public void setDescription(String description) {
        this.description = description;
    }
}