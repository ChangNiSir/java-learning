package com.atguigu.test1;

public class TestOne {
    public static void main(String[] args) { // 应用程序的入口

        // ---------------包装类-----------------
        // 基础类型转换为对象类型--->实现多态
        // 装包
        System.out.println("------------------------");
        int one = 100;
        Integer integer = new Integer("100");
        Integer integer1 = Integer.valueOf(one);
        System.out.println(integer1);

        System.out.println("------------------------");
        // 拆包
        int two = integer.intValue();
        System.out.println(two);

        System.out.println("------------------------");
        // 自动拆装
        int three = new Integer(300);
        Integer integer2 = 400;


        // 43:37




    }


}
