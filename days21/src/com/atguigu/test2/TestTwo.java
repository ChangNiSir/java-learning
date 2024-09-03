package com.atguigu.test2;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class TestTwo {
    public static void main(String[] args) {
        // Class类的常用方法
        Class classOne = Student.class;
        System.out.println(classOne.getName());// 获取类的完整类名
        System.out.println(classOne.getSimpleName());// 获取类的简单类名
        System.out.println(classOne.getPackage());// 获取类的包对象
        System.out.println(classOne.getSuperclass().getSimpleName());// 获取父类的类类对象
        Field[] fields = classOne.getFields();// 返回类中所有Public修饰符修饰的属性（包含父类）
        System.out.println(fields.length);
        for (Field field : fields) {
            System.out.println(field.getName());
        }
        Field[] fields1 = classOne.getDeclaredFields();// 返回类中所有修饰符修饰的属性（仅限本类）
        System.out.println(fields1.length);
        System.out.println("--------------------------------------");
        for (Field field : fields1) {// 未创建对象、非静态属性 -> 属性无默认值
            System.out.println(field.getModifiers());
            String modStr = Modifier.toString(field.getModifiers());// 访问修饰符（Modifier修饰符的类---万物皆对象）
            System.out.println(modStr);
            System.out.println(field.getType().getSimpleName());// 属性的类型
            System.out.println(field.getName());// 属性的名称
        }
        System.out.println("--------------------------------------");
        try {
            Field field = classOne.getField("two");// 参数属性名获取单个属性（仅能获取Public修饰的属性，不限本类）
            System.out.println(field);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        // System.out.println("-------------------------------------");
        try {
            Field field = classOne.getDeclaredField("stuAge");// 参数属性名获取单个属性（可以获取所有修饰符修饰的属性，仅限本类）
            System.out.println(field);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

    }
}
