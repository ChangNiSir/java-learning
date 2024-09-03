package com.atguigu.test1;

import java.util.Arrays;

public class TestOne {
    public static void main(String[] args) {

        // 数组的扩容
        int[] one = {23, 45, 12, 47, 56};
        int[] two = Arrays.copyOf(one, 8);
        for (int value : two) {
            System.out.println(value);
        }

        String[] three = {"apple", "banana", "peach"};
        String[] four = Arrays.copyOf(three, 6);
        for (String s : four) {
            System.out.println(s);
        }


    }
}
