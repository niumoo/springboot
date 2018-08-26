package net.codingme.boot.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * <p>
 * 定时器
 *
 * @Author niujinpeng
 * @Date 2018/8/3 23:33
 */
@Component
@Slf4j
public class TaskJob {

    /**
     * 每20秒运行一次定时器
     *
     * @throws IOException
     */
    @Scheduled(cron = "0/20 * * * * ?")
    public void getBingWallpaper() throws IOException {
        log.info("我是定时任务，我20S运行一次");
    }
}
