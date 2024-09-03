package com.atguigu.test3;

public class Dog extends Pet {
    @Override
    public void play() {
        System.out.println("玩丢飞盘");
    }

    public void work(){
        System.out.println("工作");
    }
}
