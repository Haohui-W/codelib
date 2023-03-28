package com.github.haohuiW.experiment.experiment03.ex7177;

import java.util.Scanner;

/**
 * @author Haohui-W
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Animal cat = new Cat();
        cat.setName(scanner.next());
        Animal mouse = new Mouse();
        mouse.setName(scanner.next());
        cat.speak();
        mouse.speak();
    }
}

abstract class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void speak();
}

class Mouse extends Animal {

    @Override
    public void speak() {
        System.out.println(super.getName() + "的叫声为吱吱");
    }
}

class Cat extends Animal {

    @Override
    public void speak() {
        System.out.println(super.getName() + "的叫声为喵喵");
    }
}