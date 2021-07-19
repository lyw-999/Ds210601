package com.hp.zyy.Day10;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

public class Test03 implements Runnable{
    // 使用控制台 在控制台 做一个动态的时间 2021-07-17 23:25:23
    public static void main(String[] args) {

            Test03 test = new Test03();
            Thread thread = new Thread(test);
            thread.start();
        }
        @Override
        public void run() {
            while (true) {
                //while(true)为死循环，会一直循环输出时间，可定义int i = 10调整输出数据数量。
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO 自动生成的 catch 块
                    e.printStackTrace();
                }
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Date date = new Date();

                String time =  simpleDateFormat.format(date) ;
                System.out.println(time);
            }
        }}