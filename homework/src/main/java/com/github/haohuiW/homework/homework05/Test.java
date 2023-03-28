package com.github.haohuiW.homework.homework05;

/**
 * @author Haohui
 */
public class Test {
    public static void main(String[] args) {
        Button buttonA = new Button();
        buttonA.setClickable(() -> System.out.println("ButtonA"));
        Button buttonB = new Button();
        buttonB.setClickable(() -> System.out.println("ButtonB"));
        buttonA.getClickable().byClick();
        buttonB.getClickable().byClick();
    }
}