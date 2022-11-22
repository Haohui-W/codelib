package com.github.haohuiw.experiment.experiment01.ex7193;

import java.util.Scanner;

/**
 * @author Haohui-W
 */
public class Main {
    public static void main(String[] args) {
        //write your own codes
        Scanner scanner = new Scanner(System.in);
        double f = scanner.nextDouble();
        double c = 5 * (f - 50) / 9 + 10;
        System.out.printf("The temprature is %.2f\n", c);
    }
}