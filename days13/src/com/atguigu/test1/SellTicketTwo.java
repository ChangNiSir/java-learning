package com.atguigu.test1;

public class SellTicketTwo extends Thread {
    // static静态属性方法区分配空间
    private static int tickets = 100;
    // 锁对象必须唯一(不是三个锁对象)
    private static Object lock = new Object();
    @Override
    public void run() {
        // 窗口卖票
        while (true) {
            // 效率低安全性高
            synchronized (lock) { // 同步代码块使用共享锁
                if (tickets <= 0) {
                    System.out.println("票告罄~~~~~~~~~~~~~~~~~~~~~");
                    break;
                }
                // 模拟代码较长时---线程安全问题
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(this.getName() + "线程卖出一张票，"
                        + "当前剩余票数" + (--tickets) + "=====================");
                // 原因：有可能访问同一个tickets
                // 解决：同步锁机制
            }


        }
    }
}
