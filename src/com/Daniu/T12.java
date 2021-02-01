package com.Daniu;

public class T12 {
    public static void main(String[] args) {

        int zz = 13412;  //   21431
        int a= zz%1000%100%10;  //万位
        int b= zz%100/10;       //千位
        int c= zz%1000/100;  //百位
        int d= zz/1000%10;      //十位
        int e=zz%1000%100/10;    //个位

      int result =  a*10000+b*1000+c*100+d*10+e;
        System.out.println(result);
    }
}
