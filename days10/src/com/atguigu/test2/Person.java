package com.atguigu.test2;

public interface Person {
    // 接口属性默认 public static final修饰 (公开静态常量)
     public static final String NAME = "Tom";

     // 方法默认修饰 public abstract
     public abstract void sayHello();


     // JDK1.8--default 特殊修饰区
     public default void methodOne(){
         System.out.println("in Person default methodOne()");
    }

    // JDK1.8--static
    // 不允许重写
    // 接口中的静态方法属于接口，与实现类无关
    public static void methodTwo(){
        System.out.println("in Person static methodTwo()");
    }

}
