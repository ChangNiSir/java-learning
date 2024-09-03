package com.atguigu.test;

import java.io.UnsupportedEncodingException;

public class TestOne {
    public static void main(String[] args) {
        // String
        String word = "hello";
        System.out.println(word.length());// 字符数
        // 字节数
        try {
            byte[] datas = word.getBytes("gbk");// 编码 String -> byte[]
            String newWord = new String(datas, "utf-8");// 解码 byte[] -> String
            System.out.println(datas.length);// 字节数（字符数组长度byte)
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        char[] datas1 = word.toCharArray();// String -> char[]
        System.out.println(word.trim());// 去除两端空格
        System.out.println(word.isEmpty());// 判断长度是否为0
        System.out.println(word.indexOf("e", 1));// 下标为1位置开始搜索（第二个位置）第一个参数字符所在位置
        System.out.println(word.lastIndexOf("e", 4));
        System.out.println(word.substring(1, 3));// [..., ...)获取子字符串
        System.out.println(word.equals("hello"));// 考虑大小写的字符串是否相等
        System.out.println(word.equalsIgnoreCase("hello"));// 忽略考虑大小写的字符串是否相等
        System.out.println(word.toLowerCase());// 全转小写
        System.out.println(word.toUpperCase());// 全转大写
        System.out.println(word.compareTo("World"));// 考虑大小写的字符串比大小
        word.compareToIgnoreCase("World");// 忽略大小写的字符串比大小
        System.out.println(word.replaceAll("e", "xyz")); // regex支持通配匹配替换参数
        System.out.println(word.replaceFirst("e", "xyz"));
        String[] datas2 = word.split("-");
        System.out.println(word.matches("[a-z,A-z]{5}"));// 通配匹配
    }
}
