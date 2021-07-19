package com.hp.thread;

    //  互斥锁  两个线程互不干扰
public class ThreadSyncDemo04 {
    public static void main(String[] args) {
        Shop2 shop2 = new Shop2();
        Thread t1 = new Thread(){
            @Override
            public void run(){
                try {
                    shop2.buy();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run(){
                try {
                    shop2.buy1();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        t1.start();  t2.start();
    }

}



class Shop2{
    // 如果不加上 synchronize 锁 会出事
    public  void buy() throws InterruptedException {
        Thread thread = Thread.currentThread();

        System.out.println(thread.getName()+"正在选衣服" );
        Thread.sleep(5000);
        synchronized(this){  // 使用synchronize块 , 锁在关键位置
            System.out.println(thread.getName()+" 进入试衣间  试衣服");
            Thread.sleep(5000);
            System.out.println("试衣服结束  over" );
        }

    }
    // 买冰淇淋 需要排队
    public  synchronized void buy1() throws InterruptedException {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName()+"买冰淇淋" );
    }
}

