package com.hp.zyy.Day09;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test01 {
    /**
     * 通过File输出当前项目目录下的文件"myfile.txt"的名字，大小，最后修改时间。
     * 最后修改时间格式如:2016-03-23 14:22:16
     * @author Xiloer
     *
     */
    public static void main(String[] args) {
        //定义时间格式
        String pattern1 = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern1);

        File file = new File("myfile.txt");
        // 最后修改时间的 long 值
        long time = file.lastModified();
        Date date = new Date(time);
        String lastTime = sdf.format(date);
        System.out.println("文件名称" + file.getName());
        System.out.println("文件大小 " + file.length());
        System.out.println("文件最后修改时间 " + lastTime);
    }
}
