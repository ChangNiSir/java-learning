package com.atguigu.test1;

import java.util.HashMap;
import java.util.Map;

public class TestThree {
    public static void main(String[] args) {
        // HashMap实现类：第一个调用put方法时初始化数组，长度16
        // 负载因子超过0.75扩容2倍
        // JDK1.8后，如果一个链表元素超过8个，并且此时数组长度达到64，则将链表结构变成红黑树
        // JDK1.8之前HashMap底层使用数组+链表存储元素，JDK1.8后HashMap底层使用数组+链表+红黑树存储元素
        Map map = new HashMap();
        map.put("班长","美国");

    }
}
