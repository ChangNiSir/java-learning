package com.atguigu.test1;

public class TestPet {
    public static void main(String[] args) {
//        Dog dog = new Dog("小白",3,"公","白");
//        System.out.println(dog.getInfo());
//        System.out.println(Dog.info);
//        Dog dog = new Dog("旺财","这是一只狗");

        //System.out.println(Dog.info); // 只加载类

        Dog dog = new Dog();
        //Dog dog1 = new Dog();

        // ---------单个类的加载顺序
        // 静态属性
        // 静态代码块
        // ---------创建对象
        // 普通属性
        // 普通代码块
        // 构造器


    }
}
