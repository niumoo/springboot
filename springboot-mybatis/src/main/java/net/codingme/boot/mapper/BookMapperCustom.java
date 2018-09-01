package net.codingme.boot.mapper;

        import net.codingme.boot.domain.Book;

        import java.util.List;

/**
 * 自定义mapper
 */
public interface BookMapperCustom {
    List<Book> selectBookById(Integer id);
}