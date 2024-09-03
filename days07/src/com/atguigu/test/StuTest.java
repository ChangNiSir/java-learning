package com.atguigu.test;

public class StuTest { //测试类
    //对象写在main方法里
    public static void main(String[] args) {
        Student stu = new Student();
        stu.stuName = "Tom";
        stu.stuAge = 20;
        stu.stuGender = "男";
        stu.sayHello();
    }

}
