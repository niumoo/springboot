package net.codingme.boot.domain.mapper;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import net.codingme.boot.domain.Book;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookMapperTest {

    @Autowired
    private BookMapper bookMapper;

    @Test
    public void testSelectOne() {
        Book book = new Book();
        book.setId(2);
        Book selectOne = bookMapper.selectOne(book);
        Assert.assertNotNull(selectOne);
        System.out.println(selectOne);
    }

    @Test
    public void testSelectByPrimaryKey() {
        Book book = bookMapper.selectByPrimaryKey(2);
        Assert.assertNotNull(book);
        System.out.println(book);
    }

    /**
     * 分页测试
     */
    @Test
    public void testSelectPageInfo() {
        PageHelper.startPage(2, 3);
        List<Book> bookList = bookMapper.selectAll();
        Assert.assertNotNull(bookList);
        System.out.println("查询出数量：" + bookList.size());
        PageInfo<Book> pageInfo = PageInfo.of(bookList);
        System.out.println("总数量：" + pageInfo.getTotal());
        System.out.println("总页数：" + pageInfo.getPages());
        System.out.println("页大小：" + pageInfo.getPageSize());
        System.out.println("第几页：" + pageInfo.getPageNum());
        System.out.println("当前量：" + pageInfo.getSize());
    }

    /**
     * 分页测试
     */
    @Test
    public void testSelectPage() {
        PageHelper.startPage(2, 3);
        List<Book> bookList = bookMapper.selectAll();
        Assert.assertNotNull(bookList);
        System.out.println("查询出数量：" + bookList.size());
        System.out.println("总数量：" + ((Page)bookList).getTotal());
        System.out.println("总页数：" + ((Page)bookList).getPages());
        System.out.println("第几页：" + ((Page)bookList).getPageNum());
    }

}