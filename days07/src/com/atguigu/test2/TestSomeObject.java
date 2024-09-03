package com.atguigu.test2;

public class TestSomeObject {
    public static void main(String[] args) {
        SomeObject so = new SomeObject();
        so.methodOne(100,200);

        int[] nums = {100,200,300};
        int result = so.methodTwo(nums);
        System.out.println(result);

        // 客户舒服
        // 变长参数组方便调用点调用
        int result1 = so.methodThree(100,200,300,400);
        System.out.println(result1);
    }
}
