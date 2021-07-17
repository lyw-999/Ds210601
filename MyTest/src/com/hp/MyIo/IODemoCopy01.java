package com.hp.MyIo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

// 文件的拷贝(了解...)
public class IODemoCopy01 {
    public static void main(String[] args) throws IOException {
        //
        RandomAccessFile copyname = new RandomAccessFile("压缩包.zip", "r");
        RandomAccessFile cp2name = new RandomAccessFile("压缩包副本.zip", "rw");
        int d = -1; //io里面-1 代表读取完毕
        while (true) {
            if ((d = copyname.read()) != -1) {
                cp2name.write(d);
            }
        }
    }
}