package cn.demo.springboot.entity.dto;

import cn.demo.springboot.entity.pojo.OrderItem;
import lombok.Data;

import java.util.List;

/**
 * 订单查询类
 */
@Data
public class OrderDetailDTO {
    /**
     * 订单号
     */
    private String orderNo;
    /**
     * 商品列表
     */
    private List<OrderItem> orderItemList;
}