package net.codingme.boot.exception;

import net.codingme.boot.enums.ResultEnum;

/**
 * <p>
 * 自定义异常类
 *
 * @Author niujinpeng
 * @Date 2018/8/24 14:39
 */
public class BaseException extends RuntimeException {

    private Integer code;

    public BaseException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    public BaseException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
