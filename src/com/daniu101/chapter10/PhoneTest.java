package com.daniu101.chapter10;

public class PhoneTest {
    public static void main(String[] args) {

        Phone apple = new Phone();

        apple.setSize(-6.5);
        apple.setStatu("电量低");

        apple.setSize(6.5);
        System.out.println("apple的尺寸:"+apple.getSize());
        apple.setStatu("正常");
        System.out.println("apple的状态:"+apple.getStatu());


        System.out.println(apple.toString());

    }
}
