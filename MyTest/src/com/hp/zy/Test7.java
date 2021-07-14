package com.hp.zy;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        String st ="www.cc.com.cn";
        cn(st);
    //    StringBuffer sr = new StringBuffer();
     //   String s=str.replace("www.","");
      //  String ss=s.replace(".com.cn","");

    }

    private static void cn(String st) {
        String s = st.replace("www.", "");
        String s1 = s.replace(".com","");
        String ss = s.replace(".com.cn", "");
        if (s.contains(".com") == true) {
            System.out.println("s1 = " + s1);
        }else {
            System.out.println(ss);
        }
    }
}
