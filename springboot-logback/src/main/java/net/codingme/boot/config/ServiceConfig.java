package net.codingme.boot.config;

import net.codingme.boot.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p>
 * 配置类，相当于传统Spring 开发中的 xml-> bean的配置
 *
 * @Author niujinpeng
 * @Date 2018/12/7 0:04
 */
@Configuration
public class ServiceConfig {

    /**
     * 默认添加到容器中的 ID 为方法名（helloService）
     *
     * @return
     */
    @Bean
    public HelloService helloService() {
        return new HelloService();
    }

}
