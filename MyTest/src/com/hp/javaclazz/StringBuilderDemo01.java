package com.hp.javaclazz;

public class StringBuilderDemo01 {
    /*
     StringBuilder(线程不安全，速度很快) StringBuffer(线程安全的，速度稍微慢) 解决于  字符串频繁修改的问题
     意思是 把String升级了   String 类 重点 重要性

     */
    public static void main(String[] args) {
        String str = "好好的努力学习Java";
        StringBuilder sr = new StringBuilder(str);
        // 1.追加
        sr.append(",为了找一个好工作");
        System.out.println("sr = " + sr);
        // 2.修改
        sr.replace(11,20,"进行进一步的加强");
        System.out.println("sr = " + sr);
        // 3.删除
        sr.deleteCharAt(2);
        System.out.println("sr = " + sr);
        // 3.1 删除区间
        sr.delete(2,5);
        System.out.println("sr = " + sr);
        // 3.2 删除全部
        sr.delete(0,sr.length());
        System.out.println("没有了 = " + sr);
        // 4. 插入 添加
        sr.insert(0,"每天");
        System.out.println("sr = " + sr);
        // 5. 对字符串进行 翻转
        sr.reverse();
        System.out.println("sr = " + sr);
    }
}
