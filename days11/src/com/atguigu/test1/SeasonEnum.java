package com.atguigu.test1;

// JDK 1.5之后的枚举

// 继承自Enum类
public enum SeasonEnum {

//    SPRING,SUMMER,AUTUMN,WINTER;

    SPRING("春"),
    SUMMER("夏"),
    AUTUMN("秋"),
    WINTER("冬");
    private String info;

//    public String getInfo() {
//        return info;
//    }

    private SeasonEnum(String info) {
        this.info = info;
    }
//
//    @Override
//    public String toString() {
//        return "SeasonEnum{" +
//                "info='" + info + '\'' +
//                '}';
//    }

}
