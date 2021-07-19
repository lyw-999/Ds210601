package com.hp.thread;

public class Tt {
    public static void main(String[] args) {
//		TrainTicket tt = new TrainTicket();
        new Thread(new TrainTicket()).start();
        new Thread(new TrainTicket()).start();
    }
}

class TrainTicket implements Runnable {
    private int ticketCount = 10; // 初始化10张火车票(全局变量)
    @Override
    public void run() {
        while (ticketCount > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "抢到了第【" + (10 - ticketCount + 1) + "】张火车票");
            ticketCount--;
        }
    }}