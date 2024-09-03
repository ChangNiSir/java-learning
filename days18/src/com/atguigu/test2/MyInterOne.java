package com.atguigu.test2;

// 接口声明支持泛型
// 接口的泛型必须由实现类确定
public interface MyInterOne<T> {
    // 泛型只能用于普通成员
    // https://www.jb51.net/article/85743.htm---静态方法不具有多态性
    // 同理静态不支持泛型---类加载时无法给出具体类型
    // public static final int data ;// 公开静态常量
    // 接口：只声明（public）提供的服务（非静态abstract的方法、静态常量），而不具有实现的类型
    // https://blog.csdn.net/haohaoxuexiyai/article/details/110158574
    // https://www.zhihu.com/question/383579598/answer/3104471666

    public abstract void methodOne(T t);
    public T methodTwo();
    public T methodThree(T t);
}


//实现类
// 可以控制泛型

// 不支持泛型的实现类实现支持泛型的接口，不给出泛型的具体类型---泛型视作Object
// class MyInterOneImpl implements MyInterOne{

// 不支持泛型的实现类实现支持泛型的接口，给出泛型的具体类型一直使用此种类型
// class MyInterOneImpl implements MyInterOne<String>{

// 一个支持泛型的实现类在实现接口时继承接口的泛型，创建对象时可以给出泛型具体类型
class MyInterOneImpl<T> implements MyInterOne<T>{

    @Override
    public void methodOne(T t) {

    }

    @Override
    public T methodTwo() {
        return null;
    }

    @Override
    public T methodThree(T t) {
        return null;
    }
}