package com.hp.collection;

public class Person {
    private  String name;
    private  int heigth;
    private  int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", heigth=" + heigth +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
