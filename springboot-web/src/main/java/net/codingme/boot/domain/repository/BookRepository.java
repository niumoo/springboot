package net.codingme.boot.domain.repository;

import net.codingme.boot.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * <p>
 * 书籍Book的持久层操作
 *
 * @Author niujinpeng
 * @Date 2018/8/2323:15
 */
public interface BookRepository extends JpaRepository<Book, Integer> {

    /**
     * 通过作者查询书籍信息
     * @param author
     * @return
     */
    public List<Book> findByAuthor(String author);
}
