package com.atguigu.test2;

public class TestFour {
    public static void main(String[] args) {
        // replace()---第二个参数替换第一个参数
        String s1 = "hellor world";
        String s2 = s1.replace('o', 'x');
        System.out.println(s2);
        String s3 = s1.replaceAll("or", "xyz");
        System.out.println(s3);
        String s4 = s1.replaceFirst("or", "xyz");
        System.out.println(s4);

        // split()
        // regex --- 支持正则表达式
        // 支持正则表达式特殊含义 | ---> \\| 才是真实 |
        String s5 = "One world One Dream";
        String[] ss = s5.split(" ");// 分隔符分割数组
        System.out.println(ss.length);
        for (String s : ss) {
            System.out.println(s);
        }

    }
}
