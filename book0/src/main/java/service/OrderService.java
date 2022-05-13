package service;

import pojo.Cart;
import pojo.Order;
import pojo.OrderItem;

import java.util.List;

/**
 * @author: Xugp
 * @date: 2022/2/22 14:03
 * @description:
 */
public interface OrderService {
    /**
     *
     * @param cart
     * @param userId
     * @return 返回orderId
     */
    public String createOrder(Cart cart, Integer userId);
    public List<Order> showAllOrder();
    public int sendOrder(String orderId);
    public List<OrderItem> showOrderDetail(String orderId);
    public List<Order> showMyOrders(Integer userId);
    public int receiverOrder(String orderId);
}
