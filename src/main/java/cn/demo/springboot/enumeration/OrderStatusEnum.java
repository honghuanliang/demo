package cn.demo.springboot.enumeration;

import lombok.Getter;

@Getter
public enum OrderStatusEnum {

    UNPAID(1, "未付款"),
    PAID(2, "已付款"),
    TO_BE_SHIPPED(3, "待发货"),
    SHIPPED(4, "已发货"),
    TO_BE_VERIFIED(5, "待核验"),
    PICKED(6, "待自提"),
    COMPLETE(7, "已完成"),
    CANCLE(8, "已取消"),
    ;
    private int code;
    private String desc;

    OrderStatusEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
