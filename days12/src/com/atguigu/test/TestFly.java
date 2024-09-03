package com.atguigu.test;

public class TestFly {
    public static void main(String[] args) {

        // 引用/对象名
        Fly fly = new Fly() {

            // {} 是接口实现类(匿名main方法局部内部类)
            // new 是创建匿名内部类的对象----有名、匿名

            @Override
            public void flying() {
                System.out.println("in Flying one");
            }
        };
        fly.flying();

        System.out.println("-----------------------");
        new Fly() {
            @Override
            public void flying() {
                System.out.println("in Flying two");
            }
        }.flying();

        System.out.println("------------------------");
        RunFly runFly = new RunFly();
        Fly fly1 = new Fly() {
            @Override
            public void flying() {
                System.out.println("in Flying three");
            }
        };
        runFly.runFly(fly1);

        System.out.println("---------------------------");
        runFly.runFly(new Fly() {
            @Override
            public void flying() {
                System.out.println("in Flying four");
            }
        });
    }
}

class RunFly{
    public void runFly(Fly fly){
        fly.flying();
    }
}