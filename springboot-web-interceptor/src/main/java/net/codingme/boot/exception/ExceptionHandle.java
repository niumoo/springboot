package net.codingme.boot.exception;

import lombok.extern.slf4j.Slf4j;
import net.codingme.boot.domain.Response;
import net.codingme.boot.enums.ResponseEnum;
import net.codingme.boot.utils.ResponseUtill;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 * 统一的异常处理
 *
 * @Author niujinpeng
 * @Date 2019/1/7 14:26
 */

@Slf4j
@ControllerAdvice
public class ExceptionHandle {

    @ResponseBody
    @ExceptionHandler(Exception.class)
    public Response handleException(Exception e) {
        log.info("异常 {}", e);
        if (e instanceof BaseException) {
            BaseException exception = (BaseException) e;
            String code = exception.getCode();
            String message = exception.getMessage();
            return ResponseUtill.error(code, message);
        }
        return ResponseUtill.error(ResponseEnum.UNKNOW_ERROR);
    }


    /**
     * 判断是否是Ajax请求
     *
     * @param request
     * @return
     */
    public static boolean isAjax(HttpServletRequest request) {
        String rquested = request.getHeader("X-Rquested-With");
        if (request == null) {
            return false;
        }
        if (!"XMLHttpRequest".equals(rquested.toString())) {
            return false;
        }
        return true;
    }


}
