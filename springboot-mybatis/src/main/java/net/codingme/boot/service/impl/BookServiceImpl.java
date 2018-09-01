package net.codingme.boot.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import net.codingme.boot.domain.Book;
import net.codingme.boot.mapper.BookMapper;
import net.codingme.boot.mapper.BookMapperCustom;
import net.codingme.boot.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * <p>
 * book的业务逻辑实现
 *
 * @Author niujinpeng
 * @Date 2018/9/1 9:36
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;
    @Autowired
    private BookMapperCustom bookMapperCustom;

    /**
     * 使用
     *
     * @param book
     * @throws Exception
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void saveBook(Book book) throws Exception {
        bookMapper.insert(book);
    }

    @Override
    public void updateBook(Book book) {
        // selective只更新有值的字段
        bookMapper.updateByPrimaryKeySelective(book);
        // 会更新所有字段，没有值则会赋值Null
        //bookMapper.updateByPrimaryKey(book);
    }

    @Override
    public void deleteBook(Integer bookId) {
        bookMapper.deleteByPrimaryKey(bookId);
    }

    @Override
    public Book queryBookById(Integer bookId) {
        Book book = bookMapper.selectByPrimaryKey(bookId);
        return book;
    }

    @Override
    public List<Book> queryBookList(Book book) {
        List<Book> books = bookMapper.selectAll();
        return books;
    }

    @Override
    public List<Book> queryBookListPaged(Book book, Integer page, Integer pageSize) {
        // 开始分页
        PageHelper.startPage(page, pageSize);
        Example example = new Example(Book.class);
        Example.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(book)) {
            if (!StringUtils.isEmpty(book.getName())) {
                criteria.andLike("name", "%" + book.getName() + "%");
            }
        }
        example.orderBy("createTime").desc();
        List<Book> books = bookMapper.selectByExample(example);
        return books;
    }

    /**
     * 事务测试
     *
     * @param book
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void saveUserTransactional(Book book) {
        bookMapper.insert(book);
        int a = 1 / 0;
        bookMapper.updateByPrimaryKeySelective(book);
    }

    /**
     * 自定义查询 - 根据ID查询Book信息
     *
     * @param id
     * @return
     */
    @Override
    public List<Book> selectBookById(Integer id) {
        List<Book> books = bookMapperCustom.selectBookById(id);
        return books;
    }
}
