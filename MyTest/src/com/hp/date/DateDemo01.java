package com.hp.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo01 {
    /*
        日期类的层是 有一个long值  学名UTC时间
        日期类 调用 util下的包
    1970 年 1月1日 00:00:00 开始 计算机时间元年
    这个 日期类 功能有限, 如需日期计算,需要使用 日历类解决！！
 */
    public static void main(String[] args) {
        // 定义一个日期
        Date date = new Date();
        System.out.println("当前日期是 " + date); // date = Wed Jul 14 09:46:28 GMT+08:00 2021
        // toString()被改写了

        long time = date.getTime(); //获得 真实的的时间，long值
        System.out.println("time = " + time);
        //计算十天后的long值
        long a =  (1000*60*60*24*10L);
        date.setTime(time+a);
        System.out.println("十天后的日期 " + date);

        //修改 日期显示格式  yyyy-MM-dd HH:mm:ss.  日期转成字符串
        String pattern = "yyyy-MM-dd HH:mm:ss";
        String pattern1 = "yyyy/MM/dd HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern1);
        String ChinaTime = sdf.format(date);
        System.out.println("ChinaTime = " + ChinaTime);
        // 字符串 转 日期
        String datestr = "2021-8-15 23:23:240";
        try {
            Date parse = sdf.parse(datestr);
            System.out.println("parse = " + parse);
        } catch (ParseException e) {
            System.out.println("格式错误 请用心输入");
            e.printStackTrace();
        }
    }
}
