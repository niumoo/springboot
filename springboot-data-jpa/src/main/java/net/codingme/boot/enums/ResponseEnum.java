package net.codingme.boot.enums;


import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 用于系统返回的枚举类
 *
 * @Author niujinpeng
 * @Date 2018/8/24 14:30
 */
public enum ResponseEnum {

    /**
     * 系统总体相关
     */
    SUCCESS("0", "操作成功"),
    UNKNOW_ERROR("-1", "未知错误"),
    ERROR("999", "请求处理失败"),
    LOGIN_FIELD("1009", "用户名或者密码错误");

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
