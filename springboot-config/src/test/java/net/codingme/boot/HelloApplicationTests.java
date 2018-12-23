package net.codingme.boot;

import net.codingme.boot.domain.Person;
import net.codingme.boot.domain.PersonSource;
import net.codingme.boot.domain.PersonValue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class HelloApplicationTests {

    @Autowired
    private MockMvc mvc;
    @Autowired
    private Person person;
    @Autowired
    private PersonValue personValue;
    @Autowired
    private PersonSource personSource;
    @Autowired
    private ApplicationContext context;

    /**
     * 判断是否IOC容器中是否有指定的bean
     */
    @Test
    public void testSpringIOC() {
        boolean helloService = context.containsBean("helloService");
        System.out.println(helloService);
    }

    /**
     * 模拟请求测试
     *
     * @throws Exception
     */
    @Test
    public void testGetHello() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string("Greetings from Spring Boot!"));
    }

    /**
     * 测试@ConfigurationProperties
     */
    @Test
    public void testPersion() {
        System.out.println(person);
    }

    /**
     * 测试@Value 引入配置值
     */
    @Test
    public void testPersionValue() {
        System.out.println(personValue);
    }

    /**
     * 测试#PropertySource 引入配置值
     */
    @Test
    public void testPersionSource() {
        System.out.println(personSource);
    }

}
