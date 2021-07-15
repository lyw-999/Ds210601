package com.hp.Day07;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Test03 {
    //  输入某人生日，格式为"yyyy-MM-dd"，输出到现在为止经过了多少周。
    public static void main(String[] args) throws ParseException {
          SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
          System.out.println("输入你的生日格式为: yyyy-MM-dd ");
          Scanner scanner = new Scanner(System.in);
          String birthDay = scanner.nextLine();

          Date bd = sdf.parse(birthDay);
          Date date = new Date();
          long time = date.getTime() - bd.getTime();
          long day = time / 1000 / 60 / 60 / 24; //
          long week=day/7;
          System.out.println("到现在为止经过了" + week+"周");

    }
}
