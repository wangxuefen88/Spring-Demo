package com.judy.designpattern.observer;

/**
 * @Author: judy
 * @Description:
 * @Date: Created in 8:34 2019/6/9
 */
public class ClientC implements Client {
    public void update(String msg) {
        System.out.println("ClientC 收到消息"+msg);
    }
}
