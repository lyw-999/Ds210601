package com.hp.zyy.Day09;

import java.io.File;

public class Test04 {
    /**
     * 获取并输出当前目录下的所有文件和目录的名字
     * @author Xiloer
     *
     */
    public static void main(String[] args) {
        textFile(new File("E:\\test"),1);
    }

    public static void textFile(File file,int tab) {
        if (file.isFile()) {
            System.out.println("您给定的是一个文件"); // 判断给定目录是否是一个合法的目录，如果不是，输出提示
        } else {
            File[] fileLists = file.listFiles(); // 如果是目录，获取该目录下的内容集合

            for (int i = 0; i < fileLists.length; i++) { // 循环遍历这个集合内容
                for (int j = 0; j < tab; j++) {        //输出缩进
                    //System.out.print();
                }
                System.out.println(fileLists[i].getName());    //输出元素名称

                if (fileLists[i].isDirectory()) {    //判断元素是不是一个目录
                    textFile(fileLists[i],tab+1);    //如果是目录，继续调用本方法来输出其子目录，因为是其子目录，所以缩进次数 + 1
                }
            }
        }
    }
}
