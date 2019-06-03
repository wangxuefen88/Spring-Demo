package com.judy.DesignPattern.factory;

/**
 * @Author: judy
 * @Description: 专门制造青苹果的工厂
 * @Date: Created in 9:36 2019/6/3
 */
public class CyanAppleFactory implements AppleFactory {
    public Apple CreateFactory() {
        return new CyanApple();
    }
}
