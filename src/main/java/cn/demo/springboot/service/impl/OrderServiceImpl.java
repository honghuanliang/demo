package cn.demo.springboot.service.impl;

import cn.demo.springboot.entity.dto.OrderDTO;
import cn.demo.springboot.entity.dto.OrderDetailDTO;
import cn.demo.springboot.entity.pojo.Order;
import cn.demo.springboot.entity.pojo.OrderItem;
import cn.demo.springboot.mapper.OrderMapper;
import cn.demo.springboot.mapper.UserMapper;
import cn.demo.springboot.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * 订单实现层
 *
 * @author honghl
 * @version 1.0
 * @date 20231105
 */
@Service
@Transactional
public class OrderServiceImpl implements OrderService {
    /**
     * 注入数据访问接口代理对象
     */
    @Autowired
    private OrderMapper orderMapper;

    @Override
    public List<Order> findOrder(OrderDTO orderDTO) {
        return orderMapper.findOrder(orderDTO);
    }

    @Override
    public OrderDetailDTO findOrderItem(Integer orderId) {
        OrderDetailDTO detailDTO = new OrderDetailDTO();
        Order order = orderMapper.findByOrderId(orderId);
        detailDTO.setOrderNo(order.getOrderNo());
        List<OrderItem> orderItems = orderMapper.findOrderItem(orderId);
        detailDTO.setOrderItemList(orderItems);
        return detailDTO;
    }
}
