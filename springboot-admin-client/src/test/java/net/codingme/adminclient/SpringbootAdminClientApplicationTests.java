package net.codingme.adminclient;

import de.codecentric.boot.admin.client.registration.DefaultApplicationFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.InetAddress;
import java.net.UnknownHostException;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class SpringbootAdminClientApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void test() throws UnknownHostException {
        System.out.println( InetAddress.getLocalHost());

    }

}
