package com.atguigu.test;

// JDK 1.5之前使用枚举类
public class Season {
    public static final Season SPRING = new Season("春季");
    public static final Season SUMMER = new Season("夏季");
    public static final Season AUTUMN = new Season("秋季");
    public static final Season WINTER = new Season("冬季");
    private String info;

    private Season(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return info;
    }
}
