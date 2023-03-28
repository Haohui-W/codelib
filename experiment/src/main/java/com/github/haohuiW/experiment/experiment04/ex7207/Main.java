package com.github.haohuiW.experiment.experiment04.ex7207;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Haohui-W
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> strings = new ArrayList<>();
        while (true) {
            String s= scanner.next();
            if("end".equals(s)) {
                break;
            }
            strings.add(s);
        }
        strings.sort(null);
        strings.forEach(System.out::println);
    }
}
