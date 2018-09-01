package net.codingme.boot.utils;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * <p>
 * 继承自己的MyMapper
 *
 * @Author niujinpeng
 * @Date 2018/8/30 23:16
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
    // todo
    // 特别注意，这个接口不能被扫描到，否则会报错
}
