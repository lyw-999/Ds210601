package com.hp.thread;

public class ThreadTest {
    private static  int i =0;
    public static void main(String[] args) {

        while(true){
            new Thread(){
                @Override
                public void run(){
                    for (int i = 0; i < 110; i++) {
                        System.out.println("烧水" + i);
                        System.out.println("i++ = " + i++);
                    }
                }
            }.start();
        }
    }
}
