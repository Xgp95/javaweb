package web;

import pojo.Cart;
import pojo.Order;
import pojo.OrderItem;
import pojo.User;
import service.OrderService;
import service.impl.OrderServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author: Xugp
 * @date: 2022/2/22 14:47
 * @description:
 */
public class OrderServlet extends BaseServlet{
    private OrderService orderService = new OrderServiceImpl();

    protected void createOrder(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cart cart = (Cart) req.getSession().getAttribute("cart");
        User loginUser = (User) req.getSession().getAttribute("loginUser");
        if (loginUser == null){
            req.getRequestDispatcher("/pages/user/login.jsp").forward(req, resp);
            return;
        }
        Integer userId = loginUser.getId();
        String orderId = orderService.createOrder(cart, userId);
        req.getSession().setAttribute("orderId", orderId);
        resp.sendRedirect(req.getContextPath() + "/pages/cart/checkout.jsp");
    }

    protected void showAllOrders(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    protected void sendOrder(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    protected void showOrderDetail(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String orderId = req.getParameter("orderId");
        String createTime = req.getParameter("createTime");
        List<OrderItem> orderItemList = orderService.showOrderDetail(orderId);
        req.getSession().setAttribute("orderItemList",orderItemList);
        req.getSession().setAttribute("createTime", createTime);
        req.getRequestDispatcher("/pages/order/order_detail.jsp").forward(req, resp);
    }

    protected void showMyOrder(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User loginUser = (User) req.getSession().getAttribute("loginUser");
        if (loginUser == null){
            req.getRequestDispatcher("/pages/user/login.jsp").forward(req, resp);
            return;
        }
        List<Order> myOrders = orderService.showMyOrders(loginUser.getId());
        req.getSession().setAttribute("myOrders",myOrders);
        resp.sendRedirect(req.getContextPath() + "/pages/order/order.jsp");
    }

    protected void receiverOrder(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

}
