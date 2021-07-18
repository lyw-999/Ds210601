package com.hp.Day08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo01 {
        public static void main(String[] args) {
            // 产生一个List集合，典型实现为ArrayList。
            List<String> list = new ArrayList<String>();
        /* List list = new ArrayList();结果出错
        注：test.java使用了未经检查或不安全的操作。
        注: 有关详细信息, 请使用 -Xlint:unchecked 重新编译。
         *这样的情况下要用泛型，容器里不能放object而是放具体类型。
         */

            //添加三个元素
            list.add("迪迦");
            list.add("戴拿");
            list.add("盖亚");
            //构造List的迭代器
            Iterator it = list.iterator();
            //通过迭代器遍历元素
            while (it.hasNext()){
                Object obj = it.next();
                System.out.println(obj);
            }
        }
    }