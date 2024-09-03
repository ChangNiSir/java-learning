package com.atguigu.test2;

public class TestStudent {
    // Student 直接写不报错
    // main方法
    public static void main(String[] args) {
        Student stu = new Student("花千骨",22,"女");
        Student stu1 = new Student("白子画",1000,"男");
        Student stu2 = new Student("笙箫默",1000,"男");
        Student stu3 = new Student("笙箫默",1000,"男");
         System.out.println(stu2.equals(stu3));




    }
}
