package com.hp.Day08;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Test08 {
    /**
     * 通过控制台输入3个日期(yyyy-MM-dd格式)，然后转换为Date对象后存入
     * 集合，然后对该集合排序后输出所有日期。
     * @author Xiloer
     *
     */
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("输入三个日期: yyyy-MM-dd ");
        Scanner scanner = new Scanner(System.in);
        String d1 = scanner.nextLine();
        String d2 = scanner.nextLine();
        String d3 = scanner.nextLine();

        List<Date> list = new ArrayList();
       // Date date = new Date();
        try {
            Date bd1 = sdf.parse(d1);
            Date bd2 = sdf.parse(d2);
            Date bd3 = sdf.parse(d3);
            list.add(bd1);
            list.add(bd2);
            list.add(bd3);
            // 进行排序
            Collections.sort(list);
            System.out.println("list = " + list);
        } catch (ParseException e) {
            e.printStackTrace();
        }



    }
}
