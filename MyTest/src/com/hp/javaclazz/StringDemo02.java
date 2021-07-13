package com.hp.javaclazz;

public class StringDemo02 {
    /*
    测试 String类的性能   总结:  频繁修改字符串，会造成性能损失 需要 stringBuffer/Build
    String ,StringBuild , StringBuffer
    java.lang.OutOfMemoryError  字符溢出异常
     */
    public static void main(String[] args) {
        String str="a";
        System.out.println(System.currentTimeMillis()); //当前日期的 long值
        long l = System.currentTimeMillis();
        for (int i = 0; i <30; i++) {
            str +=str; //测试频繁修改字符串
            System.out.println("str = " + str);
        }
        System.out.println(System.currentTimeMillis()-l);//当前日期的 long值
    }
}
