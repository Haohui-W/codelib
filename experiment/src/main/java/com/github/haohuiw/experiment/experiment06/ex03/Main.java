package com.github.haohuiw.experiment.experiment06.ex03;


import java.util.Arrays;
import java.util.Scanner;


class IllegalArgumentException extends Exception {
    public void show() {
        System.out.println("a,b,c不能构成三角形");
    }
}

class Triangle {
    int[] s = new int[3];

    public Triangle(int a, int b, int c) {
        s[0] = a;
        s[1] = b;
        s[2] = c;
    }

    public void check() throws IllegalArgumentException {
        Arrays.sort(s);
        if (s[0] + s[1] > s[2] && s[2] - s[1] < s[0]) {
            System.out.println("三边长为" + s[0] + s[1] + s[2]);
        } else {
            throw new IllegalArgumentException();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            Triangle t = new Triangle(scan.nextInt(), scan.nextInt(), scan.nextInt());
            t.check();
        } catch (IllegalArgumentException e) {
            e.show();
        } catch (Exception e) {
            System.out.println("请输入整数");
        }
    }
}