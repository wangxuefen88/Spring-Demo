package com.judy.designpattern.singleton.lazy;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

/**
 * @Author: judy
 * @Description: 模拟多个线程测试懒汉式线程不安全问题
 * @Date: Created in 10:46 2019/6/1
 */
public class ThreadNotSafeSingletonTest {
    public static void main(String[] args) throws InterruptedException {
        int count = 10000;
        final CountDownLatch countDownLatch = new CountDownLatch(count);
        final Set<LazyOne> synSet = Collections.synchronizedSet(new HashSet<LazyOne>());
        for (int i = 0; i < count ; i++) {
            new Thread(){
                @Override
                public void run() {
                    try {
                        countDownLatch.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synSet.add(LazyOne.getInstance());


                }
            }.start();
        }

    }
}
