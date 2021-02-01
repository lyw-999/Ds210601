package com.Daniu;

public class T5 {
    public static void main(String[] args) {
        //死循环    i > 1 一只i输出
        /*int i=1;
        do{
            System.out.println(i++);
        }while(i>1);*/

        int  a=1;
        for (int i = 0; i < a; i++) {
            if(a>0){
                a++;
                System.out.println(a);
            }
        }
    }
}
