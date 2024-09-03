package com.atguigu.test3;

public class Master {

    // 多态
    // 开闭原则
    // 对修改关闭 对扩展开放
    public void playWithPet(Pet pet){

        if(pet instanceof Dog){ // 回避强转风险
            // instanceof左侧一定是一个对象，右侧一定是一个类
            // 如果左侧的这个对象是右侧------这类的对象-------或者是右侧这个类的--------子类的对象--------则返回true，否则返回false
            Dog dog = (Dog)pet;
            dog.work();
        }else{
            pet.play();
        }

    }



}
