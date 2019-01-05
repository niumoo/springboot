package net.codingme.boot.utils;

import net.codingme.boot.domain.Response;
import net.codingme.boot.enums.ResponseEnum;

import java.util.ArrayList;
import java.util.Collection;

/**
 * <p>
 * 方便响应的工具类
 *
 * @Author niujinpeng
 * @Date 2018/12/19 17:33
 */
public class ResponseUtill {

    public static Response success(Object objects) {
        ArrayList list = new ArrayList<>();
        if (!(objects instanceof Collection)) {
            list.add(objects);
        } else {
            list = (ArrayList) objects;
        }
        return new Response("0000", "success", list);
    }

    public static Response success() {
        return success(null);
    }

    public static Response error(String code, String message) {
        return new Response(code, message, null);
    }

    public static Response error(ResponseEnum responseEnum) {
        return error(responseEnum.getCode(), responseEnum.getMessage());
    }


}
