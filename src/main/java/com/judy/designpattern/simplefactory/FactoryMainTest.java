package com.judy.designpattern.simplefactory;

/**
 * @Author: judy
 * @Description:  简单工厂模式 . 需求:1 我并不知道我要实例化的对象是谁? 只知道更具某种条件来让我得到某个对象
 * @Date: Created in 15:30 2019/5/25
 */
public class FactoryMainTest {
    public static void main(String[] args){
        AppleFactory appleImplement = new AppleFactory();
        AppleInterface apple1 = appleImplement.createInstance("apple1");
        apple1.AppleMethod();
    }
}
