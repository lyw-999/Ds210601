package com.hp.Day08;

import java.util.*;

import static jdk.nashorn.internal.objects.NativeMath.random;

public class Test07 {
    /**
     * 创建一个List集合，并存放10个随机数，然后排序该集合
     * 后输出
     */
    public static void main(String[] args) {
        List list = new ArrayList();
        Random random = new Random();
        for(int i = 0; i<10;i++){
            list.add(random.nextInt(30));
        }
        //对集合进行自然排序，从小到大
        Collections.sort(list);
        System.out.println("list = " + list);
    }
}