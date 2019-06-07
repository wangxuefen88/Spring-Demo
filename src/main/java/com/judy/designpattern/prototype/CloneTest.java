package com.judy.designpattern.prototype;

/**
 * @Author: judy
 * @Description:
 * @Date: Created in 14:12 2019/6/2
 */
public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {

        Prototype p = new Prototype();
        p.name = "judy";


        Prototype obj = (Prototype) p.clone();
        obj.name = "xu";

        System.out.println(p==obj);
        System.out.println(obj.name);
        System.out.println(p.name);

    }
}
