package com.hp.javaclazz;
    /*

     StringBuilder 对性能的影响
     */
public class StringBuilderDemo2 {
    public static void main(String[] args) {
        String str="a";
        StringBuilder xsb = new StringBuilder();
        long l = System.currentTimeMillis();
        for (int i = 0; i <30; i++) {
           xsb.append(str);
            System.out.println("xsb = " + xsb);
        }
        System.out.println(System.currentTimeMillis()-l);//当前日期的 long值
    }
}
