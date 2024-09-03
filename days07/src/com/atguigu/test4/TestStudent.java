package com.atguigu.test4;

public class TestStudent {
    public static void main(String[] args) {
        Student stu = new Student(); //stu为NULL时空指针异常
        stu.name = "Tom";
        stu.stuAge = 20;
        stu.stuGender = "男";
        stu.sayHello();

        System.out.println("-------------------------");
        Student[] students = new Student[3]; // 默认值为NULL，不开辟空间出现空指针异常
        students[0] = new Student();
        students[0].name = "小强";
        students[0].stuAge = 21;
        students[0].stuGender = "女";
        students[0].sayHello();
        students[1] = new Student();
        students[2] = new Student();

        System.out.println("---------------------");
        for(int i = 0; i < students.length; i++){
            System.out.println(students[i]);
            students[i].sayHello();;
        }
    }
}
