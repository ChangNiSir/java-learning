package com.atguigu.test2;

public class SomeObject {
    public void methodOne(int i,int j){
        System.out.println(i+j);
    }

    public int methodTwo(int[] nums){
        int result = 0;
        for(int i = 0;i < nums.length; i++){
            result += nums[i];
        }
        return result;
    }

    // 变长参数组 jdk 1.5 (最后一项)
    // 普通参数(必须传参)  变长参数组(可有可无)
    public int methodThree(int... nums){
        int result = 0;
        for(int i = 0;i < nums.length; i++){
            result += nums[i];
        }
        return result;
    }
}
