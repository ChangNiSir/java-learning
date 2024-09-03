package com.atguigu.test2;

public class TestOne {
    public static void main(String[] args) {
        // JDL 1.6版本串池--->JDK 1.8 元空间（堆回收空间速度快于串池（组成元空间））
        // "string"赋值时
        // 检索字符串常量池（字符串只存在这里），看是否存在该字符串
        // 没有则创建String对象
        // 有则将原有串池对象赋值给引用
        // 字符串作线程锁唯一（串池（方法区里创建对象）中同一个String串只会存在一个对象）
        String s1 = "hello";
        String s2 = "hello";
        // String s2 = new String("hello");// 创建新的String对象（堆里创建对象（具有value属性指向串池中的字符串））
        System.out.println(s1 == s2);// 比较字符串内存地址
        System.out.println(s1.equals(s2));// 比较字符串
    }
}
