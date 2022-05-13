package dao.impl;

import dao.OrderItemDAO;
import org.junit.Test;
import pojo.OrderItem;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author: Xugp
 * @date: 2022/2/25 15:44
 * @description:
 */
public class OrderItemDAOImplTest {
    OrderItemDAO orderItemDAO = new OrderItemDAOImpl();

    @Test
    public void queryOrderItemsByOrderId() {
        List<OrderItem> orderItemList = orderItemDAO.queryOrderItemsByOrderId("16457704769311");
        for (OrderItem orderItem : orderItemList) {
            System.out.println(orderItem);
        }
    }
}