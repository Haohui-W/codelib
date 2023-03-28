package com.github.haohuiW.experiment.experiment02.ex7200;

import java.util.Scanner;

class Check {
    //write your code here
    public Check(int n1, int n2) {
        int t = Math.max(n1, n2);
        System.out.println("Larger value: " + t);
    }

    public Check(double d1, double d2, double d3) {
        System.out.println("a*b*c = " + d1 * d2 * d3);
    }

    public Check(String s1, String s2) {
        System.out.println("Are equal: " + s1.equals(s2));
    }
}

public class Main {
    public static void main(String[] args) {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        new Check(scanner.nextInt(), scanner.nextInt());
        new Check(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
        new Check(scanner.next(), scanner.next());

    }
}