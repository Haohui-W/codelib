package com.github.haohuiw.experiment.experiment04.ex7208;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Haohui-W
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<>();

        while (true) {
            String s= scanner.next();
            if("end".equals(s)) {
                break;
            }
            students.add(s);
        }
        ArrayList<String> students1 = new ArrayList<>();
        while (true) {
            String s= scanner.next();
            if("end".equals(s)) {
                break;
            }
            students1.add(s);
        }
        for (int i = students.size() - 1; i >= 0; i--) {
            String s=students.get(i);
            if (students1.contains(s)) {
                System.out.print(s+" ");
            }
        }

    }
}