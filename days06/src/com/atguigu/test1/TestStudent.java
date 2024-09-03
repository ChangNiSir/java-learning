package com.atguigu.test1;


public class TestStudent {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.stuName = "Tom";
        stu.stuAge = 20;
        stu.stuGender = "男";
        stu.sayHello();

        Student stu1 = new Student();
        stu1.stuName = "Jerry";
        stu1.stuAge = 22;
        stu1.stuGender = "男";
        stu1.sayHello();

        System.out.println("--------------------------");
        int one = stu.methodOne();
        System.out.println(one);
    }
}
