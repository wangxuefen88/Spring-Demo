package com.judy.DesignPattern.singleton.hungry;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

/**
 * @Author: judy
 * @Description: 模拟多个线程测试饿汉式线程安全问题
 * @Date: Created in 10:46 2019/6/1
 */
public class ThreadSafeSingletonTest {
    public static void main(String[] args) throws InterruptedException {
        int count = 100;
        final CountDownLatch countDownLatch = new CountDownLatch(count);
        final Set<Hungry> synSet = Collections.synchronizedSet(new HashSet<Hungry>());
        for (int i = 0; i < count ; i++) {
            new Thread(){
                @Override
                public void run() {
                    try {
                        countDownLatch.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synSet.add(Hungry.getInstance());
                }
            }.start();
        }

    }
}
