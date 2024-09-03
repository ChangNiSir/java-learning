package com.atguigu.test1;

public class Customer extends Thread {
    private Stone stone;
    public Customer(Stone stone){
        this.stone = stone;
    }
    @Override
    public void run() {
        while(true){
            stone.get();
        }
    }
}
