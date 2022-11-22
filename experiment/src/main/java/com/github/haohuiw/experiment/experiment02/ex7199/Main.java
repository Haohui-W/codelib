package com.github.haohuiw.experiment.experiment02.ex7199;

import java.util.Scanner;

class Prime {
    // Write your own code
    public static boolean prime(int x) {
        if (x == 1) {
            return false;
        }
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}

/**
 * @author Haohui-W
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // Write your own code
        if (Prime.prime(n)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}