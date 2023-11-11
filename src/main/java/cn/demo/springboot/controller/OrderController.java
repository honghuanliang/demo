package cn.demo.springboot.controller;

import cn.demo.springboot.entity.dto.OrderDTO;
import cn.demo.springboot.entity.dto.OrderDetailDTO;
import cn.demo.springboot.entity.pojo.Order;
import cn.demo.springboot.entity.pojo.OrderItem;
import cn.demo.springboot.service.OrderService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * orderController
 *
 * @author honghl
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     * 订单查询列表
     *
     * @param orderDTO 查询条件
     * @return 订单
     */
    @PostMapping("/query_order")
    public List<Order> findOrder(@Valid @RequestBody OrderDTO orderDTO) {
        return orderService.findOrder(orderDTO);
    }

    /**
     * 查询订单详情
     * @param orderId 订单id
     * @return 详情
     */
    @GetMapping("/query_order_item")
    public OrderDetailDTO findOrderItem(@RequestParam Integer orderId) {
        return orderService.findOrderItem(orderId);
    }
}
