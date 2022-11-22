package com.github.haohuiw.experiment.experiment01.ex7197;

import java.util.Scanner;

/**
 * @author Haohui-W
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int m, n;

        m = scanner.nextInt();
        n = scanner.nextInt();

        //write your code
        for (int i = m; i <= n; i++) {
            boolean flag = (i % 100 == 0 && i % 400 == 0) || i % 100 != 0 && i % 4 == 0;
            if (flag) {
                System.out.println(i);
            }
        }

    }
}
