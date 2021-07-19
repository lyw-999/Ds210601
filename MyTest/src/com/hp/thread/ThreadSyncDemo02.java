package com.hp.thread;

/**
 * synchronize锁 尽量锁在 范围小的位置上
 * 越小 效率也高
 *
 * synchronize 所在方法shang,那么 如果方法中有可以多个线程共同使用的,那会造成 锁的浪费.
 */
public class ThreadSyncDemo02 {
    public static void main(String[] args) {
        Shop shop =new Shop();
        Thread t1 = new Thread(){
            @Override
            public void run(){
                try {
                    shop.buy();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run(){
                try {
                    shop.buy();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        t1.start();  t2.start();
    }

}



class Shop{
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
}
