package com.atguigu.test;

public class EnglishTeacher extends Teacher {
    @Override
    public void teach() {
        System.out.println("开始上英语课");
    }

    public void listen(){
        System.out.println("开始听力啦");
    }
}
