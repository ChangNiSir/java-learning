package com.atguigu.test3;

import java.util.*;

public class TestOne {
    public static void main(String[] args) {
        // 泛型的集合
        List<String> list  = new ArrayList<>();
        list.add("Tom");
        list.add("Jerry");
        list.add("Marry");
        list.add("June");
        String name = list.get(0);

        // 并不是所有的方法支持泛型remove(Object o)

        // 迭代器使用的泛型和集合泛型一致
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s);
        }


        Set<String> set = new HashSet<>();
        set.add("Tom");


        Map<String,String> map = new HashMap<>();
        map.put("班长","Tom");
        String value =  map.get("班长");
    }
}
