package com.atguigu.test2;

// 继承支持泛型的父类的（不支持泛型不支持修改）子类使用的泛型 默认Object
//public class MyDataTwoSub extends MyDataTwo {// 通配不精确

// 继承父类时给出泛型具体类型，子类采用 固定类型 处理父类泛型
//public class MyDataTwoSub extends MyDataTwo<String> {// 精确不通配

// 支持泛型的子类继承支持泛型的父类时，继承 父类的泛型
// 子类指定泛型的具体类型
public class MyDataTwoSub<T> extends MyDataTwo<T> {
    // 子类很少具有独有方法，一般都是继承父类的泛型
    @Override
    public T getData() {
        return super.getData();
    }

    @Override
    public void setData(T data) {
        super.setData(data);
    }
}
