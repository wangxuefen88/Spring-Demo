package com.judy.DesignPattern.AbstractFactory;

/**
 * @Author: judy
 * @Description:
 * @Date: Created in 10:26 2019/6/3
 */
public class AbstructAppleTest {
 public static void main(String[] args){
     AppleFactory appleFactory = new GreenAppleFactory();
     BigAppleStyle bigAppleStyle = appleFactory.bigApple();
     bigAppleStyle.eatApple();
 }
}
