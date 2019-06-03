package com.judy.DesignPattern.factory;

/**
 * @Author: judy
 * @Description: 专门制造红色苹果的工厂
 * @Date: Created in 9:37 2019/6/3
 */
public class RedAppleFactory  implements AppleFactory {

    public Apple CreateFactory() {
        return new RedApple();
    }
}
