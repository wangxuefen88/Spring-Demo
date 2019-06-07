package com.judy.designpattern.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: judy
 * @Description:
 * @Date: Created in 17:07 2019/6/5
 */
public class JdkFangZiJudy implements InvocationHandler {
    private Person target;

    // 2
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("invoke1");
        Object invoke = method.invoke(this.target, args);
        return null;
    }

    // 1
    public Object getInstance(Person target) {
        this.target = target;
        Object o = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
        return o;
    }
}
