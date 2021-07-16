package com.hp.collection;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * JDK8 的快速 去 集合的属性
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        Person dc = new Person();
        dc.setAge(19);
        dc.setHeigth(165);
        dc.setName("貂蝉");

        Person xq = new Person();
        xq.setAge(18);
        xq.setHeigth(140);
        xq.setName("小乔");

        Person dq = new Person();
        dq.setAge(20);
        dq.setHeigth(170);
        dq.setName("大乔");

        List<Person> list = new ArrayList();
        list.add(dc);
        list.add(xq);
        list.add(dq);
        System.out.println("list = " + list);

        List<String> names = new ArrayList();
       // 1. 遍历list集合 拿出来对象的names
//        for (Person s : list) {
//            String name = s.getName();
//            //2. 赋值给新的集合中
//            names.add(name);
//        }
       // System.out.println("names = " + names);
        // 以上是传统的, JDK8 Stream()     作业: 自习 JDK8特性 写两个 demo
        List<String> nameLists = list.stream().map(Person::getName).collect(Collectors.toList());
        System.out.println("nameLists = " + nameLists);
    }
}
