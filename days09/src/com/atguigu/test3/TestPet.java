package com.atguigu.test3;

public class TestPet {
    public static void main(String[] args) {
        Master master = new Master();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Bird bird = new Bird();

        // 多态
        // 任何一个需要父类引用的位置都可以传递一个子类对象
        // 父类的引用指向子类的对象
        // 1、必须有继承 父子类
        // 2、父类定义方法，子类重写方法
        // 3、父类的引用指向子类的对象   (本态与)多态


        // master不动
        master.playWithPet(bird);

        Pet pet = new Dog();
        pet.play();
    }
}
