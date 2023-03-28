package com.github.haohuiW.experiment.experiment01.ex7196;

import java.util.Scanner;

/**
 * @author Haohui-W
 */
public class Main {
    public static void main(String[] args) {

        int n;

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        //write your code
        double ans = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                ans += (double) 1 / (1 + 3 * i);
            } else {
                ans -= (double) 1 / (1 + 3 * i);
            }
        }
        System.out.println(ans);
    }
}