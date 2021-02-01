package com.Daniu;

public class T10 {
    public static void main(String[] args) {
        int z =4321;

        int a = z/1000;
        int b = z/100%10;
        int c = z%100/10;
        int d = z%10;
        System.out.println("千位数"+a);
        System.out.println("百位数"+b);
        System.out.println("十位数"+c);
        System.out.println("个位数"+d);
    }
}
