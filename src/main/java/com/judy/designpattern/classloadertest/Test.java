package com.judy.designpattern.classloadertest;

/**
 * @Author: judy
 * @Description:
 * @Date: Created in 8:20 2019/6/8
 */
public class Test{
    public static void main(String[] args) throws ClassNotFoundException {
        SimpleClassLoader simpleClassLoader = new SimpleClassLoader();
        Class<?> aClass = simpleClassLoader.loadClass("JDK.Array.Man1");
        System.out.println(aClass);
    }
}
