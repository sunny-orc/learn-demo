package com.orc.spi;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * TODO 添加类的描述
 *
 * @author lihui
 * @version 1.0, 2021/6/17 16:01
 */
public class Main {

    public static void main(String[] args) {
        ServiceLoader<IMobilePhone> mobilePhones = ServiceLoader.load(IMobilePhone.class);
        Iterator<IMobilePhone> mobilePhoneIterator = mobilePhones.iterator();
        while (mobilePhoneIterator.hasNext()) {
            IMobilePhone mobilePhone = mobilePhoneIterator.next();
            mobilePhone.call("110");
        }

        ServiceLoader<IComputer> computers = ServiceLoader.load(IComputer.class);
        Iterator<IComputer> computerIterator = computers.iterator();
        while (computerIterator.hasNext()) {
            IComputer computer = computerIterator.next();
            computer.playGame();
        }
    }

}
