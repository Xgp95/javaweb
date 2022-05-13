package web;

import com.google.gson.Gson;
import pojo.Book;
import pojo.Cart;
import pojo.CartItem;
import service.BookService;
import service.impl.BookServiceImpl;
import utils.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: Xugp
 * @date: 2022/2/21 14:30
 * @description:
 */
public class CartServlet extends BaseServlet {
    BookService bookService = new BookServiceImpl();

    protected void ajaxAddItems(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        Integer id = WebUtils.parseInt(req.getParameter("id"), 0);
        Book book = bookService.queryOneById(id);
        CartItem cartItem = new CartItem(book.getId(), book.getName(), 1, book.getPrice(), book.getPrice());
        Cart cart = (Cart) req.getSession().getAttribute("cart");
        if (cart == null){
            cart = new Cart();
            req.getSession().setAttribute("cart", cart);
        }

        cart.addItem(cartItem);
        req.getSession().setAttribute("lastName", book.getName());

        Map<String,Object> resultMap = new HashMap<>();
        resultMap.put("lastName", cartItem.getName());
        resultMap.put("totalCount", cart.getTotalCount());
        Gson gson = new Gson();
        String resultJson = gson.toJson(resultMap);
        resp.getWriter().write(resultJson);
    }

    protected void updateCount(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cart cart = (Cart) req.getSession().getAttribute("cart");
        Integer id = WebUtils.parseInt(req.getParameter("id"), 0);
        Integer count = WebUtils.parseInt(req.getParameter("count"), 0);
        if (cart != null) {
            cart.updateCount(id, count);
            resp.sendRedirect(req.getHeader("Referer"));
        }
    }

    protected void clearItems(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cart cart = (Cart) req.getSession().getAttribute("cart");
        if (cart != null) {
            cart.clear();
            resp.sendRedirect(req.getHeader("Referer"));
        }
    }

    protected void deleteItems(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id = WebUtils.parseInt(req.getParameter("id"), 0);
        Cart cart = (Cart) req.getSession().getAttribute("cart");
        if (cart != null) {
            cart.deleteItem(id);
            resp.sendRedirect(req.getHeader("Referer"));
        }
    }

    protected void addItems(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Integer id = WebUtils.parseInt(req.getParameter("id"), 0);
        Book book = bookService.queryOneById(id);
        CartItem cartItem = new CartItem(book.getId(), book.getName(), 1, book.getPrice(), book.getPrice());
        Cart cart = (Cart) req.getSession().getAttribute("cart");
        if (cart == null) {
            cart = new Cart();
            req.getSession().setAttribute("cart", cart);
        }
        cart.addItem(cartItem);
//        获取添加的商品名称
        req.getSession().setAttribute("lastName", book.getName());
        resp.sendRedirect(req.getHeader("Referer"));
    }
}
