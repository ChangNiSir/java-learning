package com.atguigu.test3;

// JDK1.5以前枚举类
// 不能随便访问构造器，否则会出现"越界"
// 私有所有的构造器---->提供若干本类属性作为公开静态常量

public class Season {
 // 可访问性 无需创建对象 枚举特性 属性类型   属性名
    public   static     final    Season   SPRING = new Season("春季");
    public static final Season SUMMER = new Season("夏季");
    public static final Season AUTUMN = new Season("秋季");
    public static final Season WINTER = new Season("冬季");

// 普通属性
    private String info;

// 私有构造器
    private Season() {
    }

    private Season(String info){
        this.info = info;
    }

// 公开Get and Set
    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

// 重写toString()(类似于getInfo())
    @Override
    public String toString() {
        return "这个季节是："+info;
    }

}
