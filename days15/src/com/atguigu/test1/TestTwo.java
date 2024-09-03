package com.atguigu.test1;

public class TestTwo {
    public static void main(String[] args) {

        // 数组原长度两倍扩容
        int[] one = {65, 39, 28, 71, 69};

        // 两倍扩容
        int[] two = new int[one.length*2];
        for (int i = 0; i < one.length; i++) {
            two[i] = one[i];
        }

        // 增强for循环
        // 数组（集合）元素类型变量 : 数组（集合）
        for (int value : two) {
            System.out.println(value);
        }
    }
}
