package com.github.haohuiw.experiment.experiment02.ex7198;

import java.util.Scanner;

class Dog {
    private String name, color;
    private int age;

    public Dog() {
        name = "dog1";
        color = "white";
        age = 1;
    }

    public Dog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getcolor() {
        return color;
    }

    public void setcolor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

/**
 * @author Haohui-W
 */
public class Main {
    public static void main(String[] args) {
        //write code here
        Scanner scanner = new Scanner(System.in);
        Dog d1 = new Dog();
        Dog d2 = new Dog(scanner.next(), scanner.next(), scanner.nextInt());
        System.out.println("name=" + d1.getName() + ",color=" + d1.getcolor() + ",age=" + d1.getAge());
        System.out.println("name=" + d2.getName() + ",color=" + d2.getcolor() + ",age=" + d2.getAge());

    }

}