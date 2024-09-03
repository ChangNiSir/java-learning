package com.atguigu.test1;

public class Tortoise extends Thread{
    @Override
    public void run() {
        for(int i = 1; i <= 30; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("乌龟跑了1m");
            if(i == 30){
                System.out.println("乌龟到达========================");
                break;
            }
            if(i % 10 == 0){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

