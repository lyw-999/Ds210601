package com.daniu101.chapter11;

public class Test {
    public static void main(String[] args) {


        // Member member  = new Member();
        // Leader leader  = new Leader();
        Boss boss =  new Boss();
        boss.name("王老板");
        boss.pay();
        boss.pay(10000);
        boss.pay(100000,63);
    }
}
