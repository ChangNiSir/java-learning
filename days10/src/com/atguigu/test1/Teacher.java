package com.atguigu.test1;

// abstract---抽象类、抽象方法
// 抽象的方法必须在抽象的类中
// 抽象类不能实例化、创建对象
// 抽象方法没有方法体
public abstract class Teacher {
    private String name;
    private int age;

    public Teacher() {
    }

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public abstract void teach(); // 需要重写

}
