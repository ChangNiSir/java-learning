package com.atguigu.test1;

public class Student {
    //属性
    //属性是属于类的，属性的值是属于对象的
    public String stuName;
    public int stuAge;
    public String stuGender;

    //方法：访问修饰符、返回类型、方法名、参数组、方法体
    //访问修饰符：1、public（公开访问） 2、protected 3、缺省 4、private（本类访问）
    //返回类型：方法返回值的类型： void（方法无返回值）


    public void sayHello(){
        System.out.println("你好，我叫"+stuName
                +"，我今年"+stuAge +"，我是一名"+stuGender+"同学");
    }

    public int methodOne(){
        int result = 0;
        result = 1 + 1;
        return result;

    }

}
