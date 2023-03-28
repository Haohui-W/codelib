package com.github.haohuiW.experiment.experiment04.ex7206;

import java.util.Scanner;

/**
 * @author Haohui-W
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder stringBuilder = new StringBuilder(scanner.next());
        String s=scanner.next();
        while (stringBuilder.indexOf(s)!=-1) {
            stringBuilder.deleteCharAt(stringBuilder.indexOf(s));
        }
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.reverse());
    }
}
