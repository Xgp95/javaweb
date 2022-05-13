package service.impl;

import dao.BookDAO;
import dao.impl.BookDAOImpl;
import pojo.Book;
import pojo.Page;
import service.BookService;

import java.util.List;

/**
 * @author: Xugp
 * @date: 2022/2/9 17:09
 * @description:
 */
public class BookServiceImpl implements BookService {
    BookDAO bookDAOImpl = new BookDAOImpl();

    @Override
    public int addBook(Book book) {

        return bookDAOImpl.addBook(book);
    }

    @Override
    public int deleteBookById(Integer id) {
        return bookDAOImpl.deleteBook(id);
    }

    @Override
    public int updateBook(Book book) {
        return bookDAOImpl.updateBook(book);
    }

    @Override
    public Book queryOneById(Integer id) {
        return bookDAOImpl.queryBookById(id);
    }

    @Override
    public List<Book> queryAllBook() {
        return bookDAOImpl.queryBooks();
    }

    @Override
    public Page<Book> page(int pageNo, int pageSize) {
        Page<Book> bookPage = new Page<>();

        bookPage.setPageSize(pageSize);

        Integer pageTotalCount = bookDAOImpl.queryForPageTotalCount();

        bookPage.setPageCountTotal(pageTotalCount);

        Integer pageTotal = pageTotalCount / pageSize;
        if (pageTotalCount % pageSize > 0) {
            pageTotal++;
        }

        bookPage.setPageTotal(pageTotal);
        if (pageNo < 1) {
            pageNo = 1;
        }
        if (pageNo > pageTotal) {
           pageNo = pageTotal;
        }
        bookPage.setPageNo(pageNo);
        int begin = (bookPage.getPageNo() - 1) * pageSize;

        List<Book> items = bookDAOImpl.queryForPageItems(begin, bookPage.getPageSize());

        bookPage.setItems(items);

        return bookPage;
    }

    @Override
    public Page<Book> pageByPrice(Integer pageNo, Integer pageSize, Integer min, Integer max) {
        Page<Book> bookPage = new Page<>();

        bookPage.setPageSize(pageSize);

        Integer pageTotalCount = bookDAOImpl.queryForPageTotalCountByPrice(min,max);

        bookPage.setPageCountTotal(pageTotalCount);

        Integer pageTotal = pageTotalCount / pageSize;
        if (pageTotalCount % pageSize > 0) {
            pageTotal++;
        }

        bookPage.setPageTotal(pageTotal);
        if (pageNo < 1) {
            pageNo = 1;
        }
        if (pageNo > pageTotal) {
            pageNo = pageTotal;
        }
        bookPage.setPageNo(pageNo);
        int begin = (bookPage.getPageNo() - 1) * pageSize;

        List<Book> items = bookDAOImpl.queryForPageItemsByPrice(begin, bookPage.getPageSize(),min,max);

        bookPage.setItems(items);

        return bookPage;
    }


}
