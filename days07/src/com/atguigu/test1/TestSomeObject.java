//测试类

package com.atguigu.test1;

public class TestSomeObject {

    //方法
    //主方法
    public static void main(String[] args) {

        SomeObject so = new SomeObject();

        // 基础数据类型传值
//        int yi = 100;
//        int er = 200;
//        System.out.println("yi="+yi+",er="+er);
//        so.methodOne(yi,er);
//        System.out.println("yi="+yi+",er="+er);

        System.out.println("---------------------");

        // 引用数据类型传的是地址
        MyNumber myn = new MyNumber();
        myn.a = 100;
        myn.b = 200;
        System.out.println("myn.a="+myn.a+",myn.b="+myn.b);
        so.methodTwo(myn);
        System.out.println("intmain myn.a="+myn.a+",myn.b="+myn.b);
    }

}
