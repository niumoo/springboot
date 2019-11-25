package net.codingme.boot.enums;


import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 用于系统返回的枚举类
 *
 * @Author niujinpeng
 * @Date 2019/11/19 23:17
 */
public enum ResponseEnum {

    /**
     * 系统总体相关
     */
    SUCCESS("200", "操作成功"),
    UNKNOW_ERROR("-1", "未知错误"),
    ERROR("999", "请求处理失败");

    @Setter
    @Getter
    private String code;

    @Setter
    @Getter
    private String message;

    ResponseEnum(String code, String msg) {
        this.code = code;
        this.message = msg;
    }
}
