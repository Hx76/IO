package com.hx.i0;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader(
                "src/com/hx/i0/FileReaderTest.java");
        char[] chars = new char[32];
        int hasRead = 0;
        while ((hasRead = reader.read(chars))>0){
            System.out.print(new String(chars,0,hasRead));
        }

    }
}
