package com.github.haohuiw.experiment.experiment02.ex7188;

import java.util.Scanner;

/**
 * @author Haohui-W
 */
public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("该生姓名：" + student.getName() + ",年龄：" + student.getAge());
    }
}

class Student {
    private String name;
    private int age;

    public Student() {
        Scanner scanner = new Scanner(System.in);
        name = scanner.next();
        age = scanner.nextInt();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}