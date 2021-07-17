package com.hp.zyy.Day09;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Test03 {
    /**
     * 要求用户输入一个目录名并使用File在当前目录下创建出来。
     * 若该目录已经存在，则提示用户该目录已经存在。并创建副本，原则与第二题一致。
     * @author Xiloer
     *
     */
    public static void main(String[] args) throws IOException {
        System.out.println(" 输入一个目录名" );
        Scanner scanner = new Scanner(System.in);
         String s = scanner.nextLine();
            File file = new File(s);
        boolean isDirectory = file.isDirectory();
        boolean exists = file.exists();
        if (file.exists() && isDirectory == true) {
            //   System.out.println("文件已经存在,为你创建副本  ");
            for (int i = 1; i < 10; i++) {
                File filei = new File(  file.getName().split(".")+"_副本"+i);
                boolean newfile1 = filei.createNewFile(); // 创建副本
                System.out.println("文件已存在以为你创建副本" + filei);
                break;

            }
        }else {
            System.out.println("文件不存在 " + exists);
            boolean newfile = file.createNewFile(); // 创建新文件
            System.out.println("文件创建成功" + newfile);
        }
    }
}
