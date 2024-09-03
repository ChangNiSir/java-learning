package com.atguigu.test2;

import java.util.Collections;

public class TestMyDataTwo {
    public static void main(String[] args) {
        // 支持泛型的类
        // 支持泛型的类创建对象时不给出泛型的类，则泛型默认为Object
        MyDataTwo myDataTwo = new MyDataTwo();
        myDataTwo.setData("Hello");
        String s = (String)myDataTwo.getData();
        System.out.println(s);

        // 支持泛型的类创建对象时给出泛型的具体类型，则所有泛型位置替换为具体类型---具备通配的能力和精确的能力
        MyDataTwo<String> myDataTwo1 = new MyDataTwo<String>();
        myDataTwo1.setData("Hello");
        String s1 = myDataTwo1.getData();

        MyDataTwo<Integer> myDataTwo2 = new MyDataTwo<>();
        myDataTwo2.setData(100);
        Integer integer = myDataTwo2.getData();

        // 给出泛型具体类型的三种形式
        MyDataTwo<String> md = new MyDataTwo();// 不推荐
        md.setData("100");
        String s2 = md.getData();

        // 泛型要求（确定性）：引用的泛型类型必须和对象的泛型类型一致
        // 泛型不支持多态
        MyDataTwo<String> md1 = new MyDataTwo<String>();
        md1.setData("200");
        String s3 = md1.getData();

        MyDataTwo<String> md2 = new MyDataTwo<>();// 推荐（<>是泛型的标志）
        md2.setData("200");
        String s4 = md2.getData();

        MyDataTwoSub<String> md3 = new MyDataTwoSub<>();
        md3.setData("Hello");
        String s5 = md3.getData();

        // 支持泛型的接口
        MyInterOne<Integer> myInterOne = new MyInterOneImpl<>();
        myInterOne.methodOne(100);
        Integer integer1 = myInterOne.methodTwo();
        Integer integer2 = myInterOne.methodThree(new Integer(200));
    }
}
