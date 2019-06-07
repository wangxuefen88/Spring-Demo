package com.judy.designpattern.deepprototype;

/**
 * @Author: judy
 * @Description:
 * @Date: Created in 14:24 2019/6/5
 */
public class Teacher implements Cloneable {
    String name;
    Integer age;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
