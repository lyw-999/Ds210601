package com.hp.zyy.Day06;

import java.util.Random;
import java.util.Scanner;

public class Test5 {
    /**
     * 随机生成一个5位的英文字母验证码(大小写混搭)
     * 然后将该验证码输出给用户，然后要求用户输入该验证码，大小写不限制。
     * 然后判定用户输入的验证码是否有效(无论用户输入大小写，只要字母都正确即可)。
     *
     *
     */
    public static void main(String[] args) {

        yz();
    }
    private static boolean yz() {
        //调用随机数方法
        Random random = new Random();
        String yzm="";
        for (int i = 0; i <5 ; i++) {
            int a =random.nextInt(10)>5?random.nextInt(26)+97:random.nextInt(26)+65;
            char d=(char)a;
            String ss =String.valueOf(d);
            yzm+=ss;
        }
        System.out.println("请输入验证码= " + yzm);
        Scanner scanner = new Scanner(System.in);
        String sc = scanner.nextLine();
        if (sc.equalsIgnoreCase(yzm)){
            System.out.println("输入正确");
            return true;
        }else {
            System.out.println("输入错误");
            return false;
        }
    }
}
