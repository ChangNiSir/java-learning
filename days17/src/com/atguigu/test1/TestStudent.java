package com.atguigu.test1;

import java.util.HashSet;
import java.util.Set;

public class TestStudent {
    public static void main(String[] args) {
        // HashSet去重：hashCode和equals方法
        // HashSet只能去掉来自同一个内存地址的多个对象
        // 重写上述方法，hashCode先判定，判定不了再调用equals方法
        Set set = new HashSet();// 多态使用HashSet重写的方法

        Student stu = new Student("Tom",20,"男");
        Student stu1 = new Student("Jerry",20,"男");
        Student stu2 = new Student("Marry",20,"女");
        Student stu3 = new Student("June",20,"男");
        Student stu4 = new Student("June",20,"男");
        Student stu5 = new Student("June",20,"男");

        // hashCode()针对内存地址 -> 需要重写
        // equals()只能判断内存地址---就算下标相同，比较也不同 -> 需要重写
        set.add(stu);
        set.add(stu1);
        set.add(stu2);
        set.add(stu3);
        set.add(stu4);
        set.add(stu5);

        for (Object o : set) {
            System.out.println(o);
        }
    }
}
