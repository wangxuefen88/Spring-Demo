package com.judy.designpattern.classloadertest;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author: judy
 * @Description:
 * @Date: Created in 8:07 2019/6/8
 */
public class SimpleClassLoader extends ClassLoader {

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        InputStream resourceAsStream = Test.class.getResourceAsStream("Test.class");
        try {
            byte[] bytes = new byte[resourceAsStream.available()];
            resourceAsStream.read(bytes);
            return super.findClass(name);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
