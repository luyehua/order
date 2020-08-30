package com.imooc.order.utils;

import java.util.Random;

/**
 * @author: lu
 * @date: 2020-08-27 10:39
 **/
public class KeyUtil {

    public static synchronized String getUniqueKey() {
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;
        return System.currentTimeMillis() + String.valueOf(number);
    }
}
