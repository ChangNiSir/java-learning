package com.atguigu.test;

import java.util.*;

public class TestTwo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Tom");
        String value = list.get(0);

        Set<String> set = new HashSet<>();
        set.add("Tom");

        // 迭代器泛型具体类型和集合泛型类型一致
        Iterator<String> iter = list.iterator();
        Iterator<String> iter1 = set.iterator();

        Map<String,String> map = new HashMap<>();
        map.put("班长","美国");
        String val = map.get("班长");
        // Map没有自己的迭代器---图啥呢（键找值需要吗）

        /*
        HashMap底层原理：数组+链表+红黑树

        第一次put时初始化：长度16 负载因子 0.75（2倍扩容）
        扩容时机-> 超过临界值或者链表元素超过8个
        数据结构更改时机->当一个链表元素个数超过8，数组长度达到或者超过64时，链表变红黑树

         */



    }
}
