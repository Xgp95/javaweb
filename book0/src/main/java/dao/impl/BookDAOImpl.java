package dao.impl;

import dao.BookDAO;
import pojo.Book;

import java.util.List;

/**
 * @author: Xugp
 * @date: 2022/2/8 17:36
 * @description:
 */
public class BookDAOImpl extends BaseDao implements BookDAO {
    @Override
    /*
     * @param book:
     * @return: int
     * @author: Xugp
     * @date: 2022/2/8 17:44
     * @description:如果返回-1,说明执行失败<br/>返回其他表示影响的行数
     */
    public int addBook(Book book) {
        String sql = "INSERT INTO t_book(`name` , `author` , `price` , `sales` , `stock` , `img_path`) VALUES(?,?,?,?,?,?);";
        return update(sql, book.getName(), book.getAuthor(), book.getPrice(), book.getSales(), book.getStock(), book.getImgPath());
    }

    @Override
    public int addBookById(Book book) {
        String sql = "INSERT INTO t_book(`id` , `name` , `author` , `price` , `sales` , `stock` , `img_path`) VALUES(?,?,?,?,?,?,?);";
        return update(sql, book.getId(), book.getName(), book.getAuthor(), book.getPrice(), book.getSales(), book.getStock(), book.getImgPath());
    }

    @Override
    /*
     * @param id:
     * @return: int
     * @author: Xugp
     * @date: 2022/2/8 17:43
     * @description:如果返回-1,说明执行失败<br/>返回其他表示影响的行数
     */
    public int deleteBook(Integer id) {
        String sql = "delete from t_book where id = ?";
        return update(sql, id);
    }

    @Override
    /*
     * @param book:
     * @return: int
     * @author: Xugp
     * @date: 2022/2/8 17:47
     * @description:如果返回-1,说明执行失败<br/>返回其他表示影响的行数
     */
    public int updateBook(Book book) {
        String sql = "update t_book set `name` = ?, `author` = ?, `price` = ?, `sales` = ?, `stock` = ?, `img_path` = ? where id = ?;";
        return update(sql, book.getName(), book.getAuthor(), book.getPrice(), book.getSales(), book.getStock(), book.getImgPath(), book.getId());
    }

    @Override
    /*
     * @param id:
     * @return: pojo.Book
     * @author: Xugp
     * @date: 2022/2/8 17:50
     * @description:返回一个
     */
    public Book queryBookById(Integer id) {
        String sql = "select `id` , `name` , `author` , `price` , `sales` , `stock` , `img_path` from t_book where id = ?";
        return queryForOne(Book.class, sql, id);
    }

    @Override
    /*

     * @return: java.util.List<pojo.Book>
     * @author: Xugp
     * @date: 2022/2/8 17:51
     * @description:返回全部
     */
    public List<Book> queryBooks() {
        String sql = "select `id` , `name` , `author` , `price` , `sales` , `stock` , `img_path` from t_book";
        return queryForList(Book.class, sql);
    }

    @Override
    public Integer queryForPageTotalCount() {
        String sql = "select count(*) from t_book";
        Number number = (Number) queryForSingleValue(sql);
        return number.intValue();
    }

    @Override
    public List<Book> queryForPageItems(Integer begin, Integer pageSize) {
        String sql = "select `id` , `name` , `author` , `price` , `sales` , `stock` , `img_path` from t_book limit ?,?";
        List<Book> books = queryForList(Book.class, sql, begin, pageSize);
        return (List<Book>) books;
    }

    @Override
    public Integer queryForPageTotalCountByPrice(Integer min, Integer max) {
        String sql = "select count(*) from t_book where `price`between ? and ?";
        Number number = (Number) queryForSingleValue(sql, min, max);
        return number.intValue();
    }

    @Override
    public List<Book> queryForPageItemsByPrice(int begin, Integer pageSize, Integer min, Integer max) {
        String sql = "select `id` , `name` , `author` , `price` , `sales` , `stock` , `img_path` from t_book " +
                "where `price`between ? and ? order by `price`  limit ?,?";
        List<Book> books = queryForList(Book.class, sql, min, max, begin, pageSize);
        return books;
    }
}
