package com.atguigu.test1;

import java.util.ArrayList;
import java.util.List;

public class TestThree {
    public static void main(String[] args) {
        // List接口特性：
        // 有序（新增顺序和遍历顺序一致）
        // 下标操作（*)
        // 允许重复（.equals()）
        List list = new ArrayList();
        System.out.println(list.size());
        list.add("Tom");
        list.add("Jerry");
        list.add("Marry");
        list.add("June");
        System.out.println(list.size());
        System.out.println(list);

        list.add(1, "小马");// index索引位置添加element
        System.out.println(list);

        List list1 = new ArrayList();
        list1.add("小白");
        list1.add("小强");
        list.addAll(1,list1);
        System.out.println(list);

        list.set(1, "小黑");// 指定位置替换元素
        System.out.println(list);

        list.remove(1);// 移除指定下标处元素（优先于内容）
        System.out.println(list);

        List list2 = new ArrayList();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.remove(1);// 移除指定下标处元素（优先于内容）
        System.out.println(list2);
        list2.remove(new Integer(1));
        System.out.println(list2);

        String s = (String) list.get(0);// 下标获取单个元素
        System.out.println(s);
    }
}
