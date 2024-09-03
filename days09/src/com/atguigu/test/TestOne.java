package com.atguigu.test;

public class TestOne {
    public static void main(String[] args) {
        Dog dog = new Dog("小狗狗",5,"公");
//        dog.setName("小狗狗");
//        System.out.println(dog.getName());
        System.out.println(dog.getInfo());
        dog.play();

        System.out.println("------------------");
        Cat cat = new Cat("小猫猫",5,"母");
        System.out.println(cat.getInfo());
        cat.play();
    }
}
