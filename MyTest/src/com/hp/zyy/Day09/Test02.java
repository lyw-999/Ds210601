package com.hp.zyy.Day09;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Test02 {
    /**
     * 要求用户输入一个文件名并使用File在当前目录下创建出来。
     * 若该文件已经存在，则提示用户该文件已经存在。并创建该文件副本：
     * 例如:用户输入"test.txt".若该文件已存在，提示用户存在后，创建名为：test_副本1.txt 的文件
     * 若该文件也存在了，则创建名为:test_副本2.txt 的文件，以此类推
     * @author Xiloer
     *
     */
    public static void main(String[] args) throws IOException {
        System.out.println("输入一个文件名例如 test");
            Scanner scanner = new Scanner(System.in);
             String s = scanner.nextLine().trim();
             File file = new File(s+".txt");
             boolean exists = file.exists();
        if (file.exists()) {
             //   System.out.println("文件已经存在,为你创建副本  ");
            for (int i = 1; i < 10; i++) {
                File filei = new File(  s+"_副本"+i+".txt");
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
