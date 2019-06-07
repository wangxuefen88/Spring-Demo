package com.judy.designpattern.deepprototype;

/**
 * @Author: judy
 * @Description:
 * @Date: Created in 14:27 2019/6/5
 */
public class MainTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Teacher t1 = new Teacher();
        t1.setAge(22);
        t1.setName("judy");

        Stu stu = new Stu();
        stu.setAge(25);
        stu.setName("xu");
        stu.setTeacher(t1);

        System.out.println("复制前的学生1" + stu);

        Stu StuClone = (Stu)stu.clone();
        StuClone.setName("judy2");
        StuClone.setAge(26);

        Teacher t2 =(Teacher) StuClone.getTeacher().clone();

        t2.setName("mi");
        t2.setAge(56);
        StuClone.setTeacher(t2);


        System.out.println("复制后的学生"+stu);
        System.out.println("复制后的学生"+StuClone);
        System.out.println("teacher的地址"+stu.getTeacher().hashCode());
        System.out.println("teacher的地址"+StuClone.getTeacher().hashCode());
    }

}
