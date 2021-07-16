package com.hp.Day08;

import java.util.ArrayList;
import java.util.List;

public class Test05 {
    /**
     * 创建一个List集合，并添加元素0-9
     * 将集合转换为一个Integer数组并输出数组每一个元素
     * @author Xiloer
     *
     */
    public static void main(String[] args) {
        List list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
             list.add(i+"");
        }
    
    }
}
