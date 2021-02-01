package com.Daniu;

public class T7 {
    public static void main(String[] args) {
     //   7.请在8，9，7，6，4，5，3，2中找出尚左数？

        int[] a={8,9,7,6,4,5,3,2};
    // 左边比右边大 右边比左边小       //7 6 3 2  为什么有4
        for (int i = 1; i < a.length; i++) {
            if (a[i-1]>a[i] || a[i+1] >a[i] ){
                System.out.println(a[i]);
            }
        }
    }
}
