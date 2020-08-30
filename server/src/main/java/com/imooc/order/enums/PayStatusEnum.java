package com.imooc.order.enums;

import lombok.Getter;

/**
 * @program: sell
 * @description: 订单状态枚举
 * @author: lu
 * @date: 2020-08-02 16:11
 **/
@Getter
public enum PayStatusEnum implements CodeEnum{

    WAIT(0,"等待支付"),
    SUCCESS(1, "支付成功"),
    ;

    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String msg) {
        this.code = code;
        this.message = msg;
    }

}
