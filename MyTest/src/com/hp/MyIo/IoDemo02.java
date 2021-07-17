package com.hp.MyIo;

import java.io.File;

/*
           file 的其他功能
     */
public class IoDemo02 {

    public static void main(String[] args) {
        // 创建文件夹,所有IO 底层都不是Java 操作的，而是Java 调用 所在系统的底层的操作.
        File file = new File("io");
        if(!file.exists()){
            // bu不加s 只能创建1层 加s可以多层 一般用s
            file.mkdir();
        }else {
            System.out.println(" 文件已存在" );
        }

        File file1 = new File("io1/io2/io3/io5");
        if(!file1.exists()){
            // bu不加s 只能创建1层 加s可以多层 一般用s
            file1.mkdir();
        }else {
            System.out.println(" 文件已存在" );
        }
    }
}
