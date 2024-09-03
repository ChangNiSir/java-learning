package com.atguigu.test1;

import java.util.LinkedHashSet;
import java.util.Set;

public class TestTwo {
    public static void main(String[] args) {
        // LinkedHashSet：去重、有序（新增和遍历顺序一致）
        // 新链表记录新增顺序---插入删除牺牲了效率
        Set set = new LinkedHashSet();
        set.add("Marry");
        set.add("Jerry");
        set.add("Tom");
        set.add("June");

        for (Object o : set) {
            System.out.println(o);
        }


    }
}
