package com.atguigu.test2;

import java.io.UnsupportedEncodingException;

public class TestTwo {// main方法中运行代码
    public static void main(String[] args) {
        String s1 = "heLlo";
        String s2 = "Hello";
        System.out.println(s1.equals(s2));// 考虑大小写比较字符串大小
        System.out.println(s1.equalsIgnoreCase(s2));// 忽略大小写比较字符串大小
        System.out.println(s1.concat(s2));// 拼接两个字符串
        System.out.println(s1.toLowerCase().equals(s2.toLowerCase()));// 全转小写
        System.out.println(s1.toUpperCase().equals(s2.toUpperCase()));// 全转大写
        char c = s1.charAt(4);
        System.out.println(c);
        System.out.println("aaa".compareTo("bbb"));// 比较字符串大小
        System.out.println("hello world".endsWith("ld"));// 字符串是否以参数字符串结尾
        System.out.println("hello world".startsWith("he"));// 字符串是否以参数字符串开头
        System.out.println("  hello world".length());// 返回包含两端及中间空格字符数
        byte[] data1 = "  hello world".getBytes();// String -> byte[]
        System.out.println(data1.length);
        try {
            byte[] data2 = "  hello world".getBytes("utf-8");// 指定参数编码格式String -> byte[]
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        char[] data3 = "  hello world".toCharArray();// String -> char[]

        System.out.println(" hello world ".trim().length());// 去掉两端的空格
    }
}
