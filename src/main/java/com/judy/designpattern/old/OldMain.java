package com.judy.designpattern.old;

/**
 * @Author: judy
 * @Description: 原始不加任何模式
 * @Date: Created in 20:29 2019/5/28
 */
public class OldMain {
    public static void main(String[] args){
        OrderPizza orderPizza = new OrderPizza();
        Pizza cheesepizza = orderPizza.create("cheese");
        cheesepizza.bake();
    }
}
