package com.imooc.order.utils;

import com.imooc.order.enums.CodeEnum;

/**
 * @author: lu
 * @date: 2020-08-11 18:43
 **/
public class EnumUtil {

    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass) {
        for (T each : enumClass.getEnumConstants()) {
            if (code.equals((each.getCode()))) {
                return each;
            }
        }
        return null;
    }
}
