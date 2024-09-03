package com.atguigu.test2;

public class TestThree {
    public static void main(String[] args) {
        // try-catch
        try{
        }catch(Exception e ){
            // |符号用于异常的“或”
        }

        // try-finally（不用）
        try{
        }finally{
            // 不能捕获异常无意义
        }

        // try-catch-finally
        try{
            System.out.println("in try");
            String s = "OK";//null;
            s.equals("");
            System.out.println("end try");
            //return;  // main方法返回
            // System.exit(0); // 正常结束进程
        }catch(Exception e){
            System.out.println("in catch");
            e.printStackTrace();
            // 多线程并行（异常打印位置不确定）
        }finally {
            // 一定执行finally块（return结束finally块也执行）
            // finally块可用于释放资源
            System.out.println("in finally");
        }
        System.out.println("程序结束");

    }
}
