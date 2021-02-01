package com.daniu101.chapter11;

public class Boss extends Leader{
    private String name;
    private String salary;
    void    work(){
        System.out.println("这里是 工作的方法");
    }


    void name(String name){
        System.out.println("老板的名字"+ this.name);
        System.out.println("这里是老板发工资的方法");
    }
    
    void pay(){
        System.out.println("---------");
    }
    void pay(int salary){
        System.out.println("老板发了"+salary+"工资");
    }
    void pay(int salary, int people){
        System.out.println("老板发了"+salary+"一共"+people+"个人");
    }
}
