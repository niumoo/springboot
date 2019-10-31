package net.codingme.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * <p>
 *
 * @Author niujinpeng
 * @Date 2019/10/29 23:51
 */
@ConfigurationProperties(prefix = "myapp.hello")
public class HelloProperties {

    private String suffix;

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
