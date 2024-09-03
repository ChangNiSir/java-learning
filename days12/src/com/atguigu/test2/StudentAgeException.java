package com.atguigu.test2;

// 1 继承父类有所区别
// 2 定义
// 2.1 构造器传参 ---动态
// 2.2 @Override重写getMessage方法（返回固定的优先级更高的异常信息）

// 自定义非受检异常类
//public class StudentAgeException extends RuntimeException{
// }


// 自定义受检异常类---构造器传参
public class StudentAgeException extends Exception{
    // 无参构造器
    public StudentAgeException(){
    }
    // 有参构造器
    public StudentAgeException(String info){
        super(info);
    }
    // 重写之是否写死异常信息
    @Override
    public String getMessage() {
        // 对比与构造器传递异常信息，getMessage拥有更高的优先级
        return "学员年龄必须在20-40";
    }
}
