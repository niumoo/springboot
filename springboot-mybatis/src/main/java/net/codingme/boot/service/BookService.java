package net.codingme.boot.service;

import net.codingme.boot.domain.Book;

import java.util.List;

/**
 * <p>
 * Book的业务逻辑接口
 *
 * @Author niujinpeng
 * @Date 2018/9/19:16
 */
public interface BookService {

    public void saveBook(Book book) throws Exception;

    public void updateBook(Book book);

    public void deleteBook(Integer bookId);

    public Book queryBookById(Integer bookId);

    public List<Book> queryBookList(Book book);

    public List<Book> queryBookListPaged(Book book, Integer page, Integer pageSize);

    /**
     * 自定义查询 - 根据ID查询Book信息
     *
     * @param id
     * @return
     */
    public List<Book> selectBookById(Integer id);

    //public List<Book> queryBookListPagedJqgrid(Book book,Integer page,Integer pageSize);

    //public Book queryBookByIdCustom(String userId);

    public void saveUserTransactional(Book book);

}
