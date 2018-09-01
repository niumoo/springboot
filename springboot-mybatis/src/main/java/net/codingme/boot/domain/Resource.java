package net.codingme.boot.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * <p>
 * Configuration 代表是一个配置，引用资源配置文件
 *
 * @Author niujinpeng
 * @Date 2018/8/26 12:07
 */
@Configuration
@ConfigurationProperties(prefix = "net.codingme.opensource")
@PropertySource(value = "classpath:resource.properties")
public class Resource {

    private String name;

    private String website;

    private String language;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
