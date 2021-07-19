package com.hp.zyy.Day10;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test02 {
    public static void main(String[] args) {
        File file = new File("F:/Java");
        test(file);
    }

    private  static  void test(File file){
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isDirectory()) {
                test(file1);
            }else  if(file1.isFile()){
                String[] spilt =file1.getName().split("\\.");
                boolean jjj = spilt[spilt.length - 1 ].equals("java");
                boolean ccc = spilt[spilt.length - 1 ].equals("class");
                if (ccc || jjj) {
                    System.out.println("file1 = " + file1.toString());
                }
            }
        }
    }
 }
    