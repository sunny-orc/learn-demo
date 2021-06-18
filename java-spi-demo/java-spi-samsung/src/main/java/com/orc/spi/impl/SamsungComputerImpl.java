package com.orc.spi.impl;

import com.orc.spi.IComputer;

/**
 * TODO 添加类的描述
 *
 * @author lihui
 * @version 1.0, 2021/6/17 16:10
 */
public class SamsungComputerImpl implements IComputer {

    @Override
    public void playGame() {
        System.out.println("三星电脑，玩游戏");
    }
}
