package com.imooc.order.enums;

import lombok.Getter;

/**
 * @program: sell
 * @description: 商品状态
 * @author: lu
 * @date: 2020-08-02 11:02
 **/
@Getter
public enum ProductStatusEnum implements CodeEnum{

    UP(0,"在架"),
    DOWN(1,"下架")
    ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
