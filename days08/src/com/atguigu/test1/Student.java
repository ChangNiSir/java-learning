package com.atguigu.test1;

public class Student {
    public String stuName;
    public int stuAge;
    public String stuGender;

    // 不推荐 对象名.静态属性
    //
    public static String school;

    public Student() {

    }

    public Student(String stuName, int stuAge, String stuGender) {
        this.stuName = stuName;
        this.stuAge = stuAge;
        this.stuGender = stuGender;
    }

    // 普通方法对象名调用(需要创建对象)
    public String getInfo(){

        return "姓名："+stuName+"，年龄："+stuAge+"，性别："+stuGender;
    }

    // 静态方法不需要创建对象
    // 静态成员只能访问静态成员(普通成员皆可)
    public static void methodOne(){

        System.out.println("in methodOne()");
    }

}
