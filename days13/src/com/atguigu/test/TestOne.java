package com.atguigu.test;

// ---一个线程对象只能开启一个子线程
public class TestOne {
    public static void main(String[] args) {
        //methodOne();
        // 有名对象0
        MyThreadOne myThreadOne = new MyThreadOne();
        myThreadOne.setName("子线程0");
        myThreadOne.setPriority(Thread.MIN_PRIORITY);// 设置线程优先级
        System.out.println(myThreadOne.getPriority());// 线程优先级[1, 10]
        // 开启子线程（自动调用run()）
        myThreadOne.start();

        // 有名对象1
        MyThreadOne myThreadOne1 = new MyThreadOne();
        myThreadOne1.setPriority(Thread.MAX_PRIORITY);
        System.out.println(myThreadOne1.getPriority());
        myThreadOne1.setName("子线程1");
        myThreadOne1.start();// 又一个子线程

        // 匿名对象
        new MyThreadOne("子线程2").start();// 又一个子线程

        Thread.currentThread().setName("主线程");// ---主线程
        System.out.println(Thread.currentThread().getPriority());
        for(int i = 0; i < 100; i++){
            System.out.println(Thread.currentThread().getName()+"："+i+"======================");// 主线程
        }

    }

    public static void methodOne(){
        for(int i = 0; i < 100; i++){
            System.out.println(i+"~~~~~~~~~~~~~~~~~~~~~~");
        }
    }
}
