package com.judy.DesignPattern.singleton.hungry;

/**
 * @Author: judy
 * @Description: 饿汉模式,先进行实例化指定为final类型,然后再返回 , 保证了并发情况下线程安全
 * @Date: Created in 10:43 2019/6/1
 */
public class Hungry {
    public Hungry() {

    }

    private static final Hungry hungry = new Hungry();
    public static Hungry getInstance(){
        System.out.println(System.currentTimeMillis()+":"+hungry);
        return hungry;
    }
}
