package com.atguigu.test4;
// util包
import java.util.Random;

public class TestThree {
    public static void main(String[] args) {
        Random random = new Random();// Random类
        for(int i = 0; i < 10; i++){
            int index = random.nextInt(16);// [0. bond)
            System.out.println(index);
        }
    }
}
