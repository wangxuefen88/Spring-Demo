package com.judy.designpattern.singleton.lazy;

/**
 * @Author: judy
 * @Description:
 * @Date: Created in 11:00 2019/6/1
 */
public class LazyTwo {
    public LazyTwo() {

    }

    private static LazyTwo lazyOne = null;
    public static synchronized LazyTwo getInstance(){
        if (lazyOne == null) {
            lazyOne = new LazyTwo();
        }
        System.out.println(System.currentTimeMillis()+":"+lazyOne);
        return lazyOne;
    }
}
