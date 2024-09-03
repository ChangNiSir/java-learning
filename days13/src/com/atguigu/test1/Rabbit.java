package com.atguigu.test1;

public class Rabbit extends Thread{
    @Override
    public void run() {
        for(int i = 1; i <= 30; i++){ // 注意i从1开始
            try {
                // Thread.sleep()和this.sleep()的区别
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("兔子前进1m");
            if(i == 30){
                System.out.println("兔子到达======================");
                break;
            }
            if(i % 10 == 0){
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
