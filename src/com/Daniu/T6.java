package com.Daniu;

import java.util.Scanner;

public class T6 {
    public static void main(String[] args) {
        //如果 a为女 则直接输出18岁
        char a ='男';
        int  age =20;   //判断sell
        int  sell=60;   //根据sell的值输出ABCD
        if(a =='男'){
            if(age==20){
                if(sell==20){
                    System.out.println("A");
                }else if (sell==40){
                    System.out.println("B");
                }else if (sell==60){
                    System.out.println("C");
                }else if (sell==80){
                    System.out.println("D");
                }
            }else if(20<age &&age <=30){
                System.out.println("平均消费");
            }else if(30<age &&age <=40){
                System.out.println("平均消费");
            }
        }else if(a =='女'){
            System.out.println("18岁");
        }
    }
}
