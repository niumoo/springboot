package net.codingme.boot.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 使用 Ali Druid 数据源
 *
 * @Author niujinpeng
 * @Date 2019/1/15 22:36
 */
@Configuration
public class DruidConfig {

    /**
     * 因为很多属性是DruidDataSource中独有的，所以需要指定前缀进行松散绑定。 也可以直接在这里设置，免去配置文件的参数配置
     */
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource dataSource() throws SQLException {
        DruidDataSource druidDataSource = new DruidDataSource();
        return druidDataSource;
    }

    /**
     * 配置druid监控以及用户名密码允许访问的ip和访问路径
     * 
     * @return
     */
    @Bean
    public ServletRegistrationBean statViewServlet() {
        ServletRegistrationBean<StatViewServlet> bean = new ServletRegistrationBean<>(new StatViewServlet());
        Map<String, String> initParams = new HashMap<>();
        initParams.put("loginUsername", "admin");
        initParams.put("loginPassword", "123");
        initParams.put("allow", "127.0.0.1");
        bean.setInitParameters(initParams);
        bean.setUrlMappings(Arrays.asList("/druid/*"));
        return bean;
    }

    /**
     * 配置druid的过滤器，用于统计信息
     * 
     * @return
     */
    @Bean
    public FilterRegistrationBean webStatFilter() {
        FilterRegistrationBean<WebStatFilter> bean = new FilterRegistrationBean<>(new WebStatFilter());
        HashMap<String, String> initParams = new HashMap<>();
        initParams.put("exclusions", "*.css,*.js,/webjars/*,/static/*,/druid/*");
        bean.setInitParameters(initParams);
        bean.setUrlPatterns(Arrays.asList("/*"));
        return bean;
    }

}
