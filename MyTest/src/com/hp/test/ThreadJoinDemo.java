package com.hp.test;

class MyThread4 implements Runnable{ // 实现Runnable接口
    public void run(){  // 覆写run()方法
        for(int i=0;i<20;i++){
            System.out.println(Thread.currentThread().getName()
                    + "运行，i = " + i) ;  // 取得当前线程的名字
        }
    }
};
public class ThreadJoinDemo{
    public static void main(String args[]){
        MyThread4 mt = new MyThread4() ;  // 实例化Runnable子类对象
        Thread t = new Thread(mt,"线程");     // 实例化Thread对象
        t.start() ; // 启动线程
        for(int i=0;i<20;i++){
            if(i>10){
                try{
                    t.join() ;  // 线程强制运行
                }catch(InterruptedException e){
                }
            }
            System.out.println("Main线程运行 --> " + i) ;
        }
    }
};