package com.atguigu.test2;

public class TestTeacher {
    public static void main(String[] args) {

        //接口声明 = 接口的实现类对象
        Teacher teacher = new Teacher();
        Person person = new Teacher();
        Comparable comparable = new Teacher(); //接口声明 = 接口的实现类对象
    }

}
