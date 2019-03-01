package net.codingme.boot.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * <p>
 *
 * @Entity JPA实体
 * @Data GET SET TOSTRING
 * @NoArgsConstructor 无参构造
 * @AllArgsConstructor 全参构造
 * @Author niujinpeng
 * @Date 2018/12/19 17:13
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user")
public class User {

    /**
     * 用户ID
     *
     * @Id 主键
     * @GeneratedValue 自增主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户名
     */
    @Column(name = "username", length = 32, nullable = false)
    @NotNull(message = "用户名不能为空")
    private String username;
    /**
     * 密码
     */
    @Column(name = "password", length = 32, nullable = false)
    @NotNull(message = "密码不能为空")
    private String password;
    /**
     * 年龄
     */
    @Column(name = "age", length = 3)
    private Integer age;
    /**
     * 生日
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date birthday;
    /**
     * 技能
     */
    private String skills;
}
