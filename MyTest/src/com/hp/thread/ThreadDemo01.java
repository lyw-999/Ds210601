package com.hp.thread;
    /*
    *   线程...
    *
    *   创建线程的 第一种方式. 缺点:直接extend Thread 那么浪费了一次继承的机会.
     */
public class ThreadDemo01 {
    public static void main(String[] args) {
        Thread t1 = new HotWaterThread();   //烧水的线程
        Thread t2 = new Washingvegetables();   // 洗菜的线程
        t1.start();
        t2.start();
        // 像这样 两个方法交互输出  那么 这就叫做 异步 ajax也是异步的
        // 如果是  一个完成之后,在完成另一个 这个叫做同步 同步是有先后顺序的
    }
}
// 如果只单单 new Thread 他只是一个线程, 线程中没有方法(任务),没有意义。
// 需要自己创建一个线程继承他的方法（任务）  线程有run方法 才有意义!!!!
 class HotWaterThread extends Thread{
    @Override
    public void run() {
        for (int i = 1; i < 110; i++) {
            System.out.println("烧了" + i+"瓶水");
        }
    }
}
class   Washingvegetables extends Thread{
    @Override
    public void run() {
        for (int i = 1; i < 110; i++) {
            System.out.println("洗了" + i+"颗菜");
        }
    }
}
