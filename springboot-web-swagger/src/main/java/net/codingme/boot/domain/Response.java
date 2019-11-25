package net.codingme.boot.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;


/**
 * <p>
 * 响应实体类封装
 *
 * @Author niujinpeng
 * @Date 2019/11/19 23:17
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "响应信息")
public class Response {
    /**
     * 响应码
     */
    @ApiModelProperty(value = "响应码")
    private String code;
    /**
     * 响应信息
     */
    @ApiModelProperty(value = "响应信息")
    private String message;

    /**
     * 响应数据
     */
    @ApiModelProperty(value = "响应数据")
    private Collection content;
}
