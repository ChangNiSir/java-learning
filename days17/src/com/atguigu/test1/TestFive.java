package com.atguigu.test1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestFive {
    public static void main(String[] args) {
        // Collections工具类
        List list = new ArrayList();
        list.add("Tom");
        list.add("Jerry");
        System.out.println(list);
        Collections.addAll(list,"Marry","June","Jack");
        System.out.println("添加元素后："+list);
        // 情况1---自然排序（元素有排序功能）
        Collections.sort(list);// 集合中的元素自然排序
        System.out.println("排序后："+list);
        int index = Collections.binarySearch(list,"Jack");// 要求List有序
        System.out.println(index);
        System.out.println("--------------------------------------");

        List list1 = new ArrayList();
        Student stu = new Student("Tom",20,"男");
        Student stu1 = new Student("Jerry",21,"男");
        Student stu2 = new Student("Marry",22,"女");
        Student stu3 = new Student("June",23,"男");
        Collections.addAll(list1,stu,stu2,stu1,stu3);
        for (Object o : list1) {
            System.out.println(o);
        }
        // 情况2---定制排序
        Collections.sort(list1,new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result = o1.getStuAge() - o2.getStuAge();
                if(result == 0){
                    result = o1.getStuName().compareTo(o2.getStuName());
                }
                if(result == 0){
                    result = o1.getStuGender().compareTo(o2.getStuGender());
                }
                return result;
            }
        });
        System.out.println("排序后：");
        for (Object o : list1) {
            System.out.println(o);
        }
        System.out.println("-----------------------------------------");

        int index1 = Collections.binarySearch(list1,stu3,new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {// 排序二分查找一体化
                int result = o1.getStuAge() - o2.getStuAge();
                if(result == 0){
                    result = o1.getStuName().compareTo(o2.getStuName());
                }
                if(result == 0){
                    result = o1.getStuGender().compareTo(o2.getStuGender());
                }
                return result;
            }
        });
        System.out.println(index1);
        System.out.println("-----------------------------------------");

        // max() / min()---这里使用自然排序
        System.out.println("max："+Collections.max(list));
        System.out.println("min："+Collections.min(list));

        // reverse()
        System.out.println(list);
        Collections.reverse(list);
        System.out.println("反转后："+list);

        // shuffle()---随机排序
        Collections.shuffle(list);
        System.out.println("随机排序后："+list);

        // swap()
        Collections.swap(list,1,3);
        System.out.println("交换元素后："+list);


    }
}
