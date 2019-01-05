package net.codingme.boot.exception;

import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.WebRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 自定义错误信息JSON值
 *
 * @Author niujinpeng
 * @Date 2019/1/7 15:21
 */
@Component
public class ErrorAttributesCustom extends DefaultErrorAttributes {

    @Override
    public Map<String, Object> getErrorAttributes(WebRequest webRequest, boolean includeStackTrace) {
        Map<String, Object> map = super.getErrorAttributes(webRequest, includeStackTrace);
        String code = map.get("status").toString();
        String message = map.get("error").toString();
        map.remove("status");
        map.remove("error");
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("code", code);
        hashMap.put("message", message);
        hashMap.put("data", map);
        return hashMap;
    }
}
