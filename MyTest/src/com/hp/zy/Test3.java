package com.hp.zy;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        /*
         * 编写一个回文字符串，然后调用check方法检查
         * 该字符串是否为回文，然后输出检查结果。
         * 若是回文则输出:是回文
         * 否则输出:不是回文
         */
            check("12345");
    }
    public static void check(String str) {
        int l = str.length();
        if (l % 2 == 0) {
            System.out.println(str + " 不是回文数");
            exit();
        } else {
            int l1 = (l / 2  );
          //  System.out.println("str = " + str.substring(0,l1+1));
            String str1 = str.substring(l1,l);
          //System.out.println("str1 = " + str1);
            if (str.substring(0,l1+1).equals(reverse1(str1))) {
                System.out.println(str + " 是回文数");
            } else {
                System.out.println(str + " 不是回文数");
            }
        }
    }

    private static void exit() {
    }

    public static String reverse1(String str) {
        return new StringBuffer(str).reverse().toString();
    }
}
