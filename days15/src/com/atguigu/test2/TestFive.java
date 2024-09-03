package com.atguigu.test2;

public class TestFive {
    public static void main(String[] args) {
        // 正则表达式匹配---通配匹配（非精确匹配）
        String s1 = "Hello";
        String s2 = "[W,H,K][a-z,A-Z]{4}";// 正则表达式---匹配规则
        boolean flag = s1.matches(s2);// 参数regex---通配匹配
        System.out.println(flag);
    }
}
