package com.atguigu.test5;

public class Student {
    public String name;
    public int stuAge;
    public String stuGender;

    // 构造器(必须)创建对象、和类同名(没有返回类型)
    //  __ __ sayHello(){...} 为default缺省修饰
    // 构造器只能在创建对象时调用
    // 没有显示构造器才有隐示构造器(系统配备)
    // 无参构造器有用
    public Student(){
    }

    public Student(String name,int stuAge,String stuGender){
        // 局部变量可以和属性重名
        // 局部变量优先级更高 println(name)
        // 重名状态加this
        // 对象初始化
        this.name = name;
        this.stuAge = stuAge;
        this.stuGender = stuGender;
    }

    public void sayHello(){
        System.out.println("学生名："+name +"，学生年龄："
                +stuAge+"，学生性别：" +stuGender);
    }

}
