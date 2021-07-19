package com.hp.thread;

import java.util.Random;

/**
 *  线程的打断
 *  打断 针对 线程的 sleep 来讲的
 *
 *
 */
public class ThreadDemo04 {
    public  static int time =4; //炸弹的倒计时
    public  static int  password = new Random().nextInt(5);//拆炸弹的密码
    public static boolean boom =true;

    public static void main(String[] args) {
        System.out.println("炸弹的密码是" + password);

        //第一个线程:    炸弹的倒计时,如果完成倒计时 就爆炸
        Thread boomThread = new Thread(){
            @Override
            public void run() {
                // 炸弹的 倒计时
                System.out.println("对方已在B区 安放C4");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                while(time>=0){
                try {
                    if (time == 0) {
                        System.out.println("C4 已经爆炸 获得胜利");
                        boom = false;
                        break;
                    }

                    time--;//
                    System.out.println("倒计时" + time);
                    Thread.sleep(1000);
                } catch (Exception e){

                    if(e.getMessage().equals("sleep interrupted")){
                        System.out.println("拆弹成功  ");
                        break;
                    }

                    e.printStackTrace();
                }
                }
            }
        };

        //第二个线程:    是打断线程的倒计时, 如果打断了 就不爆炸

        Thread policeThread = new Thread(new Runnable() {
            @Override
            public void run() {
                // 警察负责拆炸弹, 因为是模拟 打断 boomThread 就可以了
                System.out.println("警察开始拆炸弹!!!" );
                while (boom){
                    if (password == new Random().nextInt(5)){
                        boomThread.interrupt(); // 这个是线程打断.
                        break;
                    }
                }
            }
        });

        boomThread.start();
        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        policeThread.start();
    }
}
