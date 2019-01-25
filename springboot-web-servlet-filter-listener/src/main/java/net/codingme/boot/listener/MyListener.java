package net.codingme.boot.listener;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * <p>
 *
 * @Author niujinpeng
 * @Date 2019/1/24 16:45
 */
@Slf4j
@WebListener
public class MyListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        log.info("监听器开始初始化");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        log.info("监听器开始销毁");
    }
}
