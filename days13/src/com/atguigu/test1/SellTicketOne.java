package com.atguigu.test1;

public class SellTicketOne extends Thread {
    private static int tickets = 100;
    // static静态属性方法区分配空间

    @Override
    public void run() {
        while(true){
            if(tickets <= 0){
                System.out.println("票告罄~~~~~~~~~~~~~~~~~~~~~");
                break;
            }

            // 模拟代码较长时---线程安全问题
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(this.getName()+"线程卖出一张票，"
                    +"当前剩余票数"+(--tickets)+"=====================");
            // 原因：有可能访问同一个tickets
            // 解决：同步锁机制
        }
    }
}
