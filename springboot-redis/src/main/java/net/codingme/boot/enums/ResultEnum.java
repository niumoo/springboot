package net.codingme.boot.enums;

/**
 * <p>
 * 用于系统返回的枚举类
 *
 * @Author niujinpeng
 * @Date 2018/8/24 14:30
 */
public enum ResultEnum {

    /**
     * 系统总体相关
     */
    SUCCESS(0, "success"),
    UNKNOW_ERROR(-1, "未知错误"),
    ERROR(999,"请求处理失败"),

    /**
     * Book类相关，1---
     */
    BOOK_DEL_IS_NULL(1000, "查询不到相关的书籍信息");

    private Integer code;

    private String message;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.message = msg;
    }
}
