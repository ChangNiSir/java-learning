package com.atguigu.test;

public class Dog extends Pet {
    public Dog() {
    }

    public Dog(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public void play() {
        super.play();
        System.out.println("去拿项圈");
    }
}
