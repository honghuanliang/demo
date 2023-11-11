package cn.demo.springboot.service;


import cn.demo.springboot.entity.dto.OrderDTO;
import cn.demo.springboot.entity.dto.OrderDetailDTO;
import cn.demo.springboot.entity.pojo.Order;
import cn.demo.springboot.entity.pojo.OrderItem;

import java.util.List;

/**
 * 用户业务接口层
 *
 * @author honghl
 * @version 1.0
 * @date 20231105
 */
public interface OrderService {

    /**
     * 订单查询列表
     *
     * @param orderDTO 查询条件
     * @return 订单
     */
    List<Order> findOrder(OrderDTO orderDTO);

    /**
     * 查询订单详情
     * @param orderId 订单id
     * @return 详情
     */
    OrderDetailDTO findOrderItem(Integer orderId);
}
