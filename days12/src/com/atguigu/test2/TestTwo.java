package com.atguigu.test2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestTwo {
    public static void main(String[] args) {

        // 异常处理
        // try catch finally体系
        // try块不能独立存在
        try {
            // 编译期报错---受检异常
            //Class.forName("");

            // 运行时报错---非受检异常
            Scanner input = new Scanner(System.in);
            System.out.println("请输入被除数");
            int one = input.nextInt();
            System.out.println("请输入除数");
            int two = input.nextInt();
            int result = one / two;
            System.out.println("result="+result);

        } catch (ArithmeticException e) {
            // （依次顺序单一匹配）捕获异常，执行catch块（数量不受限制）代码
            e.printStackTrace();
        } catch (InputMismatchException e){
            e.printStackTrace();
        } catch (Exception e){
            // 任何一个异常对象都是Exception的子类及其子类的对象
            e.printStackTrace();
        }
        System.out.println("程序结束"); // 异常此处执行（区别）
    }
}
