package com.atguigu.test;

// 线程类实现Runnable接口---单继承多实现
public class MyThreadTwo implements Runnable {
    // 实现run()
    @Override
    public void run() {
        for(int i = 0; i < 100; i++){
            System.out.println(i+"~~~~~~~~~~~~~~~~~~~~~~~~");
        }
    }
}
