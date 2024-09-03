package com.atguigu.test;

import java.util.Random;

public class TestThree {
    public static void main(String[] args) {
        int[] nums = new int[16];
        for(int i = 0; i < 10; i++){
            // Math.random()---返回双精度浮点数double（Math类的静态方法）
            int index = (int)(Math.random()*nums.length);
            System.out.println(index);
        }

        System.out.println("------------------------------");
        Random random = new Random();// 创建对象调用普通方法
        for(int i = 0; i < 10; i++){
            int index = random.nextInt(nums.length);
            System.out.println(index);
        }
    }
}
