package com.atguigu.test3;

public class TestOne {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("来福");
        System.out.println(dog.getName());
        dog.play();
        dog.work();
        dog.equals(null); // 对象比较相等

        System.out.println("-------------------- ");
        Cat cat = new Cat();
        cat.setName("汤姆");
        System.out.println(cat.getName());
        cat.play();


    }


}
