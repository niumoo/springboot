package net.codingme.boot;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * <p>
 * 正常的logback日志输出
 *
 * @Author niujinpeng
 * @Date 2018/8/26 9:20
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest2 {

    @Test
    public void testPrint() {
        log.debug("debug....");
        log.info("info....");
        log.error("error....");
    }


}
