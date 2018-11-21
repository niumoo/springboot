package net.codingme.boot.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *
 * @Author niujinpeng
 * @Date 2018/12/19 17:13
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    /**
     * 用户名
     */
    private String username;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 生日
     */
    private Date birthday;
    /**
     * 技能
     */
    private List<String> skills;

}
