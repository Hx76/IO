package com.hx.i0;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {
    public static void main(String[] args) throws IOException {
        //创建字节输入流
        FileInputStream fileInputStream = new FileInputStream(
                "src/com/hx/i0/FileInputStreamTest.java");
        byte[] bytes = new byte[1024];
        //实际读取的字节数
        int hasRead = 0;
        //读取
        while ((hasRead = fileInputStream.read(bytes))>0){
            System.out.println(new String(bytes,0,hasRead));
        }
        fileInputStream.close();


    }
}
