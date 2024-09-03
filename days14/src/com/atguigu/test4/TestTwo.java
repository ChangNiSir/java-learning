package com.atguigu.test4;
// math包
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class TestTwo {
    public static void main(String[] args) {
        // 超过long的整数保存---BigInteger类
        BigInteger b1 = new BigInteger("892034980529802958324098");
        BigInteger b2 = new BigInteger("879454594564894546548945");
        System.out.println(b1.add(b2));
        System.out.println(b1.subtract(b2));// +
        System.out.println(b1.multiply(b2));// *
        System.out.println(b1.divide(b2));// /
        System.out.println(b1.remainder(b2));// %

        System.out.println("------------------------");
        // 任意精度浮点数保存---BigDecimal类
        // 精确浮点运算
        BigDecimal b3 = new BigDecimal("1156464546465.4645645");
        BigDecimal b4 = new BigDecimal("4564645464566.4646454");
        System.out.println(b3.add(b4));
        System.out.println(b3.subtract(b4));
        System.out.println(b3.multiply(b4));
        System.out.println(b3.divide(b4, RoundingMode.DOWN)); // 舍入模式（枚举类）



    }
}
