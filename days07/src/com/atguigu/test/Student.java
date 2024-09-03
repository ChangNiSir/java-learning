package com.atguigu.test;

public class Student {
    public String stuName;
    public String stuGender;
    public int stuAge;

    public void sayHello(){
        System.out.println("我叫"+stuName+"，今年"
                +stuAge+"岁，我是一名"+stuGender+"学生");
    }
}
