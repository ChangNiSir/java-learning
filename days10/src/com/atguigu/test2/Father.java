package com.atguigu.test2;

// 没有隐式继承
public interface Father {
    public abstract void methodOne();

}

// 接口继承
interface Son extends Father,Comparable{
    public abstract void methodTwo();
}

//实现类要实现接口中的所有抽象方法
class Student implements Son {

    @Override
    public void methodOne() {

    }

    @Override
    public void methodTwo() {

    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}




