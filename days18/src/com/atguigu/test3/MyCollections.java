package com.atguigu.test3;

public class MyCollections {
    // 泛型的方法（特殊）：类不支持泛型，方法必须是静态的，static 后声明泛型
    // 声明泛型：<T>
    public static<T> T sort(T t){
        System.out.println(t.getClass().getName());
        return t;
    }
}
