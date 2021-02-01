package com.daniu101.chapter10;

public class PeopleTest {
    public static void main(String[] args) {
        People a = new People();

        a.setHeight(-10);
        a.setAge(-10);
        System.out.println("a的身高:"+a.getHeight());

        a.setHeight(50);
        System.out.println("a的身高:"+a.getHeight());

        a.setHeight(100);


        System.out.println(a.toString());
        


    }
}
