package net.codingme.boot.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * <p>
 * 书籍实体类(JPA)
 *
 * @Entity表明是一个实体类
 * @Author niujinpeng
 * @Date 2018/8/23 23:08
 */
@Entity
public class Book {

    /**
     * 自增的书籍ID
     */
    @Id
    @GeneratedValue
    private Integer id;

    @NotEmpty(message = "书籍名称不能为空")
    private String name;

    @NotEmpty(message = "作者信息不能为空")
    private String author;

    @NotNull(message = "价格信息不能为空")
    private float price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Book(
            @NotEmpty(message = "书籍名称不能为空") String name,
            @NotEmpty(message = "作者信息不能为空") String author,
            @NotEmpty(message = "价格信息不能为空") Float price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book() {
    }
}
