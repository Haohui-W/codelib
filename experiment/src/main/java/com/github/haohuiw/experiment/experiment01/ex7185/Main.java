package com.github.haohuiw.experiment.experiment01.ex7185;

import java.util.Scanner;

/**
 * @author Haohui-W
 */
public class Main {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        if (n <= 1) {
            System.out.println("输入n不是大于1正整数");
        } else {
            fun(n);
        }
    }

    public static void fun(int n) {
        lp:
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    continue lp;
                }
            }
            System.out.printf("%d ", i);
        }
    }
}
