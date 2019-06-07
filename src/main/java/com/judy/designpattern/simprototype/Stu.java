package com.judy.designpattern.simprototype;

/**
 * @Author: judy
 * @Description:
 * @Date: Created in 14:23 2019/6/5
 */
public class Stu implements Cloneable {
    String name;
    Integer age;
    Teacher teacher;


    public Stu() {
        System.out.println("是否调用Stu 构造方法");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Stu{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", teacher=" + teacher +
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

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
