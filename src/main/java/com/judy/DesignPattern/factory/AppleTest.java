package com.judy.DesignPattern.factory;

/**
 * @Author: judy
 * @Description:
 * @Date: Created in 9:39 2019/6/3
 */
public class AppleTest {
    public static void main(String[] args){
        AppleFactory appleFactory1 = new CyanAppleFactory();
        Apple apple = appleFactory1.CreateFactory();
        apple.createApple();


        AppleFactory appleFactory2 = new GreenAppleFactory();
        Apple apple1 = appleFactory2.CreateFactory();
        apple1.createApple();

        AppleFactory appleFactory3 = new RedAppleFactory();
        Apple apple2 = appleFactory3.CreateFactory();
        apple2.createApple();
    }
}
