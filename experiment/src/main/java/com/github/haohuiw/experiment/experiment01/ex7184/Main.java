package com.github.haohuiw.experiment.experiment01.ex7184;

import java.util.Scanner;

/**
 * @author Haohui-W
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        if ("圆形".equals(str)) {
            double a = scan.nextDouble();
            double area = a * a * 3.14;
            System.out.println("圆形面积=" + area);
        } else if ("矩形".equals(str)) {
            double a = scan.nextDouble();
            double b = scan.nextDouble();
            double area = a * b;
            System.out.println("矩形面积=" + area);
        } else {
            System.out.println("输入的不是圆形或矩形");
        }
    }
}
