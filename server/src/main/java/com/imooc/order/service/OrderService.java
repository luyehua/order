package com.imooc.order.service;

import com.imooc.order.dto.OrderDTO;

/**
 * @author: lu
 * @date: 2020-08-27 10:27
 **/
public interface OrderService {

    /**
     * 创建订单
     * @param orderDTO
     * @return
     */
    OrderDTO create(OrderDTO orderDTO);

}
