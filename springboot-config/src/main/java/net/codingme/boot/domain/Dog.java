package net.codingme.boot.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * <p>
 *
 * @Data lombok的注解，会为这个类所有属性添加 getting 和 setting 方法，此外还提供了equals、canEqual、hashCode、toString 方法
 * @Component 加到spring 容器中
 * @ConfigurationProperties 告诉这个类的属性都是配置文件里的属性，prefix指定读取配置文件的前缀
 * @Author niujinpeng
 * @Date 2018/12/6 22:56
 */

@Data
@Component
@ConfigurationProperties(prefix = "person.dog")
public class Dog {
    private String name;
    private Integer age;
}
