package com.hp.zyy.Day09;

import java.io.File;

public class Test06 {
    /**
     * 获取并输出当前目录下所有文件的名字
     * @author Xiloer
     *
     */
    public static void main(String[] args) {
        test(new File("E/test"));
    }
    public static boolean test(File file) {
         File[] files = file.listFiles();  //创建File格式的数组files    之后fi作为参数调用listFiles()方法，创建fi目录下的新的数组
         for (File fi : files) {  //此处会遍历files数组中的元素,将值逐个赋给fi 。因为每次把当前目录的所有文件和文件夹当成元素赋给数组
             if (fi.isFile()) {
                 test(fi);
                   //当是文件夹的时候，调用方法，用对象，也就是文件夹创建一个数组，然后遍历，所有存在文件夹会被这样一层层打开，到最深层不是文件夹的
             } else  {
                 System.out.println(fi.getName());
             }
         }
//        public static void getAllFileName(String path ) {
//            File file = new File(path);
//            File [] files = file.listFiles();
//            for (File file1 : files) {
//                if (file1.isFile()) {
//                    System.out.println("file1 = " + file1);
//                }
//            }

//                fileName.addAll(Arrays.asList(names));
//            for(File a:files)
//            {
//                if(a.isDirectory())
//                {
//                    getAllFileName(a.getAbsolutePath(),fileName);
//                }
//            }
        return false;
    }
}