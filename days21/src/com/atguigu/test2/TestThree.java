package com.atguigu.test2;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class TestThree {
    public static void main(String[] args) {
        // 获取类的方法信息
        Class classOne = Student.class;

        Method[] methods = classOne.getMethods();// 所有公开方法（Student、Person、Object）
        System.out.println("----------------------------------------");
        for (Method method : methods) {
            String str = Modifier.toString(method.getModifiers());
            System.out.println(str);// 修饰符
            System.out.println(method.getReturnType().getSimpleName());// 方法返回类型（返回一个类类对象---即类（也是一个对象，Class类的对象））
            System.out.println(method.getName());// 方法名
            Class[] classes = method.getParameterTypes();// 形参
            for (Class aClass : classes) {
                System.out.print(aClass.getSimpleName()+" ");
            }
            System.out.println();
        }
        System.out.println("----------------------------------------");
        Method[] methods1 = classOne.getDeclaredMethods();// 所有本 类类对象 的方法
        for (Method method : methods1) {
            System.out.println(method.getName());
        }

        try {
            Method method = classOne.getMethod("methodOne");// 根据参数方法名获取所有公开方法
            System.out.println(method);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        try {
            // 注意方法重载（获取方法参数列表的类类对象）
            Method method = classOne.getDeclaredMethod("sayHello",String.class,int.class);// // 根据参数方法名获取所有本类方法
            System.out.println(method);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }


    }
}
