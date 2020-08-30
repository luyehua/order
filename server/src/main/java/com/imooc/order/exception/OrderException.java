package com.imooc.order.exception;

import com.imooc.order.enums.ResultEnum;
import lombok.Getter;

/**
 * @author: lu
 * @date: 2020-08-27 10:57
 **/
@Getter
public class OrderException extends RuntimeException{

    private Integer code;

    public OrderException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    public OrderException(Integer code,String message) {
        super(message);
        this.code = code;
    }
}
