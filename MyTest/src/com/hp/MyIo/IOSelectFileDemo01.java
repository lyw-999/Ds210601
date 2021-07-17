package com.hp.MyIo;

import java.io.File;
import java.util.Arrays;

public class IOSelectFileDemo01 {
    private static long size = 0;
    public static void main(String[] args) {
        // 查询当前目录的 所有文件

        File file = new File("E\\test");
        long size =all(file);
        System.out.println("size = " + size+"字节");
         // 全部查看所有的文件

    }
    public static long all(File file){
        File[] files = file.listFiles();
        //long size = 0;
        for (File file1 : files) {
            if (file1.isDirectory()) {
                all(file1); // 进行递归
            }else{
                System.out.println("file1.length() = " + file1.length());
                 size +=file1.length();
            }
        }
        return size;
    }
}
