package net.codingme.boot.domain;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 使用@PropertySource加载自定义的配置文件，需要注意的是，由于@PropertySource指定的文件会优先加载，
 * 所以如果在 applocation.properties中存在相同的属性配置，会覆盖前者的值。
 *
 * @@PropertySource 加载自定义的配置文件
 * @Data lombok的注解，会为这个类所有属性添加 getting 和 setting 方法，此外还提供了equals、canEqual、hashCode、toString 方法
 * @Component 加到spring 容器中
 * @ConfigurationProperties 告诉这个类的属性都是配置文件里的属性，prefix指定读取配置文件的前缀
 * @Author niujinpeng
 * @Date 2018/12/6 22:54
 */

@Data
@Component
@Validated
@PropertySource(value = "classpath:domain-person.properties")
@ConfigurationProperties(value = "person")
public class PersonSource {

    private String lastName;
    private Integer age;
    private Date birth;
    private Map<String, String> maps;
    private List<String> lists;
    private Dog dog;

    /**
     * 支持数据校验
     */
    @Email
    private String email;

}
