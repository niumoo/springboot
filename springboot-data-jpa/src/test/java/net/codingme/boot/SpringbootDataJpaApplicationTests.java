package net.codingme.boot;

import com.alibaba.fastjson.JSON;
import net.codingme.boot.domain.User;
import net.codingme.boot.domain.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootDataJpaApplicationTests {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testUser(){
        List<User> one = userRepository.findAll();
        System.out.println(JSON.toJSONString(one));
    }


    @Test
    public void contextLoads() throws SQLException {
        System.out.println(dataSource.getClass());
    }

}

