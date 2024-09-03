package com.atguigu.test2;

// Teacher(实现类)实现了接口类-----单继承多实现
// 实现所有抽象方法
public class Teacher extends Object implements Person,Comparable {

    // 实现1
    @Override
    public void sayHello() {
        System.out.println("Hello,I am a teacher");
    }

    // 实现2  可实现可不实现
    @Override
    public void methodOne() {
        System.out.println("in Teacher methodOne()");
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
