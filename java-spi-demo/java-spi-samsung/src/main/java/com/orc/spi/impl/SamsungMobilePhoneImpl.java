package com.orc.spi.impl;

import com.orc.spi.IMobilePhone;

/**
 * 三星手机
 *
 * @author lihui
 * @version 1.0, 2021/6/17 15:19
 */
public class SamsungMobilePhoneImpl implements IMobilePhone {

    @Override
    public void call(String phoneNumber) {
        System.out.println("三星手机打电话，号码：" + phoneNumber);
    }
}
