package net.codingme.boot.domain.mapper;

import java.util.List;

import net.codingme.boot.domain.Book;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.mapstruct.Mapper;

@Mapper
public interface BookMapper {

    Book selectByPrimaryKey(Integer id);

    List<Book> selectAll();

    @Results({
            @Result(property = "id", column = "ids"),
            @Result(property = "name", column = "name"),
            @Result(property = "author", column = "authors"),
            @Result(property = "createTime", column = "create_time")
    })
    @Select("select id as ids, author as authors, name, price, create_time, description from book where author = #{author}")
    List<Book> selectByAuthor(@Param("author") String author);

    int deleteByPrimaryKey(Integer id);

    int insert(Book record);

    int updateByPrimaryKey(Book record);


}