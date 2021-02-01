package com.Daniu;

public class T3 {
    public static void main(String[] args) {
       for (int i = 1; i < 14; i += 4) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 10; i > 0; i-=2) {
            for (int j = i; j > 0 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
      /*  for (int i = 1; i < 7; i++) {
            for (int j = 1; j < i; j++) {
                if(i%2==0){
                   System.out.println("**"+" "+"**");
                }
            }
            System.out.println("****");
        }

        for(int i = 1; i < 8; i+=2) {
            for (int j = 1; j <i ; j++) {
                if(i%2==1){
                    System.out.print("*"+"  "+"**");
            }
            }
            System.out.println("****");
        }*/
    }
}
