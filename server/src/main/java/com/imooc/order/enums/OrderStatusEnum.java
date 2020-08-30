package com.imooc.order.enums;

import lombok.Getter;

/**
 * @program: sell
 * @description: 订单状态枚举
 * @author: lu
 * @date: 2020-08-02 16:11
 **/
@Getter
public enum OrderStatusEnum implements CodeEnum {

    NEW(0,"新订单"),
    FINISHED(1, "完结"),
    CANCLE(2, "已取消"),
    ;

    private Integer code;

    private String message;

    OrderStatusEnum(Integer code, String msg) {
        this.code = code;
        this.message = msg;
    }

}
