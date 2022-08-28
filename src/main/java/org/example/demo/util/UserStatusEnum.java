package org.example.demo.util;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author zhangLe
 * @Description
 */
@AllArgsConstructor
public enum UserStatusEnum {

    NORMAL(10000,"正常"),
    LOCK(20000,"账号被锁"),
    INVALIDATION(30000,"账号失效");

    private Integer code;
    private String msg;


}
