package com.atguigu.test4;

// JDK 1.5之后的枚举
public enum Season {
    // 第一部分给出本类的属性
    // 写也是它不写也是它 故得删
    // public static final Season SPRING = new Season();
    // ===> SPRING;  (第一部分，以 ";" 为界)
    SPRING("春"),
    SUMMER("夏"),
    AUTUMN("秋"),
    Winter("冬");

    private String info;

    // 默认私有且只能private
    private Season(String info) {
// 等价 Season(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return info;
    }
}
