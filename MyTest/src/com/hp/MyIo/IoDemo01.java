package com.hp.MyIo;

import java.io.File;
import java.io.IOException;

public class IoDemo01 {
    public static void main(String[] args) throws IOException {
        File  file = new File("io02.txt");  // 配置路径
        // 查看文件是否存在 一定要有这个代码 不然文件会被覆盖
        boolean  exists = file.exists();
        if (exists) {
            System.out.println("文件已经存在  " + exists);
        }else {
            System.out.println("文件不存在 " + exists);
            boolean newfile = file.createNewFile(); // 创建新文件
            System.out.println("文件创建成功" + newfile);
        }
        boolean isFile = file.isFile();
        System.out.println("是否是文件 " + isFile);
        boolean isDirectory = file.isDirectory();
        System.out.println("是否是目录 " + isDirectory);
        boolean hidden = file.isHidden();
        System.out.println("是否是隐藏文件" + hidden);

        System.out.println("file = " + file);
        String name =file.getName();
        System.out.println("name = " + name);
        long lenth = file.length();
        System.out.println("lenth = " + lenth);
        //文件删除
        if (exists ) {
            System.out.println("文件已存在 删除");
            file.delete();
        }
    }
}
