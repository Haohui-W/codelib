package com.github.haohuiw.experiment.experiment01.ex7195;

import java.util.Scanner;

/**
 * @author Haohui-W
 */
public class Main {

    public static void main(String[] args) {
        int number, digit1, digit2, digit3, digit4, newnum;
        int temp;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        //WRITE CODE HERE
        temp = number;
        digit4 = (temp % 10 + 9) % 10;
        temp /= 10;
        digit3 = (temp % 10 + 9) % 10;
        temp /= 10;
        digit2 = (temp % 10 + 9) % 10;
        temp /= 10;
        digit1 = (temp + 9) % 10;
        newnum = digit3 * 1000 + digit4 * 100 + digit1 * 10 + digit2;
        System.out.println("The encrypted number is " + newnum);

    }

}
