package com.judy.designpattern.observer;

/**
 * @Author: judy
 * @Description: 被观察者接口,就是主动去观察别人
 * @Date: Created in 8:34 2019/6/9
 */
public interface WebCat {

    public void registry();

    public void remove();

    public void notifyWebChat();
}
