package com.atguigu.test1;

public class Person {
    public String name = "Jerry";

    public void methodOne(){
        System.out.println("4");
        System.out.println("5");
        methodTwo();
        System.out.println("6");
    }
    public void methodTwo(){
        System.out.println("in methodTwo()");
    }
}
