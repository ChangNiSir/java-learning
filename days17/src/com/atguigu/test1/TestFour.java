package com.atguigu.test1;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TestFour {
    public static void main(String[] args) {
        // 定制排序：集合本身可以排序，不需要元素排序
        // 定制排序优先级高于自然排序
        Set set = new TreeSet(new Comparator<Student>() {// 范型比较器对象
            @Override
            public int compare(Student o1, Student o2) {// 降序
                int result = o2.getStuAge() - o1.getStuAge();
                if(result == 0){
                    result = o2.getStuName().compareTo(o1.getStuName());
                }
                if(result == 0){
                    result = o2.getStuGender().compareTo(o1.getStuGender());
                }
                return result;
            }
        });// 传入比较器对象

        Student stu = new Student("Tom",20,"男");
        Student stu1 = new Student("Jerry",21,"男");
        Student stu2 = new Student("Marry",22,"女");
        Student stu3 = new Student("June",23,"男");

        set.add(stu);
        set.add(stu1);
        set.add(stu2);
        set.add(stu3);

        for (Object o : set) {
            System.out.println(o);
        }
    }
}
