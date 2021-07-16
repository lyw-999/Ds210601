package com.hp.Day08;

import java.util.ArrayList;
import java.util.List;

public class Test04 {
    /**
     * 创建一个List集合并添加元素0-9
     * 然后获取子集[3,4,5,6]
     * 然后将子集元素扩大10倍
     * 然后输出原集合。
     * 之后删除集合中的[7,8,9]
     * @author Xiloer
     *
     */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> zlist = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
         zlist = list.subList(3,7);
        for(int i=0;i<zlist.size();i++){
             zlist.set(i,zlist.get(i)*10);
            //System.out.println(zlist);
        }
        System.out.println("扩大后的list " +list);
       // System.out.println("list.size() = " + list.size());
        list.remove(9);
        list.remove(8);
        list.remove(7);
        System.out.println("删除789的list " + list);
    }

}
