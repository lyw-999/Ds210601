package com.hp.zy;

public class Test2 {
    /**
     * 将"大家好!"修改为:"大家好!我是程序员!"并输出。
     * 然后将"大家好!我是程序员!"修改为:"大家好!我是优秀的程序员!"并输出
     * 然后再修改为:"大家好!我是牛牛的程序员!"并输出
     * 然后在修改为:"我是牛牛的程序员!"并输出
     *
     */
    public static void main(String[] args) {
            String str = "大家好";
            String str1 = str.concat("!我是程序员！");
            System.out.println("str1 = " + str1);
            //替换 为指定内容
            String str2 = str1.replace("我是程序员！","我是优秀的程序员！");
            System.out.println("str2 = " + str2);
            //替换 为指定内容
            String str3 = str2.replace("优秀","牛牛");
            System.out.println("str3 = " + str3);
            //截取字符串
            String str4 = str3.substring(4);
            System.out.println("str4 = " + str4);
    }
}
