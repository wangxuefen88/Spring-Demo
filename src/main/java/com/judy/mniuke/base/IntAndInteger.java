package com.judy.mniuke.base;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: judy
 * @Description: int和integer的区别
 * @Date: Created in 7:21 2019/5/30
 */
public class IntAndInteger {

    public static void main(String[] args){
        int a = 3;
        Integer a1 = new Integer(3);
        Integer a2 = 3;
        int b = 5;
        System.out.println(a==a2);  //true. a2 自动拆箱所以相同
        System.out.println(a1==a2);   //false 两个不同引用对象所以得到结果不一样
    }
}
