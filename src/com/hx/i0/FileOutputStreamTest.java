package com.hx.i0;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(
                "src/com/hx/i0/FileInputStreamTest.java");
        FileOutputStream outputStream = new FileOutputStream("newFile.txt");
        byte[] bytes = new byte[32];
        int hasRead = 0;
        while ((hasRead = fileInputStream.read(bytes))>0){
            outputStream.write(bytes,0,hasRead);
        }
    }
}
