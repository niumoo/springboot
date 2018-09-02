package net.codingme.boot.config;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 注意：在springboot2.0之前使用 extends WebMvcConfigurerAdapter 来实现功能
 * 但是在springboot2.0 中应使用WebMvcConfigurer
 * 原因可以看WebMvcConfigurerAdapter注释
 *
 * @Author niujinpeng
 * @Date 2018/8/3 23:15
 * @see WebMvcConfigurerAdapter
 * 1.使用FastJSON
 * 2.配置时间格式化
 * 3.解决中文乱码
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    /**
     * 1.使用FastJSON
     * 2.配置时间格式化
     * 3.解决中文乱码
     *
     * @param converters
     */
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
        //日期格式化
        fastJsonConfig.setDateFormat("yyyy-MM-dd HH:mm:ss");
        //处理中文乱码问题
        List<MediaType> fastMediaTypes = new ArrayList<>();
        fastMediaTypes.add(MediaType.APPLICATION_JSON_UTF8);

        converter.setSupportedMediaTypes(fastMediaTypes);
        converter.setFastJsonConfig(fastJsonConfig);
        converters.add(converter);
    }

}
