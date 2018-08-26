package net.codingme.boot.controller;

import net.codingme.boot.domain.Book;
import net.codingme.boot.domain.Result;
import net.codingme.boot.enums.ResultEnum;
import net.codingme.boot.service.BookService;
import net.codingme.boot.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


/**
 * <p>
 * Book控制器
 *
 * @Author niujinpeng
 * @Date 2018/8/23 23:28
 */

@RequestMapping(value = "/book")
@RestController
public class BookController {

    /**
     * 分页大小
     */
    @Value("${pageSize}")
    private Integer pageSize;

    @Autowired
    private BookService bookService;

    /**
     * 从第0页开始
     * 根据ID逆序
     * 分页查询页码，条数，排序
     *
     * @param page
     * @return
     */
    @GetMapping(value = "/list2")
    public Page findAll(@RequestParam(value = "page", defaultValue = "0") Integer page) {
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        PageRequest pageRequest = new PageRequest(page, pageSize, sort);
        return bookService.findAll(pageRequest);
    }

    /**
     * 根据ID获取书籍
     *
     * @param bookId
     * @return
     */
    @GetMapping(value = "/{bookId}")
    public Book findById(@PathVariable("bookId") Integer bookId) {
        return bookService.findById(bookId);
    }

    /**
     * 新增书籍添加书籍实体字段验证
     *
     * @param book
     * @return
     */
    @PostMapping(value = "/insert")
    public Result insert(@Valid Book book, BindingResult bindingResult) {
        // 校验出错信息
        if(bindingResult.hasErrors()){
            String message = bindingResult.getFieldError().getDefaultMessage();
            return ResultUtil.error(ResultEnum.ERROR.getCode(),message);
        }
        book = bookService.insert(book);
        return ResultUtil.success(book);
    }

    /**
     * 更新书籍
     *
     * @param book
     * @return
     */
    @PutMapping(value = "/update")
    public Book update(Book book) {
        return bookService.update(book);
    }

    /**
     * 删除书籍
     *
     * @param id
     * @return
     */
    @DeleteMapping(value = "/delete/{bookId}")
    public Book delete(@PathVariable("bookId") Integer id) {
        return bookService.delete(id);
    }

    @GetMapping(value = "/author/{author}")
    public Result findByAuthor(@PathVariable(value = "author") String author) {
        List<Book> bookList = bookService.findByAuthor(author);
        return ResultUtil.success(bookList);
    }


}
