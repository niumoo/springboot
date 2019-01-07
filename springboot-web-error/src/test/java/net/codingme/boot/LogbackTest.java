package net.codingme.boot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * <p>
 * 测试日志输出，
 * SLF4J 日志级别从小到大trace,debug,info,warn,error
 *
 * @Author niujinpeng
 * @Date 2018/12/11 21:12
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class LogbackTest {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void testLog() {
        logger.trace("Trace 日志...");
        logger.debug("Debug 日志...");
        logger.info("Info 日志...");
        logger.warn("Warn 日志...");
        logger.error("Error 日志...");
    }
}
