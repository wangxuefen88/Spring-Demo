package com.judy.designpattern.cglib;

/**
 * @Author: judy
 * @Description:
 * @Date: Created in 21:17 2019/6/6
 */
public class CglibTest {
    public static void main(String[] args){
        CglibJudy cglibJudy = new CglibJudy();
        Judy instance = (Judy)cglibJudy.getInstance(Judy.class);
        instance.judyMethod();
    }
}
