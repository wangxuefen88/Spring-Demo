package com.judy.DesignPattern.simplefactory;

/**
 * @Author: judy
 * @Description:
 * @Date: Created in 15:43 2019/5/25
 */
public class AppleFactory {

    public AppleInterface createInstance(String name) {
        if (name.equals("apple1")) {
            return new Apple1();
        }else if (name.equals("apple2")) {
            return new Apple2();
        }else if (name.equals("apple3")) {
            return new Apple3();
        }
        return null;
    }
}
