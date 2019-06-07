package com.judy.designpattern.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: judy
 * @Description:
 * @Date: Created in 17:43 2019/6/5
 */
public class JdkBoyFriendJudy implements InvocationHandler  {
    private Person target;
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("invoke2");
        method.invoke(this.target, args);
        return null;
    }

    public Object getInstance(Person target){
        this.target = target;
        Person person = (Person) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
        return person;
    }
}
