package com.hp.thread;

    /*
        多个线程同时操作一个资源诞生的  安全问题
        比如: 多个账户抢票
     */
public class ThreadSyncDemo01 {
    public static void main(String[] args) {
        Tickets tickets = new Tickets();

        Thread t1 = new Thread(){
            @Override
            public void  run(){
                // 模拟黄牛1 取票
                while (true){
                        int ticket = tickets.getTicket();
                        Thread.yield();
                    System.out.println("t1"+"线程拿了 " + ticket+"票");
                }
            }
        };

        Thread t2 = new Thread(){
            @Override
            public void  run(){
                // 模拟黄牛2 取票
                while (true){
                    int ticket = tickets.getTicket();
                    Thread.yield();
                    System.out.println("t2"+"线程拿了 " + ticket+"票");
                }
            }
        };

        t1.start();t2.start();
    }
}
class Tickets{
    private int ticket = 20;
    public int getTicket(){
        if (ticket == 0) {
            System.out.println("票被抢完了");
            throw new RuntimeException("票没有了");
        }
        Thread.yield(); // 线程的让一让
        return ticket--;
    }
}
