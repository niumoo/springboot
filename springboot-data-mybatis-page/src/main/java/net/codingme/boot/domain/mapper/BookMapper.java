package net.codingme.boot.domain.mapper;

import net.codingme.boot.domain.Book;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

@Repository
public interface BookMapper extends MySqlMapper<Book>, Mapper<Book> {

}