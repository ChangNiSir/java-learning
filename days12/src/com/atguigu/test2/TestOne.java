package com.atguigu.test2;

import java.util.Scanner;

// 异常(Exception)的抛出机制
public class TestOne {
    // 运行在虚拟机里
    public static void main(String[] args) {

        // 运行时报错---非受检异常
        Scanner input = new Scanner(System.in);
        System.out.println("请输入被除数");
        int one = input.nextInt();
        System.out.println("请输入除数");
        int two = input.nextInt();
        int result = one / two;
        System.out.println("result="+result);
        System.out.println("程序结束");
    }
}
