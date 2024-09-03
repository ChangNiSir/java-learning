package com.atguigu.test2;

import java.lang.reflect.Constructor;

// Class类对象代表一个类，但不是类本身，可以看组成信息
public class TestFour {
    public static void main(String[] args) {
        // Class类的常用方法
        // 类名获得类类对象
        Class classOne = Student.class;

        Constructor[] cs1 = classOne.getConstructors();// public构造器---无法从父类处获得构造器
        System.out.println(cs1.length);
        Constructor[] cs2 = classOne.getDeclaredConstructors();// 所有构造器
        System.out.println(cs2.length);

        // 获取公开构造器（包括根据参数列表）
        try {
            Constructor c1 = classOne.getConstructor();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        try {
            Constructor c2 = classOne.getConstructor(String.class,int.class,String.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        // 获取所有构造器（包括根据参数列表）
        try {
            Constructor c1 = classOne.getDeclaredConstructor();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        try {
            Constructor c2 = classOne.getDeclaredConstructor(String.class,int.class,String.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }


    }
}
