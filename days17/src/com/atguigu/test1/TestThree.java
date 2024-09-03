package com.atguigu.test1;

import java.util.Set;
import java.util.TreeSet;

public class TestThree {
    public static void main(String[] args) {
        // TreeSet：红黑树（要求可以比大小---String完美）
        // TreeSet中存储的元素必须能比较大小，通过自然排序、定制排序
        // 自然排序：存储元素自己可以排序---实现Comparable接口的compareTo()
        Set set = new TreeSet();

//        set.add("Tom");
//        set.add("Jerry");
//        set.add("Marry");
//        set.add("June");
        // 红黑树（二叉树）---构造二叉树（默认升序）
        Student stu = new Student("Tom",20,"男");
        Student stu1 = new Student("Jerry",21,"男");
        Student stu2 = new Student("Marry",20,"女");
        Student stu3 = new Student("June",20, "男");
        set.add(stu);
        set.add(stu1);
        set.add(stu2);
        set.add(stu3);

        for (Object o : set) {
            System.out.println(o);// 排序
        }

    }

}
