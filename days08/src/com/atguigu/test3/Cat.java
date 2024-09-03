package com.atguigu.test3;

// 公开类(public)、普通类( ) ----修饰类的成员
public class Cat extends Pet{
    // 访问修饰符 ----修饰属性和方法
    // public private

    // 方法重载---->加注解----->检查方法重写
//    @Override
//    public Pet play(){
//        System.out.println("给你撸");
//        return null;
//    }


    @Override
    public Pet play() {
        System.out.println("玩小球球");
        return null;
    }
}
