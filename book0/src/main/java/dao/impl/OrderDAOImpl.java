package dao.impl;

import dao.OrderDAO;
import pojo.Order;

import java.util.List;

/**
 * @author: Xugp
 * @date: 2022/2/22 11:07
 * @description:
 */
public class OrderDAOImpl extends BaseDao implements OrderDAO {

    @Override
    public int saveOrder(Order order) {
        String sql = "insert into `t_order` (`order_id`,`create_time`,`price`,`status`,`user_id`) values(?,?,?,?,?)";
        return update(sql, order.getOrderId(), order.getCreateTime(), order.getPrice(), order.getStatus(), order.getUserId());
    }

    @Override
    public List<Order> queryOrders() {
        String sql = "select `order_id` orderId,`create_time` createTime,`price`,`status`,`user_id` userId from `t_order`";
        List<Order> list = queryForList(Order.class, sql);
        return list;
    }

    @Override
    public int changeOrderStatus(String orderId, Integer status) {
        String sql = "update `t_order` set `status` = ? where `order_id` = ?";
        return update(sql, status, orderId);
    }

    @Override
    public List<Order> queryOrdersByUserId(Integer userId) {
        String sql = "select `order_id` orderId,`create_time` createTime,`price`,`status`,`user_id` userId from `t_order` where `user_id` = ?";
        return queryForList(Order.class, sql, userId);
    }
}
