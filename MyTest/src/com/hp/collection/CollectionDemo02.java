package com.hp.collection;

import java.util.ArrayList;
import java.util.Collection;

    /*
    集合 存的是对象的 什么？
    存的对象的引用, 当对象 通过外力改变了, 那么集合中的内容也会变.

     */
public class CollectionDemo02 {
    public static void main(String[] args) {
        Person zz = new Person();
        zz.setName("zzz");
        zz.setAge(160);
        zz.setHeigth(160);
        Collection c =new ArrayList();
        c.add(zz);

        for (Object o : c) {
            System.out.println("o = " + o);
        }
        zz.setHeigth(666);
        zz.setAge(999);
        zz.setName("赛罗");
        for (Object o : c) {
            System.out.println("o = " + o);
        }
    }
}
