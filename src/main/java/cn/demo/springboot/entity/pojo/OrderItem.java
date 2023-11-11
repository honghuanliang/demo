package cn.demo.springboot.entity.pojo;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @TableName order_item
 */
@Data
@TableName(value = "t_order_item")
public class OrderItem {
    /**
     * 主键
     */
    @TableId("id")
    private Integer id;

    /**
     * 商品名称
     */
    @TableField("name")
    private String name;

    /**
     * 商品编码
     */
    @TableField("code")
    private String code;

    /**
     * 优惠
     */
    @TableField("preferential")
    private String preferential;

    /**
     * 单价
     */
    @TableField("unitPrice")
    private Double unitPrice;

    /**
     * 数量
     */
    @TableField("quantity")
    private Integer quantity;

    /**
     * 小计
     */
    @TableField("subtotal")
    private Double subtotal;

}