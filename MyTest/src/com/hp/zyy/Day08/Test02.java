package com.hp.Day08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test02 {
    /**
     * 创建一个集合，存放元素"1","$","2","$","3","$","4"
     *   使用迭代器遍历集合，并在过程中删除所有的"$"，
     *   最后再将删除元素后的集合使用新循环遍历，并输出每一个元素。
     * @author Xiloer
     *
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        // List<String> list1 = new ArrayList();
        list.add("1");
        list.add("$");
        list.add("2");
        list.add("$");
        list.add("3");
        list.add("$");
        list.add("4");
        list.add("$");
        System.out.println("list = " + list);
        // 使用迭代器
//        Iterator<String> it = list.iterator();
//        while(it.hasNext()){
//            String temp = it.next();
//            if(temp.equals("$")){
//                it.remove();
//            }
//        }
//
//        for(int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) == "$") {
                list.remove(i);
            }
            System.out.println("i = " + i);
        }
    }
}
