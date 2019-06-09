package com.judy.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: judy
 * @Description: 观察者具体实现
 * @Date: Created in 8:33 2019/6/9
 */
public class WeCatServer implements WebCat {

    private Client client;
    private List<Client> clientList = new ArrayList<Client>();

    public WeCatServer(Client client) {
        this.client = client;
    }

    public void registry() {
        clientList.add(this.client);
    }

    public void remove() {
        clientList.remove(this.client);
    }

    public void notifyWebChat() {
        for (Client client1 : clientList) {
             client1.update("judy like xu");
        }
    }
}
