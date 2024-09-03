package com.atguigu.test1;

import java.util.Scanner;

public class TestCalcScore {
    public static void main(String[] args) {
        CalcScore cs = new CalcScore();
        Scanner input = new Scanner(System.in);
        System.out.println("请输入语文分数");
        int lang = input.nextInt();
        System.out.println("请输入数学分数");
        int math = input.nextInt();
        System.out.println("请输入英语分数");
        int english = input.nextInt();
        int sum = cs.calcSum(lang,math,english);
        int avg = cs.calcAvg(lang,math,english);
        System.out.println("sum = "+sum);
        System.out.println("avg = "+avg);
    }
}
