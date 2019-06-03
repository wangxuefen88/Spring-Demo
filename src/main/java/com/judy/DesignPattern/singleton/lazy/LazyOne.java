package com.judy.DesignPattern.singleton.lazy;

/**
 * @Author: judy
 * @Description:
 * @Date: Created in 11:00 2019/6/1
 */
public class LazyOne {
    public LazyOne() {

    }

    private static LazyOne lazyOne = null;
    public static LazyOne getInstance(){
        if (lazyOne == null) {
            lazyOne = new LazyOne();
        }
        System.out.println(System.currentTimeMillis()+":"+lazyOne);
        return lazyOne;
    }
}
