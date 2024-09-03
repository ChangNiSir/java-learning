package com.atguigu.test;

public class Cat extends Pet {
    public Cat() {
    }

    public Cat(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public void play(){
        super.play();
        System.out.println("去拿小球球");
    }

}
