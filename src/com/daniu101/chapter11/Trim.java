package com.daniu101.chapter11;

public class Trim {
    public static void main(String[] args) {

        String str =" 你好 我好 ";
        System.out.println(str);
        // 去除前后空格  输出
        String  str2 =str.trim();
        System.out.println(str2);
        //研究一个方法: 返回类型 void
        String a =" 芜 湖 芜 湖 ";
        System.out.println(a);
        String  b =a.trim();
        System.out.println(b);
    }
}
