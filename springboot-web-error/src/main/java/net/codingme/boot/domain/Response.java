package net.codingme.boot.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;


/**
 * <p>
 * 响应实体类封装
 *
 * @Author niujinpeng
 * @Date 2018/12/19 17:13
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Response<T> {
    /**
     * 响应码
     */
    private String code;
    /**
     * 响应信息
     */
    private String message;

    /**
     * 响应数据
     */
    private Collection<T> data;

}
