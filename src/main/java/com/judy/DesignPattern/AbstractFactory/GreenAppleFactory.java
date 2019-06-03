package com.judy.DesignPattern.AbstractFactory;


/**
 * @Author: judy
 * @Description: 专门制造绿色苹果工厂
 * @Date: Created in 9:37 2019/6/3
 */
public class GreenAppleFactory implements AppleFactory {
    public BigAppleStyle bigApple() {
        return new GreenBigApple();
    }

    public SmallAppleStyle smallApple() {
        return new GreenSmallApple();
    }
}
