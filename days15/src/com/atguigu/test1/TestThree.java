package com.atguigu.test1;

public class TestThree {
    public static void main(String[] args) {

        // 数组删除元素
        //int[] one = {65, 39, 28, 71, 69, 0, 0, 0};
        //int index = 2;// 注意index：[0, 5)（找到第一个空元素下标for循环不需要）
        //for(int i = index; one[i] != 0; i++){
        //    one[i] = one[i+1];
        //}
        //for(int value : one){
        //    System.out.print(value+" ");
        //}

        // 数组删除元素
        int[] one = {65, 39, 28, 71, 69, 0, 0, 0};
        int index1 = 2;
        int index2 = -1;// 第一个为0下标
        for(int i = 0; i < one.length; i++){
            if(one[i] == 0){
                index2 = i;
                break;
            }
        }
        for(int i = index1; i < index2; i++){
            one[i] = one[i+1];
        }
        for(int value : one){
            System.out.print(value+" ");
        }
    }
}
