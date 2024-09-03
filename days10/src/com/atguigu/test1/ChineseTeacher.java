package com.atguigu.test1;

// 子类继承抽象父类，必须重写父类中的抽象方法方法
public class ChineseTeacher extends Teacher {
    @Override
    public void teach() {
        System.out.println("开始上语文课");
    }

}
