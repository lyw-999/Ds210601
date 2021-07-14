package com.hp.zy;

import java.util.Scanner;

public class Test4 {
        // 要求用户从控制台输入一个email地址，然后获取该email的用户名(@之前的内容)
    public static void main(String[] args) {
             System.out.println("请输入邮箱地址");
             Scanner scanner = new Scanner(System.in);
             String email = scanner.nextLine();
             String [] newe = email.split("@");
        System.out.println("newe = " + newe[0]);
    }
}
