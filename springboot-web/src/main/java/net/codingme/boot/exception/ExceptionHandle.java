package net.codingme.boot.exception;

import net.codingme.boot.domain.Result;
import net.codingme.boot.enums.ResultEnum;
import net.codingme.boot.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p>
 * SpringMVC统一的异常处理
 *
 * @Author niujinpeng
 * @Date 2018/8/24 14:35
 */
@ControllerAdvice
public class ExceptionHandle {
    private final static Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e, HttpServletRequest request, HttpServletResponse response) {
        logger.info("【异常】{}", e);

        if (e instanceof BaseException) {
            BaseException baseException = (BaseException) e;
            Integer code = baseException.getCode();
            String message = baseException.getMessage();
            return ResultUtil.error(code, message);
        }
        return ResultUtil.error(ResultEnum.UNKNOW_ERROR);
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
