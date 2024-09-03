package com.atguigu.test2;

public class TestMyInterOne {
    public static void main(String[] args) {
        // 匿名(局部)内部类
        // 接口的实现类、抽象父类的子类

        // 无参方法
        // 匿名内部类有名对象
        MyInterOne myInterOne = new MyInterOne(){
            @Override
            public void methodOne() {
                System.out.println("in unknown methodOne()");
            }
        };
        myInterOne.methodOne();
        // 匿名内部类匿名对象
        System.out.println("--------------------");
        new MyInterOne(){
            @Override
            public void methodOne() {
                System.out.println("in unknown methodOne1()");
            }
        }.methodOne();

        // 有参方法
        // 匿名内部类有名对象
        System.out.println("-----------------------------------");
        MyInterOne myInterOne1 = new MyInterOne() {
            @Override
            public void methodOne() {
                System.out.println("in unknown methodOne2()");
            }
        };
        test(myInterOne1); // 本类方法方法名调用
        System.out.println("------------------------");
        // 匿名内部类的匿名对象为方法传参
        test(new MyInterOne() {
            @Override
            public void methodOne() {
                System.out.println("in unknown methodOne3()");
            }
        });
    }

    // 多态
    public static void test(MyInterOne myInterOne){
        myInterOne.methodOne();
    }

}
