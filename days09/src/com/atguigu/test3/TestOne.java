package com.atguigu.test3;

public class TestOne {

    public static void main(String[] args) {

        // 对象永远不会变，变的是我们看待的眼光


        Pet pet = new Dog(); // 向上转型(自动)
        // 编译时类型  = new 运行时类型
        pet.play();
        // 有弊端 pet.work();

       // pet = new Pet();
        Dog dog = (Dog)pet; // 向下转型(手动)
        dog.play();

        //System.out.println(pet.equals(dog));
        System.out.println("------------------------------");
        Master master = new Master();
        Cat cat = new Cat();
        master.playWithPet(cat);

    }


}
