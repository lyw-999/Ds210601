package com.hp.zyy.Day09;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class Test06 {
    /**
     * 获取并输出当前目录下所有文件的名字
     * @author Xiloer
     *
     */
    public static void main(String[] args) {
        File file = new File("E\\");
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isDirectory()) {
                System.out.println("file1 = " + file1);
            }
        }
    }
//        public static void getAllFileName(String path ) {
//            File file = new File(path);
//            File [] files = file.listFiles();
//            for (File file1 : files) {
//                if (file1.isFile()) {
//                    System.out.println("file1 = " + file1);
//                }
//            }

//                fileName.addAll(Arrays.asList(names));
//            for(File a:files)
//            {
//                if(a.isDirectory())
//                {
//                    getAllFileName(a.getAbsolutePath(),fileName);
//                }
//            }
}
