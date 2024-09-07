package com.atguigu01.file.exer3;

import org.junit.Test;

import java.io.File;

/**
 * ClassName: Exer3
 * Package: com.atguigu01.file.exer3
 * Description:
 * 练习：
 * 遍历指定文件目录下的所有文件的名称，包括子文件目录中的文件。
 * public void printFileName(File file)  //file可能是文件，也可能是文件目录
 * <p>
 * <p>
 * 拓展1：删除指定文件目录及其下的所有文件
 * public void deleteDirectory(File file)  //file可能是文件，也可能是文件目录
 * <p>
 * 拓展2：计算指定文件目录占用空间的大小
 * public long getDirectorySize(File file)  //file可能是文件，也可能是文件目录
 *
 * @Author Xu, Luqin
 * @Create 2024/9/7 16:25
 * @Version 1.0
 */
public class Exer3 {
    @Test
    public void test1() {
        File file = new File("D:\\CPA");
        printFileName(file);
    }

    /**
     * 练习：
     * 遍历指定文件目录下的所有文件的名称，包括子文件目录中的文件。
     * public void printFileName(File file)  //file可能是文件，也可能是文件目录
     *
     * @param file
     */
    public void printFileName(File file) {
        if (file.isFile()) {
            System.out.println(file.getName());
        } else if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File item : files) {
                printFileName(item);
            }
        }
    }

    @Test
    public void test2() {
        File file = new File("D:\\io");
        deleteDirectory(file);
        System.out.println("删除完毕");
    }

    /**
     * 拓展1：删除指定文件目录及其下的所有文件
     * public void deleteDirectory(File file)  //file可能是文件，也可能是文件目录
     */
    public void deleteDirectory(File file) {
//        if(file.isFile()){
//            file.delete();
//        }else if (file.isDirectory()){
//
//            File[] all = file.listFiles();
//            if(all == null || all.length==0){
//                file.delete();
//            }else{
//                for (File f : all) {
//                    deleteDirectory(f);
//                }
//            }
//
//        }

        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File f : files) {
                deleteDirectory(f);
            }
        }
        file.delete();// 不只是删除文件还删除空文件夹
    }

    @Test
    public void test3() {
        File file = new File("D:\\biancheng\\1_基础必备_Java核心基础\\05_实战项目");
        long directorySize = getDirectorySize(file); // 字节
        System.out.println(directorySize);
    }

    /**
     * 拓展2：计算指定文件目录占用空间的大小
     *
     * @param file
     * @return
     */
        long size = 0;
    public long getDirectorySize(File file) {

        if (file.isFile()) {
            size += file.length();
        } else {
            File[] files = file.listFiles();
            for (File f : files) {
                getDirectorySize(f);
            }
        }
        return size;
    }

}
