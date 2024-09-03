package com.atguigu.test1;

public class TestFour {
    public static void main(String[] args) {
        // 指定元素新增元素
        int[] one = {65, 39, 28, 71, 69, 0, 0};
        int index1 = 2;// 新增元素下标
        int index2 = -1;// 第一个空位下标
        int newNum = 101;
        for(int i = 0; i < one.length; i++){
            if(one[i] == 0){
                index2 = i;
                break;
            }
        }
        if(index1 >= 0 && index1 <= index2){// 新增下标合法
            for(int i = index2; i > index1; i--){
                one[i] = one[i-1];
            }
            one[index1] = newNum;
            for(int i : one){
                System.out.println(i);
            }
        }else{
            System.out.println("请输入合法的新增下标");
        }

    }
}
