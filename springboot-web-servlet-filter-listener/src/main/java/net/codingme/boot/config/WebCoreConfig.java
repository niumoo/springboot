//package net.codingme.boot.config;
//
//import net.codingme.boot.filter.MyFilter;
//import net.codingme.boot.listener.MyListener;
//import net.codingme.boot.servlet.MyServlet;
//import org.springframework.boot.web.servlet.FilterRegistrationBean;
//import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
//import org.springframework.boot.web.servlet.ServletRegistrationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.servlet.FilterRegistration;
//import javax.servlet.Servlet;
//
///**
// * <p>
// * 在这里注册Servlet Filter Listener 或者使用 @ServletComponentScan
// *
// * @Author niujinpeng
// * @Date 2019/1/24 16:30
// */
//@Configuration
//public class WebCoreConfig {
//
//    @Bean
//    public ServletRegistrationBean myServlet() {
//        return new ServletRegistrationBean<>(new MyServlet());
//    }
//
//    @Bean
//    public FilterRegistrationBean myFitler() {
//        return new FilterRegistrationBean<>(new MyFilter());
//    }
//
//    @Bean
//    public ServletListenerRegistrationBean myListener() {
//        return new ServletListenerRegistrationBean(new MyListener());
//    }
//
//
//}
