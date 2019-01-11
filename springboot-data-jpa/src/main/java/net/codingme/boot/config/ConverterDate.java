package net.codingme.boot.config;

import net.codingme.boot.enums.ResponseEnum;
import net.codingme.boot.exception.BaseException;
import org.springframework.core.convert.converter.Converter;
import org.springframework.util.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <p>
 *
 * @Author niujinpeng
 * @Date 2019/1/11 15:18
 */
public class ConverterDate implements Converter<String, Date> {

    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

    @Override
    public Date convert(String s) {
        if (StringUtils.isEmpty(s)) {
            return null;
        }
        try {
            return simpleDateFormat.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
