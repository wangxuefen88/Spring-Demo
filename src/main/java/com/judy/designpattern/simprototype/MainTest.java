package com.judy.designpattern.simprototype;

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

        //浅复制
        Stu StuClone = (Stu)stu.clone();
        StuClone.setName("judy2");
        StuClone.setAge(26);

        //
        Teacher t2 = StuClone.getTeacher();
        t2.setName("mi");
        t2.setAge(56);
        StuClone.setTeacher(t2);

//        StuClone.getTeacher().setAge(56);
//        StuClone.getTeacher().setName("米");

//        System.out.println("复制后的学生"+stu);
        System.out.println("复制后的学生"+StuClone);
        System.out.println("teacher的地址"+stu.getTeacher().hashCode());
        System.out.println("teacher的地址"+StuClone.getTeacher().hashCode());
        System.out.println("-------------------------------------------------------");
        System.out.println("teacher的地址"+stu.getTeacher().toString());
        System.out.println("teacher的地址"+StuClone.getTeacher().toString());
    }

}
