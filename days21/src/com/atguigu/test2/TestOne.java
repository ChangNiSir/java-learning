package com.atguigu.test2;

public class TestOne {
    public static void main(String[] args) {
        // 获取类类对象（不和类对象冲突） --- Class类的对象（类的类的对象）
        // 一个类的类类对象在方法区中只会有一个 --- 可以作为锁对象的理由
        Class classOne = Student.class;// 所有类是.class文件加载而来
        System.out.println(classOne.getName());// 返回类类对象代表的类的类名

        // 使用对象获取对象所属类的类类对象
        Student stu = new Student();
        Class classTwo = stu.getClass();

        // 使用String获取类类对象
        try {// 可以注意一下变量作用域
            Class classThree= Class.forName("com.atguigu.test2.Student");// 完整类名加载类（使用类类对象接受）
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // 使用类加载器获取 类类 对象
        try {
            Class classFour = Student.class.getClassLoader().loadClass("com.atguigu.test2.Student");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
