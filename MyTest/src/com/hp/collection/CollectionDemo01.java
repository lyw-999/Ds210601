package com.hp.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo01 {
    /*
    集合: 非常重要！！  接口
     */
    public static void main(String[] args) {
    //    Collection c1 = new ArrayList();
        ArrayList c1 = new ArrayList();
        // add 增加
        c1.add("阿弥陀佛 -- 金蝉子");
        c1.add("吉吉国王 -- 孙悟空");
        c1.add("散伙头子 -- 猪悟能");
        c1.add("任劳任怨 -- 沙悟净");
        c1.add("炫酷白龙 -- 白龙马");
        System.out.println("c1 = " + c1);
        // 尺寸 长度
        int size = c1.size();
        System.out.println("size = " + size);
        // 判断是否为空
        boolean empty = c1.isEmpty();
        System.out.println("empty = " + empty);
        //  集合的清空 为空 true
        /*c1.clear();
        boolean empty1 = c1.isEmpty();
        System.out.println("empty1 = " + empty1);*/

        // 集合的 遍历  三种
        for (int i = 0; i < c1.size(); i++) {
            System.out.println("c1 = " + c1.get(i));
        }
        // 为什么 collection 不能使用for循环 换句话说 为什么不能使用 下标索引取值？
        //  因为set 集合没有下标索引,  所以 for循环不能使用到 collection 中.
        for (Object o : c1) {
            System.out.println("o = " + o);
        }
        // 迭代器 与 for 循环的区别

    }
}
