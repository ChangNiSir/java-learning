package com.atguigu.test2;

public class Outer {
    private int three;
    private static int four;


    // ---------------------成员内部类----------------------//

    // -----------------普通成员内部类--------------------------
    public class Inner{
        // 不能声明静态成员
        private int one;
        // private static int two;
        public void methodThree(){
            System.out.println(one);
            System.out.println(three);
            System.out.println(four);
        }

    }

    // ---------------静态成员内部类--------------------
    public static class Inner1{

        // 静态成员内部类只能访问外部类的静态成员
        private int one;
        private static int two;

        public void methodThree(){
            System.out.println(one);
            System.out.println(two);
            // System.out.println(three);
            System.out.println(four);
        }

        // 静态方法只能访问静态成员
        public static void methodFour(){
            System.out.println(two);
        }

    }



    // ---------------匿名内部类------------------
    public void methodOne(){

        int five = 0;

        // -------------局部内部类 随方法结束退出
        class Inner2{
            private int one;
         //   private static int two;

            public void methodThree(){
                int six = 0;
                System.out.println(one);
                System.out.println(three);
                System.out.println(four);
                System.out.println(five);
                System.out.println(six);
            }

        }
         Inner2 inner2 = new Inner2();
    }


    public static void methodTwo(){
        Inner1 inner1 = new Inner1();
    }
}

