package com.atguigu.test1;

public class CalcScore {
    public int calcSum(int lang,int math,int english){
        int result = 0;
        result = lang + math + english;
        return result;
    }
    public int calcAvg(int lang,int math,int english){
        int result = 0;
        // 同一个类的方法可以直接互相调用
        // 当前类对象 this可省略
        result = this.calcSum(lang,math,english) / 3;
        return result;

    }
}
