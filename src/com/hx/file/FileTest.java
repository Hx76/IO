package com.hx.file;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) throws IOException {
        //以当前路径创建一个File对象
        File file = new File(".");
        //获取文件名
        System.out.println(file.getName());
        //获取父路径，绝对路径，上一级路径
        System.out.println(file.getParent());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getAbsoluteFile().getParent());
        //在当前路径下创建临时文件
        File tempFile = File.createTempFile("aaa", ".txt", file);
        //指定当jvm退出时删除该文件
        tempFile.deleteOnExit();
        File haha = new File("haha");
        //判断文件是否存在
        System.out.println(haha.exists());
        //以haha为对象创建目录,因为haha已经存在，所以返回false
        haha.mkdir();
        //列出当前路径下所有文件和路径
        String[] list = file.list();
        for (String s : list) {
            System.out.println(s);
        }
        //listRoots静态方法列出所有磁盘根路径
        File[] files = File.listRoots();
        for (File file1 : files) {
            System.out.println(file1);
        }
        //文件过滤器
        String[] list1 = file.list((dir, name) -> name.endsWith(".txt")
                || new File(name).isDirectory());
        for (String s : list1) {
            System.out.println(s);
        }

    }
}
