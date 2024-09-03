package com.atguigu.test;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TestOne {
    public static void main(String[] args) {

        Student stu = new Student("Tom",21,"男");
        Student stu1 = new Student("Jerry",20,"男");
        Student stu2 = new Student("Marry",23,"女");
        Student stu3 = new Student("June",23,"男");

        // 自然排序---继承Comparable接口实现compareTo方法
        Set set = new TreeSet();

        set.add(stu);
        set.add(stu1);
        set.add(stu2);
        set.add(stu3);
        for (Object o : set) {
            System.out.println(o);
        }
        System.out.println("----------------------------");

        // 定制排序（优先级更高）---Comparator比较器对象
        Set set1 = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o2, Object o1) {
                Student s1 = (Student)o1;
                Student s2 = (Student)o2;
                int result = s1.getStuAge() - s2.getStuAge();
                if(result == 0){
                    result = s1.getStuName().compareTo(s2.getStuName());
                }
                if(result == 0){
                    result = s1.getStuGender().compareTo(s2.getStuGender());
                }
                return result;
            }
        });

        set1.add(stu);
        set1.add(stu1);
        set1.add(stu2);
        set1.add(stu3);
        for (Object o : set1) {
            System.out.println(o);
        }
    }
}
