package com.Daniu;

import java.util.Scanner;

public class T9 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("请输入一个数");
        int a =sc.nextInt();
        int sum=1;

        for (int i = 0; i < a; i++) {
            sum=sum*(a-i);
        }

        System.out.println(sum);
    }
}
