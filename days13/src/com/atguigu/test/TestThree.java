package com.atguigu.test;

public class TestThree {
    public static void main(String[] args) {
        for(int i = 10; i >= 0; i--){
            System.out.println(i);
            try {
                Thread.sleep(1000);// sleep()方法
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
