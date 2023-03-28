package com.github.haohuiW.experiment.experiment02.ex7201;

import java.util.Scanner;

class Point {

    private final int x;
    private final int y;

    public Point(int xx, int yy)    //构造方法
    {
        this.x = xx;
        this.y = yy;
    }

    public Point(Point a) {
        this.x = a.x;
        this.y = a.y;
    }

    //write your code
    public static void fun1(Point p) {
        System.out.println(p.getX());
    }

    public static Point fun2() {
        Point A = new Point(1, 2);
        return A;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}

public class Main {
    public static void main(String[] args) {
        //write your code
        Scanner scanner = new Scanner(System.in);
        Point a = new Point(scanner.nextInt(), scanner.nextInt());
        Point b = new Point(a);
        System.out.println(b.getX());
        Point.fun1(b);
        b = Point.fun2();
        System.out.println(b.getX());
    }

}