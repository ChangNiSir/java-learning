package com.atguigu.test;

public class TestTwo {
    public static void main(String[] args) {
        MyThreadTwo myThreadTwo = new MyThreadTwo();

        // ---传参
        Thread thread = new Thread(myThreadTwo);
        thread.start(); //调thread的run()跑参数为myThreadTwo的run()

        // 一个线程对象只能开启一个子线程
        // 多线程多个Thread线程对象
        new Thread(myThreadTwo).start();
        new Thread(myThreadTwo).start();

        // 主线程代码
        for(int i = 0; i < 100; i++){
            System.out.println(i+"======================");
        }
    }
}
