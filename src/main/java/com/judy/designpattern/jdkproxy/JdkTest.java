package com.judy.designpattern.jdkproxy;

/**
 * @Author: judy
 * @Description:
 * @Date: Created in 17:08 2019/6/5
 */
public class JdkTest {

    /**
     * 1 拿到被代理对象的引用, 并且获取到他的所有接口,反射获取
     * 2 JDK Proxy类重新生成一个新的类, 同时新的类要实现被代理类所有实现
     * 3 动态生成java代码, 把新加的业务逻辑方法由一定的逻辑代码去调用(添加新的方法)
     * 4 编译新生成的java代码,.class
     * 5 再重新加载到JVM中运行
     * 6 以上就是字节码重组
     * @param args
     */
    public static void main(String[] args) {

        Person person = (Person) new JdkFangZiJudy().getInstance(new judy());
        person.findWork();
        Person person1 = (Person) new JdkBoyFriendJudy().getInstance(new judy());
        person1.findBodyFriend();
    }

}
