package com.judy.DesignPattern.prototype;

import java.util.ArrayList;

/**
 * @Author: judy
 * @Description:
 * @Date: Created in 14:10 2019/6/2
 */
public class Prototype implements Cloneable{
    public String name;
    public ArrayList list = new ArrayList();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
