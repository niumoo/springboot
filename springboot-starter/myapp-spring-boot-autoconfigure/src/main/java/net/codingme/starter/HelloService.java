package net.codingme.starter;

/**
 * <p>
 *
 * @Author niujinpeng
 * @Date 2019/10/29 23:51
 */
public class HelloService {

    HelloProperties helloProperties;

    public String sayHello(String name) {
        return "Hello " + name + "，" + helloProperties.getSuffix();
    }

    public HelloProperties getHelloProperties() {
        return helloProperties;
    }

    public void setHelloProperties(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }
}
