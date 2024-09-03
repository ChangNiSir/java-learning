package com.atguigu.test2;

// 类是对象的类型，对象是类的值
public class Count {
    public int one;
    public int two;
    public String op;

    public int calc(){
        int result = 0;
        if("+".equals(op)){
            result = one + two;
        }else if("-".equals(op)){
            result = one - two;
        }else if("*".equals(op)){
            result = one * two;
        }else if("/".equals(op)){
            result = one / two;
        }
        return result;
    }
}
