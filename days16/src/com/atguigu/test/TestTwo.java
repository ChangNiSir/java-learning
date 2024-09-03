package com.atguigu.test;

public class TestTwo {
    public static void main(String[] args) {
        // 拼接字符串效率高
        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append("\n").append("One World One Dream");
        System.out.println(stringBuilder.toString());// toString()
    }
}
