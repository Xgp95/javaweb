package dao;

import pojo.Order;

import java.util.List;

/**
 * @author: Xugp
 * @date: 2022/2/22 10:59
 * @description:
 */
public interface OrderDAO {
    public int saveOrder (Order order);
    public List<Order> queryOrders();
    public int changeOrderStatus(String orderId, Integer status);
    public List<Order> queryOrdersByUserId(Integer userId);
}
