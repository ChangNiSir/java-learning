package com.atguigu.test3;

public class SomeObject {

    public void someMethod(){
        System.out.println("in someMethod()");
    }

    // 方法重载(必须发生在同一个类中) 例子：println()
    // 方便调用点调用
    // 参数组不同(类型 个数 顺序)
    public void someMethod(int i){
        System.out.println("in someMethod(int)");
    }
}
