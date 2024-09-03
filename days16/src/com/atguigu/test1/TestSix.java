package com.atguigu.test1;

import java.util.LinkedList;
import java.util.List;

public class TestSix {
    public static void main(String[] args) {
        // LinkedList：双向链表
        // 遍历的效率低，频繁存取效率高（尤其是首尾元素）
        LinkedList list = new LinkedList();
        list.add("小明");
        list.addFirst("Tom");
        list.addLast("Jerry");
        // list.getFirst();
        // list.getLast();
        // list.removeFirst();
        // list.removeLast();


    }
}
