package net.codingme.boot.exception;


import lombok.Getter;
import lombok.Setter;
import net.codingme.boot.enums.ResponseEnum;

/**
 * <p>
 * 自定义异常类
 *
 * @Author niujinpeng
 * @Date 2018/8/24 14:39
 */
@Getter
@Setter
public class BaseException extends RuntimeException {

    private String code;

    public BaseException(String message, String code) {
        super(message);
        this.code = code;
    }

    public BaseException(ResponseEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

}
