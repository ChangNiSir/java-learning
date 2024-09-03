package com.atguigu.test2;

public class TestOuter {
    public static void main(String[] args) {

        // 静态成员内部类 在 外部类类体 外创建内部类对象
        // 访问内部类：外部类类名.内部类类名
        Outer.Inner1 inner1 = new Outer.Inner1();

        // 普通成员内部类 外部类类体外创建对象
        // 先外部类对象--->内部类对象
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();

        Outer.Inner innerOne = new Outer().new Inner();


    }
}
