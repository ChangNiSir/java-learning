package com.atguigu.test1;

import java.util.ArrayList;
import java.util.List;

public class TestFive {
    public static void main(String[] args) {
        // ArrayList：可变长度数组
        // 遍历的效率高，频繁存取效率低
        List list = new ArrayList();
        // 在集合第一次add初始化长度10（节省空间（相对于Vector））
        // 当所需长度minCapacity超过数组长度时扩容，按照原来长度的1.5倍扩容
        for (int i = 0; i < 10; i++) {
            list.add("Tom");
        }
    }
}
