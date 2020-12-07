package com.hx.i0;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("poem.txt");
        fileWriter.write("haha");
        fileWriter.close();
    }
}
