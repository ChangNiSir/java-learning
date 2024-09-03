package com.atguigu.test1;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class TestOne {
    public static void main(String[] args) {
        // Set：无下标、无序（新增和遍历顺序不一致）、去重（不允许重复记录）
        // 链表数组
        Set set = new HashSet();
        // （对象内存地址）计算哈希码 ---> 二次哈希码 ---> 下标（固定）
        set.add("June");
        set.add("Jerry");
        set.add("Marry");
        set.add("Tom");
        set.add("Tom");
        System.out.println(set);



    }
}
