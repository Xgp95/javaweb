package service;

import pojo.Book;
import pojo.Page;

import java.util.List;

/**
 * @author: Xugp
 * @date: 2022/2/9 17:05
 * @description:
 */
public interface BookService {
    public int addBook(Book book);
    public int deleteBookById(Integer id);
    public int updateBook(Book book);
    public Book queryOneById(Integer id);
    public List<Book> queryAllBook();
    Page<Book> page(int pageNo,int pageSize);

    Page<Book> pageByPrice(Integer pageNo, Integer pageSize, Integer min, Integer max);
}
