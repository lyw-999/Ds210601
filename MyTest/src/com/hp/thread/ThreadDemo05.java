package com.hp.thread;

/**
 *  线程的打断
 */
public class ThreadDemo05 {
    public static void main(String[] args) {

        Thread eat = new Thread(new Runnable() {
            @Override
            public void run() {
                int i =0;
                while (true){
                    try{
                    System.out.println(" 快快乐乐吃兵线 "+i);
                    i++;
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        if (e.getMessage().equals("sleep interrupted")) {
                            System.out.println("让你别吃 别吃");
                            break;
                        }
                        e.printStackTrace();
                    }
                } catch (Exception e) {

                    e.printStackTrace();
                }
                }

            }
        });
        eat.start();

        Thread donteat = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                    eat.interrupt(); // 别吃
                    System.out.println("别吃 别吃 别吃");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });

        donteat.start();
    }
}
