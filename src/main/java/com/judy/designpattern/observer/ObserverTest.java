package com.judy.designpattern.observer;

/**
 * @Author: judy
 * @Description:
 * @Date: Created in 8:44 2019/6/9
 */
public class ObserverTest {
    public static void main(String[] args){
        Client client = new ClientA();
        WebCat webCat = new WeCatServer(client);
        webCat.registry();
        webCat.notifyWebChat();
    }

}
