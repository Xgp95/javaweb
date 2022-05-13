package dao;

import pojo.OrderItem;

import java.util.List;

/**
 * @author: Xugp
 * @date: 2022/2/22 11:03
 * @description:
 */
public interface OrderItemDAO {
    public int saveOrderItem(OrderItem orderItem);
    public List<OrderItem> queryOrderItemsByOrderId(String orderId);
}
