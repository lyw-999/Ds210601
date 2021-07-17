package com.hp.thread;

    /*
    线程创建的 最优的使用  匿名内部类.
    线程的创建第三种方式
     */
public class ThreadDemo03 {
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run(){
                for (int i = 0; i < 110; i++) {
                    System.out.println("洗菜" + i);
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run(){
                for (int i = 0; i < 110; i++) {
                    System.out.println("烧水" + i);
                }
            }
        }.start();
        // 练习 : 测试自己电脑开启多少个线程
    }
}
