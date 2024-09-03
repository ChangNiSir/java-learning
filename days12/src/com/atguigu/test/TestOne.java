package com.atguigu.test;

public class TestOne {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer.Inner();
        inner.methodOne();
        System.out.println("-------------------");
        Outer.Inner.methodTwo();

    }
}
