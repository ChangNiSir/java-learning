//实体类

package com.atguigu.test1;

public class SomeObject {
    public void methodOne(int one,int two){
        System.out.println("one="+one+",two="+two);
        int temp = one;
        one = two;
        two = temp;
        System.out.println("one="+one+",two="+two);
    }
    public void methodTwo(MyNumber mn){
        System.out.println("mn.a="+mn.a+",mn.b="+mn.b);
        int temp = mn.a;
        mn.a = mn.b;
        mn.b = temp;
        System.out.println("mn.a="+mn.a+",mn.b="+mn.b);
    }

}

class MyNumber{
    public int a;
    public int b;
}
