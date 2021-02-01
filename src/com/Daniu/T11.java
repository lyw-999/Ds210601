package com.Daniu;

import java.util.Scanner;

public class T11 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("输入第一条边");
          int a=sc.nextInt();
        System.out.println("输入第二条边");
          int b=sc.nextInt();
          int c=a+b ;  int d=a-b;
        System.out.println("第三条边的取值范围是"+d+"~"+c);
          if(a+b >c){
             System.out.println("第三条边的取值范围是");
          }else {
            System.out.println("三角形不成立");
          }

    }
}
