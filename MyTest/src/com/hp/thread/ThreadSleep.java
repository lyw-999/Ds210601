package com.hp.thread;

public class ThreadSleep {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 30; i++) {
            Thread.sleep(2); // 线程的阻塞
            System.out.println("访问中国电信" + i+"次");
        }
        // 其实main 方法就是一个线程. 是一个 主线程
        Thread thread = Thread.currentThread();// 拿到当前的线程
        String name = thread.getName();   // 线程的名字
        System.out.println("name = " + name);
        long id =thread.getId();          // 线程的唯一id
        System.out.println("id = " + id);
        boolean daemon = thread.isDaemon(); // 是否守护线程
        System.out.println("daemon = " + daemon);
        int priority = thread.getPriority();  // 线程的优先级  默认为5
        System.out.println("priority = " + priority);
        boolean alive = thread.isAlive();   // 线程是否活着
        System.out.println("alive = " + alive);
    }
}
