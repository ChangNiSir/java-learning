package com.atguigu.test2;
// 泛型：定义时无法确定成员类型，创建对象时确定（参数化类型）
// 声明类支持泛型，<>中是泛型的数量和名称，可以声明多个，每个泛型用一个大写字母表示
// 泛型在类中可以放在 任何一个表示类型的 位置
public class MyDataTwo<T> {
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void methodOne(T t){
    }

    public T methodTwo(){
        return null;
    }

    public T methodThree(T t){
        return null;
    }
}
