package net.codingme.boot.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * <p>
 * 用户实体类
 *
 * @Author niujinpeng
 * @Date 2018/12/19 17:13
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "用户对象")
public class User {

    /**
     * 用户ID
     *
     * @Id 主键
     * @GeneratedValue 自增主键
     */
    @NotNull(message = "用户 ID 不能为空")
    @ApiModelProperty(value = "用户ID", required = true, example = "1000")
    private Integer id;

    /**
     * 用户名
     */
    @NotNull(message = "用户名不能为空")
    @ApiModelProperty(value = "用户名", required = true)
    private String username;
    /**
     * 密码
     */
    @NotNull(message = "密码不能为空")
    @ApiModelProperty(value = "用户密码", required = true)
    private String password;
    /**
     * 年龄
     */
    @ApiModelProperty(value = "用户年龄", example = "18")
    private Integer age;
    /**
     * 生日
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    @ApiModelProperty(value = "用户生日")
    private Date birthday;
    /**
     * 技能
     */
    @ApiModelProperty(value = "用户技能")
    private String skills;

}
