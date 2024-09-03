package com.atguigu.test;

import org.junit.Test;

public class Outer {
    private int one = 100;
    private static int two = 200;


    public static class Inner{
        private int three = 300;
        private static int four = 400;

        @Test
        public void methodOne(){
            System.out.println(two);
            System.out.println(three);
            System.out.println(four);
        }


        public static void methodTwo(){
            System.out.println(two);
            System.out.println(four);
        }

    }

    @Override
    public String toString() {
        @SuppressWarnings("unused")
        int i = 100;
        return super.toString();
    }
}
