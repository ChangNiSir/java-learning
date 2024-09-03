package com.atguigu.test4;

public class TestOne { // 来一个测试类
    public static void main(String[] args) {
        // Math类的常用方法
        System.out.println(Math.abs(5));
        System.out.println(Math.abs(-5));
        System.out.println(Math.acos(0)*2);
        System.out.println(Math.ceil(Math.PI));// 向上取整（天花板）
        System.out.println(Math.floor(Math.PI));// 向下取整（地板）
        System.out.println(Math.pow(2, 3));

        System.out.println("-----------------------------");
        // Math.random()---[0, 1)的随机浮点数
        int[] one = new int[16];
        for(int i = 0; i < 10; i++){
            int d = (int)(Math.random()*one.length); // 随机数组下标：随机访问数组
            System.out.println(d);
        }

    }
}
