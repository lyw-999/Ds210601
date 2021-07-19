package com.hp.zyy.Day06;

/**
 * 1:输出字符串"HelloWorld"的字符串长度
 * 2:输出"HelloWorld"中"o"的位置
 * 3:输出"HelloWorld"中从下标5出开始第一次出现"o"的位置
 * 4:截取"HelloWorld"中的"Hello"并输出
 * 5:截取"HelloWorld"中的"World"并输出
 * 6:将字符串"  Hello   "中两边的空白去除后输出
 * 7:输出"HelloWorld"中第6个字符"W"
 * 8:输出"HelloWorld"是否是以"h"开头和"ld"结尾的。
 * 9:将"HelloWorld"分别转换为全大写和全小写并输出。
 *
 *
 */
public class Test {
    public static void main(String[] args) {
        String s = "HelloWorld";

        //1:输出字符串"HelloWorld"的字符串长度
        test1(s);
        //2:输出"HelloWorld"中"o"的位置
         test2(s);
        //3:输出"HelloWorld"中从下标5出开始第一次出现"o"的位置
        test3(s);
        //4:截取"HelloWorld"中的"Hello"并输出
        test4(s);
        //5:截取"HelloWorld"中的"World"并输出
        test5(s);
        //6:将字符串"  Hello   "中两边的空白去除后输出
        test6(s);
        //7:输出"HelloWorld"中第6个字符"W"
        test7(s);
        // 8:输出"HelloWorld"是否是以"h"开头和"ld"结尾的。
        //判断是否  以什么字符开头 以什么字符结尾
        test8(s);
        //9:将"HelloWorld"分别转换为全大写和全小写并输出。
        test9(s);
    }

    private static void test9(String s) {
        System.out.println("全部转为小写"+s.toLowerCase());
        System.out.println("全部转为大写"+s.toUpperCase());
    }

    private static void test8(String s) {
        boolean H = s.startsWith("H");
        System.out.println("H = " + H);
        boolean ld = s.endsWith("ld");
        System.out.println("ld = " + ld);
    }

    private static void test7(String s) {

        System.out.println(s.charAt(5));
    }

    private static void test6(String s) {
        String s1 = "  Hello   ";
        System.out.println(s1.trim());
    }

    private static void test5(String s) {

        System.out.println(s.substring(5,10));
    }

    private static void test4(String s) {

        System.out.println(s.substring(0,5));
    }

    private static void test3(String s) {
        int i = s.indexOf("o",5);
        System.out.println("i = " + i);
    }

    private static void test2(String s) {

        System.out.println(s.indexOf("o"));
    }

    private static void test1(String s) {

        System.out.println(s+"的长度是" +s.length());
    }
}
