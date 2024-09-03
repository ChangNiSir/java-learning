package com.atguigu.test2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestFive {
    public static void main(String[] args) {
        try {
            // 反射创建对象并调用对象成员
            // 属性、方法 -> 对象 （属性方法找对象）

            // 获取类类对象
            Class classOne = Student.class;

            // 创建类类对象代表的类的对象（调用 无参构造器）
            // Student stu = new Student();
            Object obj = classOne.newInstance();
            System.out.println(obj);
            // stu.stuName = "Tom";
            // 获取属性的Field类对象
            Field field = classOne.getDeclaredField("stuName");
            field.setAccessible(true);// 设置私有成员的公开访问特性---private开后门
            field.set(obj,"Tom");// 利用Field对象给obj属性赋值
            System.out.println(obj);
            // 使用Field方法查看属性值
            System.out.println(field.get(obj));
            // stu.setStuName("Tom");
            Method method =  classOne.getDeclaredMethod("setStuName", String.class);
            method.invoke(obj,"Jerry");// 方法找对象
            // System.out.println(stu.getStuName());
            // 调用方法查看属性值
            System.out.println("-----------------------------------");
            Method method1 = classOne.getDeclaredMethod("getStuName");
            System.out.println(method1.invoke(obj));// 方法找对象
            System.out.println("-----------------------------------");

            Field field1 = classOne.getDeclaredField("school");
            // field1.set(obj,"清华");
            field1.set(null,"清华");// 静态属性的特殊点
            System.out.println(field1.get(obj));

            // 反射调静态方法
            Method method2 = classOne.getDeclaredMethod("methodThree");
            // method2.invoke(obj);
            method2.invoke(null);// 静态的方法可以传null


            // 获取类类对象的 有参构造器 创建对象
            // Constructor constructor = classOne.getDeclaredConstructor(String.class,int.class,String.class);
            // Object obj = constructor.newInstance("Tom",20,"男");
            // System.out.println(obj);// 多态
        }catch (Exception ex){
            ex.printStackTrace();
        }



    }
}
