package net.codingme.boot.utils;

import net.codingme.boot.domain.Result;
import net.codingme.boot.enums.ResultEnum;

/**
 * 统一的返回值处理
 *
 * @Author DarcyNiu
 * @date 2018/4/7 22:20
 */
public class ResultUtil {

    public static Result success(Object object) {
        Result result = new Result();
        result.setCode(0);
        result.setMessage("success");
        result.setData(object);
        return result;
    }

    public static Result success() {
        return success(null);
    }

    public static Result error(Integer code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMessage(msg);
        return result;
    }

    public static Result error(ResultEnum resultEnum) {
        Result result = new Result();
        result.setCode(resultEnum.getCode());
        result.setMessage(resultEnum.getMessage());
        return result;

    }
}
