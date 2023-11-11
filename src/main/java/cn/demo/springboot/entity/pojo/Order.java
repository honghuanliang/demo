package cn.demo.springboot.entity.pojo;


import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @TableName order
 */
@TableName(value = "t_order")
@Data
public class Order {
    /**
     * 主键id
     */
    @TableId("id")
    private Integer id;

    /**
     * 订单号
     */
    @TableField("orderNo")
    private String orderNo;

    /**
     * 订单来源 1.小程序；2.移动端；3.PC端
     */
    @TableField("source")
    private Integer source;

    /**
     * 订单类型 1.普通订单
     */
    @TableField("orderType")
    private Integer orderType;

    /**
     * 买家
     */
    @TableField("buyer")
    private String buyer;

    /**
     * 总金额
     */
    @TableField("amount")
    private Double amount;

    /**
     * 状态 1.未付款；2.已付款；3.待发货；4.已发货；5.待核验；6.待自提；7.已完成；8.已取消
     */
    @TableField("status")
    private Integer status;

    /**
     * 下单时间
     */
    @TableField("orderTime")
    private Date orderTime;

    /**
     * 更新时间
     */
    @TableField("updateTime")
    private Date updateTime;

    /**
     * 应付金额
     */
    @TableField("payableAmount")
    private Double payableAmount;

    /**
     * 运费
     */
    @TableField("freight")
    private Double freight;

    /**
     * 配送方式 1.京东；2.顺丰；3.韵达
     */
    @TableField("deliveryMethod")
    private Integer deliveryMethod;

    /**
     * 备注（买家留言）
     */
    @TableField("remark")
    private String remark;

    /**
     * 支付方式 1.支付宝；2.微信；3.银联
     */
    @TableField("paymentMethod")
    private Integer paymentMethod;

    /**
     * 收货地址
     */
    @TableField("address")
    private String address;

}