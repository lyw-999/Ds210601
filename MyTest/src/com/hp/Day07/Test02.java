package com.hp.Day07;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test02 {
    // 将当前系统时间以"yyyy-MM-dd HH:mm:ss"格式输出
    public static void main(String[] args) {
        Date date = new Date();
        String parrtn = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(parrtn);
        System.out.println(" 现在的系统时间是" + sdf.format(date));
    }
}
