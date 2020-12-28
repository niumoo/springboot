package com.wdbyte.mapper.primary;

import com.wdbyte.domain.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Book
     *
     * @mbg.generated Sat Dec 19 16:22:25 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Book
     *
     * @mbg.generated Sat Dec 19 16:22:25 CST 2020
     */
    int insert(Book record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Book
     *
     * @mbg.generated Sat Dec 19 16:22:25 CST 2020
     */
    Book selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Book
     *
     * @mbg.generated Sat Dec 19 16:22:25 CST 2020
     */
    List<Book> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Book
     *
     * @mbg.generated Sat Dec 19 16:22:25 CST 2020
     */
    int updateByPrimaryKey(Book record);
}