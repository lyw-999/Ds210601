package com.hp.Day08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test06 {
    /**
     * 创建一个字符串数组:{"one","two","three"}
     * 然后将该数组转换为一个List集合
     * @author Xiloer
     *
     */
    public static void main(String[] args) {
        String[] arr = {"one","two","three"} ;

        List<String> list =  Arrays.asList(arr);
        System.out.println("arr = " + arr[0]);
        System.out.println("list = " + list);

    }
}
