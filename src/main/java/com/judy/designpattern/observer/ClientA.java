package com.judy.designpattern.observer;

/**
 * @Author: judy
 * @Description:
 * @Date: Created in 8:33 2019/6/9
 */
public class ClientA implements Client {
    public void update(String msg) {
        System.out.println("ClientA 收到消息"+msg);
    }
}
