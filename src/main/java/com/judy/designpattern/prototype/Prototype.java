package com.judy.designpattern.prototype;

/**
 * @Author: judy
 * @Description:
 * @Date: Created in 14:10 2019/6/2
 */
public class Prototype implements Cloneable{
    public String name;


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
