package cn.demo.springboot.mapper;

import cn.demo.springboot.entity.dto.OrderDTO;
import cn.demo.springboot.entity.pojo.Order;
import cn.demo.springboot.entity.pojo.OrderItem;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 用户数据层
 *
 * @author LEE.SIU.WAH
 * @version 1.0
 * @email lixiaohua7@163.com
 * @date 2018年1月31日 下午7:09:47
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {

    /**
     * 查询订单列表
     *
     * @param orderDTO 查询条件
     * @return 订单
     */
    List<Order> findOrder(@Param("order") OrderDTO orderDTO);

    /**
     * 根据订单id查询订单商品
     *
     * @param orderId 订单id
     * @return 商品
     */
    List<OrderItem> findOrderItem(@Param("orderId") Integer orderId);

    /**
     * 根据订单id查询订单信息
     *
     * @param orderId 订单id
     * @return 订单
     */
    Order findByOrderId(@Param("orderId") Integer orderId);
}
