package com.github.haohuiW.experiment.experiment08;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Haohui-W
 */
public class IOTest {
    public static void main(String[] args) {
        String fileName = "C:/example/from.txt";

        System.out.println("----- 创建文件 ------");
        createFile(fileName);

        System.out.println("-----  将字符串写入文件 -------");
        // \r\n在txt文本中换行
        String str =
                "白日依山尽\r\n" +
                        "黄河入海流\r\n" +
                        "欲穷千里目\r\n" +
                        "更上一层楼\r\n";
        writeToFile(fileName, str);

        System.out.println("--------- 基于基本IO流实现文件的复制 ----------");
        String toFile = "C:/example/to.txt";
        copyByIO(fileName, toFile);

        System.out.println("--------- 基于NIO实现文件的复制 ----------");
        String toFile2 = "C:/example/nio/to.txt";
        copyByNIO(fileName, toFile2);

        System.out.println("---------- 删除指定文件 -------------");
        deleteFile(toFile);
        System.out.println("---------- 遍历指定目录文件 -------------");
        String dir = "C:/example";
        walkDirectories(dir);
    }

    /**
     * 基于指定文件名称创建目录及文件
     * 如果文件已经存在，则忽略
     *
     * @param fileName 文件名
     */
    private static void createFile(String fileName) {
        Path p1 = Paths.get(fileName);
        try {
            Files.createDirectories(p1.getParent());
            Files.createFile(p1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 提示：文件以字节操作，因此可以
     * 字符串，转字节数组，直接基于Files写入文件
     *
     * @param fileName 文件名
     * @param content  内容
     */
    private static void writeToFile(String fileName, String content) {
        try (FileOutputStream out = new FileOutputStream(fileName)) {
            out.write(content.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("写入文件失败");
        }
    }

    /**
     * 基于基本IO，以及字节数组缓冲区，复制文件
     * 打印显示循环读写循环次数
     *
     * @param sourceFile 源文件
     * @param targetFile 目标文件
     */
    private static void copyByIO(String sourceFile, String targetFile) {
        try (FileOutputStream out = new FileOutputStream(targetFile);
             FileInputStream in = new FileInputStream(sourceFile)) {
            byte[] buffer = new byte[8];
            int len = 0;
            int times = 0;
            while ((len = in.read(buffer)) != -1) {
                out.write(buffer, 0, len);
                times++;
            }
            System.out.println("循环次数为:" + times);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("写入文件失败");
        }
    }

    /**
     * 基于NIO，实现文件的复制
     *
     * @param sourceFile 源文件
     * @param targetFile 目标文件
     */
    private static void copyByNIO(String sourceFile, String targetFile) {
        Path p1 = Paths.get(sourceFile);

        Path p2 = Paths.get(targetFile);
        try {
            Files.createDirectories(p2.getParent());
            Files.copy(p1, p2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 删除文件
     *
     * @param fileName 文件名
     */
    private static void deleteFile(String fileName) {
        Path p = Paths.get(fileName);
        try {
            Files.delete(p);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 遍历打印指定目录下全部目录/文件名称
     *
     * @param dir 目录
     */
    private static void walkDirectories(String dir) {
        Path p = Paths.get(dir);
        try {
            Files.walk(p)
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}