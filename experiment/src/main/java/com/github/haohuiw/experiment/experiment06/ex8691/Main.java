package com.github.haohuiw.experiment.experiment06.ex8691;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        try {
            int n=scan.nextInt();
            System.out.println(10-n);
        }catch (Exception e) {
            System.out.println("not int");
        }finally {
            System.out.println("end");
        }
    }
}