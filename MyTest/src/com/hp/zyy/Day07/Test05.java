package com.hp.zyy.Day07;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Test05 {
    /**
     * 实现时间的计算: 要求用户输入身份证号，若格式有误，要求其重新输入。然后根据身份证号码输出20岁生日
     * 所在周的周三的日期。
     * 例如:
     * 出生日期:1992-07-15。
     * 20岁生日:2012-07-15
     * 当周的周三为:2012-07-18
     */
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入你的身份证号");
         String idcard = scanner.nextLine();
        Calendar calendar = Calendar.getInstance();

        if (idcard.length() != 18) {
            System.out.println("输入长度错误");
        }else {
         String  birth = idcard.substring(6,14);
            //System.out.println("birth = " + birth);
            Date bir = sdf.parse(birth);
            System.out.println(" 出生日期为: " + sdf1.format(bir));
            calendar.setTime(bir);
            // 增加 20年   二十岁生日
            calendar.add(Calendar.YEAR,20);
            System.out.println("二十岁生日: "+calendar.getTime());
        }
    }
}
