package com.judy.designpattern.staticproxy;

/**
 * @Author: judy
 * @Description:
 * @Date: Created in 16:40 2019/6/5
 */
public class ProxyMain {
    public static void main(String[] args){
        Son son = new Son();
        //没有办法动态的扩展
        Father father = new Father(son);
        father.findLove();
    }
}
