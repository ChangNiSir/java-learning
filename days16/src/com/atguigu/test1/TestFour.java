package com.atguigu.test1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestFour {
    public static void main(String[] args) {
        // List集合的遍历
        List list = new ArrayList();
        list.add("Tom");
        list.add("Jerry");
        list.add("Marry");
        list.add("June");

        // 遍历1：增强for循环
        for (Object o : list) {
            String s = (String)o;
            System.out.println(s);
        }
        System.out.println("--------------------------");

        // 遍历2：迭代器
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            String s = (String)iterator.next();
            System.out.println(s);
        }
        System.out.println("----------------------------");

        // 遍历3：传统for循环
        for (int i = 0; i < list.size(); i++) {
            String s = (String)list.get(i);
            System.out.println(s);
        }


    }
}
