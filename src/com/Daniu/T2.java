package com.Daniu;

public class T2 {
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=100;i++) {
            if (i == 2)
                System.out.print(i + " ");
            for (j=2;j<i;j++) {
                if (i%j==0)       //素数对非1和它本身的数求余不为零
                    break;
                if (j == (i-1) && 0 != (i%(i-1)))
                    System.out.print(i + " ");
            }
        }
        }
}
