package com.hp.Day07;

import java.util.Date;

public class Test01 {
    //使用Date输出当前系统时间，以及3天后这一刻的时间
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("现在系统的时间 " + date);
        long time = date.getTime();
        //计算三天后的 long值
        long a =  (1000*60*60*24*3L);
        date.setTime(time+a);
        System.out.println("三天后的日期 " + date);
    }
}
