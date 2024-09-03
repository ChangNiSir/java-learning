package com.atguigu.test;

public class TestMaster {
    public static void main(String[] args) {
        Master master = new Master();
        // 多态
        // 父类的引用子类的对象
        Teacher tc = new EnglishTeacher();
        Teacher tc1 = new MathTeacher();
        Teacher tc2 = new ChineseTeacher();
        master.command(tc);

    }
}
