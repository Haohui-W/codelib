package com.github.haohuiw.experiment.experiment02.ex7190;

import java.util.Scanner;

/**
 * @author Haohui-W
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("和=" + Add.add(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
    }
}

class Add {
    public static int add(int a, int b, int c) {
        int n = (b - a) / c + 1;
        return n * (a + b) / 2;
    }
}