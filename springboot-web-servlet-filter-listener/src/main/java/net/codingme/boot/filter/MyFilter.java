package net.codingme.boot.filter;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * <p>
 *
 * @Author niujinpeng
 * @Date 2019/1/24 16:35
 */
@Slf4j
@WebFilter(urlPatterns = "/*")
public class MyFilter implements Filter {


    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        log.info("拦截器开始拦截");
        filterChain.doFilter(request, response);
    }

}
