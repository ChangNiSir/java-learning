package com.atguigu.test1;


import java.util.ArrayList;
import java.util.Collection;

public class TestOne {
    public static void main(String[] args) {
        // （多态）Collection（接口） -> List（接口） -> ArrayList（实现类）
        // 接口只声明方法
        // JDK没有提供Collection接口的实现类
        Collection col = new ArrayList();

        Collection col1 = new ArrayList();
        col1.add("菠萝");
        col1.add("碧根果");
        col1.add("榴莲");

        System.out.println(col.size());// 当前集合元素数
        col.add("banana");// 添加元素（对象）
        col.add("apple");
        col.add("apple");
        col.add("apple");
        col.add("peach");
        col.add("菠萝");
        col.add("碧根果");

        System.out.println(col.size());
        col.addAll(col1);// 添加集合中的元素
        System.out.println(col.size());
        System.out.println(col);

        col.remove("apple");// 移除第一个匹配元素
        System.out.println("移除apple："+col);

//        col.removeAll(col1);// 移除包含参数集合的所有元素
//        System.out.println("移除col1："+col);

//        col.clear();// 清空集合
//        System.out.println("清空后："+col);
//        System.out.println(col.isEmpty());

        System.out.println(col.contains("apple"));
        System.out.println(col.containsAll(col1));// 原集合是否包含集合所有元素
    }
}
