package com.github.haohuiW.experiment.experiment01.ex7183;

import java.util.Scanner;

/**
 * @author Haohui-W
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(), b = scan.nextInt(), c = scan.nextInt();
        if (a < b) {
            int t = a;
            a = b;
            b = t;
        }
        if (a < c) {
            int t = a;
            a = c;
            c = t;
        }
        if (b < c) {
            int t = c;
            c = b;
            b = t;
        }
        System.out.println("" + c + ' ' + b + ' ' + a);
    }
}
