package com.atguigu.test3;

@SuppressWarnings("unused")
public class TestOne {
    // @SuppressWarnings("unused")
    public static void main(String[] args) {
    // @SuppressWarnings("unused") 抑制警告注解
        int one = 100;
        System.out.println(one);
//        Person person = new Person();
//        person.sayHello();
//        methodOne();
    }

    // @ + 单词 --------------注解

    // 检查方法重写是否符合规范
    @Override
    public String toString() {
        return "";
    }

    // 标注方法已过期
//    @Deprecated
//    public static void methodOne(){
//    }

}
