package com.judy.DesignPattern.prototype;

/**
 * @Author: judy
 * @Description:
 * @Date: Created in 14:12 2019/6/2
 */
public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype p = new Prototype();
        p.name = "judy";
        p.list.add("1");
        Prototype obj = (Prototype) p.clone();
        System.out.println(obj.name);
    }
}
