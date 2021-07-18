package com.hp.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
    排序集合！！  对劲和进行自然排序(从小到大)
    他只能对list 排序 对set不可以.因为 set是无序的
     */
public class SortListDemo {
    public static void main(String[] args) {
    List<Integer> list = new ArrayList();
        list.add(80);
        list.add(20);
        list.add(60);
        list.add(40);
        Collections.sort(list);
        System.out.println("list = " + list);

        // 纯字符串
        List<String> list1 = new ArrayList();
        list1.add("梦比优斯");
        list1.add("雷欧");
        list1.add("泰罗");
        list1.add("杰克");
        Collections.sort(list1);
        System.out.println("list1 = " + list1);

        // 对象的排序 对对象的某个属性 进行排序
        Person p1 = new Person();
            p1.setName("雷欧7");
            p1.setHeigth(199);
            p1.setAge(888);
        Person p2 = new Person();
            p2.setName("杰克奥特曼");
            p2.setHeigth(197);
            p2.setAge(999);
        Person p3 = new Person();
            p3.setName("初代的奥特曼");
            p3.setHeigth(196);
            p3.setAge(1000);
        Person p4 = new Person();
            p4.setName("艾斯");
            p4.setHeigth(194);
            p4.setAge(777);
        Person p5 = new Person();
            p5.setName("梦比优斯奥特曼");
            p5.setHeigth(188);
            p5.setAge(666);
        List<Person> personList = new ArrayList<Person>();
            personList.add(p1);
            personList.add(p2);
            personList.add(p3);
            personList.add(p4);
            personList.add(p5);
            Collections.sort(personList);
            //Collections.reverse(personList);
                System.out.println("personList = " + personList);
    }
}
