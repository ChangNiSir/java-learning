package com.atguigu.test2;

public class TestWork {
    public static void main(String[] args) {
        Work work = new Work("小明",22,"boy");
        Work work1 = new Work("小强",27,"boy");
        System.out.println(work.equals(work1));
        System.out.println(work.compareTo(work1));


    }
}
