package com.hp.zy;

import java.util.Scanner;

public class Test6 {
    /**
     * 要求用户输入一个计算表达式，可以使用加减乘除。
     * 只处理一次运算的，不要有连续加减乘除的表达式,且不做小数计算。(例:1+2+3)
     * 例如:
     * 1+2
     * 然后经过处理计算结果并输出:1+2=3
     */
    public static void main(String[] args) {
         System.out.println("输入一个计算表达式:例:1+2");
         Scanner scanner = new Scanner(System.in);
         String s = scanner.nextLine();
         String[] ss =new String[0];
        if (s.split("\\+").length >1){
            ss =s.split("\\+");
            Integer i1 = Integer.valueOf(ss[0]);
            Integer i2 = Integer.valueOf(ss[1]);
            System.out.println(i1 + i2);
        }else if (s.split("-").length >1){
            ss =s.split("-");
            Integer i1 = Integer.valueOf(ss[0]);
            Integer i2 = Integer.valueOf(ss[1]);
            System.out.println(i1 - i2);
        }else if (s.split("\\*").length >1){
            ss =s.split("\\*");
            Integer i1 = Integer.valueOf(ss[0]);
            Integer i2 = Integer.valueOf(ss[1]);
            System.out.println(i1 * i2);
        }else if (s.split("/").length >1){
            ss =s.split("/");
            Integer i1 = Integer.valueOf(ss[0]);
            Integer i2 = Integer.valueOf(ss[1]);
            if (i2 == 0) {
                System.out.println("除数不能为0");
            }
            System.out.println(i1 / i2);
        }else{
            System.out.println("你输入有误");
        }
    }
}
