package com.judy.designpattern.abstractfactory;


/**
 * @Author: judy
 * @Description: 专门制造红色苹果的工厂
 * @Date: Created in 9:37 2019/6/3
 */
public class RedAppleFactory implements AppleFactory {
    public BigAppleStyle bigApple() {
        return new RedBigApple();
    }

    public SmallAppleStyle smallApple() {
        return new RedSmallApple();
    }
}
