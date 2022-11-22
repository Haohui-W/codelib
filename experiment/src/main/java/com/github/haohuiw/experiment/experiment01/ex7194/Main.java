package com.github.haohuiw.experiment.experiment01.ex7194;

import java.util.Scanner;

/**
 * @author Haohui-W
 */
public class Main {
    public static void main(String[] args) {

        //write your own codes
        int repeat, a, n;
        Scanner scanner = new Scanner(System.in);
        repeat = scanner.nextInt();
        while (repeat-- > 0) {
            a = scanner.nextInt();
            n = scanner.nextInt();
            long ans = 0, tmp = a;
            for (int i = 1; i <= n; i++) {
                ans += tmp;
                tmp = tmp * 10 + a;
            }
            System.out.println(ans);
        }
    }
}