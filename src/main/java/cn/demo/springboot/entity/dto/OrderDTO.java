package cn.demo.springboot.entity.dto;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * 订单查询类
 */
@Data
public class OrderDTO {
    /**
     * 订单号
     */
    private String orderNo;
    /**
     * 会员名称
     */
    private String buyer;
    /**
     * 订单类型
     */
    private String orderType;
    /**
     * 下单时间
     */
    private String orderTime;
    /**
     * 订单状态
     */
    private String status;
    /**
     * 页数
     */
    private Integer pageNum;
    /**
     * 页大小
     */
    private Integer pageSize;
}