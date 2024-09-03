package com.atguigu.test1;


public class TestStudent {
    public static void main(String[] args) {
//        Student student0 = new Student();
//        System.out.println(student0);
        Student.school = "清华";
        Student.methodOne();
        Student student = new Student("花千骨",22,"女");
        System.out.println(student.getInfo());
        System.out.println(student.school);


    }


}
