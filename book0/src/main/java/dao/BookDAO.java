package dao;

import pojo.Book;

import java.util.List;

/**
 * @author: Xugp
 * @date: 2022/2/8 17:34
 * @description:
 */
public interface BookDAO {
    public int addBook(Book book);
    public int addBookById(Book book);
    public int deleteBook(Integer id);
    public int updateBook(Book book);
    public Book queryBookById(Integer id);
    public List<Book> queryBooks();
    Integer queryForPageTotalCount();
    List<Book> queryForPageItems(Integer begin,Integer pageSize);

    Integer queryForPageTotalCountByPrice(Integer min, Integer max);

    List<Book> queryForPageItemsByPrice(int begin, Integer pageSize, Integer min, Integer max);
}
