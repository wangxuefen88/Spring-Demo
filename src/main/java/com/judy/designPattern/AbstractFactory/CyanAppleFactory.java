package com.judy.designpattern.abstractfactory;

/**
 * @Author: judy
 * @Description: 专门制造青苹果的工厂
 * @Date: Created in 9:36 2019/6/3
 */
public class CyanAppleFactory implements AppleFactory {
    public BigAppleStyle bigApple() {
        return new CyanBigApple();
    }

    public SmallAppleStyle smallApple() {
        return new CyanSmallApple();
    }
}
