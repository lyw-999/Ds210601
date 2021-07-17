package com.hp.thread;
    /*
        创建线程的第二种方式,不用继承 用实现
     */
public class ThreadDemo02 {
        public static void main(String[] args) {
        Runnable sc = new Xicai();
        Runnable ss = new ShaoShui();

        Thread scT = new Thread(sc);
        Thread ssT = new Thread(ss);

        scT.start();
        ssT.start();
        }
}
class Xicai implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <110; i++) {
            System.out.println("洗菜" + i);
        }
    }
}
class ShaoShui implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <110; i++) {
            System.out.println("烧水" + i);
        }
    }
}

