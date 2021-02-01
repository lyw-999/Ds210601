package com.daniu101.chapter10;

public class People {
    private String name;
    private int height;
    private int age;


    //提供给其他类访问的方法
    public int getHeight() {
        return height;
    }
    public int getAge() {
        return age;
    }
    //提供给其他类赋值的方法
    public void setHeight(int hg) {
        if (hg >= 0) {
            this.height = hg;
        } else {
            System.out.println("您输入的身高有误");
        }
    }
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("您输入的年龄有误");
        }
    }

    @Override
    public String toString() {
        return "这是一个人类";
    }
}
