package com.atguigu.test1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestTwo {
    public static void main(String[] args) {
        // Collection接口的遍历
        // 集合使用上和数组没有类型上(基础和引用皆可)的差别-----集合存在自动装拆箱
        Collection col = new ArrayList();
        col.add("Tom");
        col.add("Jerry");
        col.add("Marry");
        col.add("June");
        // ClassCastException
        // col.add(10);// 自动装箱
        // col.add(true);

        // 不能通过下标获取单个元素
        // 增强for循环
        // add方法参数为Object
        for (Object o : col) {
            String s = (String)o;// 强转的必要性
            System.out.println(s);
        }

        System.out.println("------------------------");

        // 马甲（增强for）---> 底层（迭代器）
        Iterator iterator = col.iterator();// 返回一个迭代器对象
        while(iterator.hasNext()){// 判断是否存在下一个元素
            String s = (String)iterator.next();// 每次返回一个元素
            System.out.println(s);
        }

        // 迭代器遍历时不允许集合移除（包括新增）元素---迭代器remove()

        // fail-fast机制---来保护元素的安全
    }
}
