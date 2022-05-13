package service.impl;

import dao.BookDAO;
import dao.OrderDAO;
import dao.OrderItemDAO;
import dao.impl.BookDAOImpl;
import dao.impl.OrderDAOImpl;
import dao.impl.OrderItemDAOImpl;
import pojo.*;
import service.OrderService;

import java.util.Date;
import java.util.List;

/**
 * @author: Xugp
 * @date: 2022/2/22 14:17
 * @description:
 */
public class OrderServiceImpl implements OrderService {
    OrderDAO orderDAO = new OrderDAOImpl();
    OrderItemDAO orderItemDAO = new OrderItemDAOImpl();
    BookDAO bookDAO = new BookDAOImpl();

    @Override
    public String createOrder(Cart cart, Integer userId) {
        String orderId = System.currentTimeMillis() + "" + userId;
        Order order = new Order(orderId, new Date(), cart.getTotalPrice(), 0, userId);
        orderDAO.saveOrder(order);
//        double d = 12 / 0;
        for (CartItem cartItem : cart.getItems().values()) {
            Integer id = cartItem.getId();
            Integer count = cartItem.getCount();
            OrderItem orderItem = new OrderItem(id, cartItem.getName(), count, cartItem.getPrice(), cartItem.getPriceTotal(), orderId);
            int i = orderItemDAO.saveOrderItem(orderItem);
            Book book = bookDAO.queryBookById(id);
            book.setSales(book.getSales() + count);
            book.setStock(book.getStock() - count);
            bookDAO.updateBook(book);
        }
        cart.clear();
        return orderId;
    }

    @Override
    public List<Order> showAllOrder() {
        List<Order> orders = orderDAO.queryOrders();
        return orders;
    }

    @Override
    public int sendOrder(String orderId) {
        return orderDAO.changeOrderStatus(orderId, 1);
    }

    @Override
    public List<OrderItem> showOrderDetail(String orderId) {
        return orderItemDAO.queryOrderItemsByOrderId(orderId);
    }

    @Override
    public List<Order> showMyOrders(Integer userId) {
        List<Order> orders = orderDAO.queryOrdersByUserId(userId);
        return orders;
    }

    @Override
    public int receiverOrder(String orderId) {
        int i = orderDAO.changeOrderStatus(orderId, 2);
        return i;
    }
}
