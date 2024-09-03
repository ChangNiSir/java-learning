package com.atguigu.test2;

public class TestPerson {
    public static void main(String[] args) {
        // 抽象类---->接口
        // 接口声明 = 创建实现类对象
        Person person = new Teacher();
        person.sayHello();
        person.methodOne();
        System.out.println("-------------------------");
        // 接口名直接调用static方法(接口中的静态方法*不允许*对象名调用)
        Person.methodTwo();

        System.out.println("-------------------------");
        Master master = new Master();
        Doctor doctor = new Doctor();
        master.personSayHello(new Teacher()); // 匿名对象传参



    }
}
