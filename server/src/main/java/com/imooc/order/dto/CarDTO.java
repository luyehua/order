package com.imooc.order.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: lu
 * @date: 2020-08-27 16:34
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarDTO {

    /**
     * id
     */
    private String productId;

    /**
     * 数量
     */
    private Integer productQuantity;
}
