package com.judy.DesignPattern.old;

/**
 * @Author: judy
 * @Description: 原始类
 * @Date: Created in 20:25 2019/5/28
 */
abstract class Pizza {

    public void prepare() {
        System.out.println("prepare");
    }
    public void bake() {
        System.out.println("bake");
    }
    public void cut() {
        System.out.println("cut");
    }
    public void box() {
        System.out.println("box");
    }

}
