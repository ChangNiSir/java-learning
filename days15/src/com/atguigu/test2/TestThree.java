package com.atguigu.test2;

public class TestThree {
    public static void main(String[] args) {
        String s1 = "hello world";
        int index1 = s1.indexOf('o'); //('e'); // 第一次出现的位置
        System.out.println(index1);
        int index2 = s1.indexOf('o', s1.indexOf('o')+1); // 第二次出现的位置
        System.out.println(index2);
        int index3 = s1.indexOf("lo");
        System.out.println(index3);
        int index4 = s1.indexOf("lo", 5);
        System.out.println(index4);// 找不到返回-1
        int index5 = s1.lastIndexOf('o', s1.lastIndexOf('o')-1);// 最后一次出现的位置（从后往前找）
        System.out.println(index5);
        String s2 = s1.substring(6);// 截取子字符串到末尾
        System.out.println(s2);
        String s3 = s1.substring(0, 5);// 指定范围截取子字符串（不包括endIndex)
        System.out.println(s3);


    }
}
