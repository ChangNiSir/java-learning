package com.atguigu.test;

// 自定义线程类继承Thread线程父类---单继承（父类）多实现（接口）
// 重写run()
public class MyThreadOne extends Thread {
    public MyThreadOne(){
    }
    public MyThreadOne(String info){
        super(info);
    }
    @Override
    public void run() {
        // 开启的子线程的执行代码
        for(int i = 0; i < 100; i++){
            // getName()：返回当前线程的线程名
            System.out.println(this.getName()+"："+i+"~~~~~~~~~~~~~~~~~~~~~~~~");
        }
    }
}
