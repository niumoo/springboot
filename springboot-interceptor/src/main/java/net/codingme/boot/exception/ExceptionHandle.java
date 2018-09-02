package net.codingme.boot.exception;

import net.codingme.boot.domain.Result;
import net.codingme.boot.enums.ResultEnum;
import net.codingme.boot.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

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
    public Result handle(Exception e) {
        logger.info("【异常】{}",e);

        if (e instanceof BaseException) {
            BaseException baseException = (BaseException) e;
            Integer code = baseException.getCode();
            String message = baseException.getMessage();
            return ResultUtil.error(code, message);
        }
        return ResultUtil.error(ResultEnum.UNKNOW_ERROR);
    }

}
