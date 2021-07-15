package com.hp.Day07;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.MonthDay;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Test04 {
    //输入一个生产日期格式"yyyy-MM-dd",再输入一个数字(保质期的天数)。
    //然后经过计算输出促销日期，促销日期为:该商品过期日前2周的周三
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");


        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个生产日期: yyyy-MM-dd ");
        String scdate = scanner.nextLine();
        System.out.println("请输入一个 保质期的天数");
        long bzq = scanner.nextLong();
        // 字符串转为 日期
        Date scrq = sdf.parse(scdate);
        //  过期时间
        long outday = scrq.getTime()+ bzq;
        //   算出过期前两周
        long ddd = outday - (1000*60*60*24*7); //
        Calendar calendar = Calendar.getInstance();
        Date dddd = new Date(ddd);
        calendar.set(Calendar.DAY_OF_WEEK,Calendar.MONDAY);
      //  System.out.println("calendar = " + calendar.getTime( ));
        System.out.println("促销日是 " + dddd);
        //calendar.get(Calendar.DAY_OF_WEEK) - 1;


    }
}
