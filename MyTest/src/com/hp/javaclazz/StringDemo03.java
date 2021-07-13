package com.hp.javaclazz;
//String 类的常用API
public class StringDemo03 {
    public static void main(String[] args) {
        String  str = "thinking in java"; //Java编程思想
        //查询 10 的字符的内容
        char c =str.charAt(10);
        System.out.println("c = " + c);
       int lenth = str.length();  // lenth()是个方法 ， 数组的长度是个属性
        System.out.println("lenth = " + lenth);
        
        char [] chars = str.toCharArray();  //应用点: 应用在对数据的加密
        int x = chars.length;       //数组不带 圆括弧
        System.out.println("x = " + x);
        for (char aChar : chars) {
            System.out.println("aChar = " + aChar);
        }
        // 查找给定的字符串的位置
        // 如: 查找in的位置 , 查找出来的是第一次出现的位置
       int i = str.indexOf("in");
        System.out.println("i = " + i);
        //从指定位置 开始检索
        int i1 =  str.indexOf("in",3);
        System.out.println("i1 = " + i1);
        // 也可以检索最后一次出现的位置
        int i2 = str.lastIndexOf("in");
        System.out.println("i2 = " + i2);

        String  str1 = "thinking in java"; //Java编程思想
        //判断是否  以什么字符开头 以什么字符结尾
        boolean th = str1.startsWith("th");
        System.out.println("th = " + th);
        boolean va = str1.endsWith("va");
        System.out.println("va = " + va);

        String  str2 = "www.csdn.com"; //Java编程思想
        String sub = str2.substring(4,8);
        System.out.println("sub = " + sub);

        // 把 数字转换成 字符串
        int cc = 110;
        String s = String.valueOf(cc);
        System.out.println("s = " + s+1);

        //split()  分割数组
        String cm = "com.hp.test";
        String [] ss=cm.split("\\.");
        for (String s1 : ss) {
            System.out.println("s1 = " + s1);
        }
        //数据的替换
        String tm ="t,闪电侠";
       String tma = tm.replaceAll("[a-zA-Z0-9]","甜蜜的");
        System.out.println("tma = " + tma);

        //数据包含
        String tm1 = "你还在不在";
        boolean ds = tm1.contains("不在");
        System.out.println("ds = " + ds);
    }
}
