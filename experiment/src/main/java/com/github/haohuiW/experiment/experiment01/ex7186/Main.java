package com.github.haohuiW.experiment.experiment01.ex7186;

import java.util.Scanner;

/**
 * @author Haohui-W
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int k;
        k = scanner.nextInt();
        int[] a = {-2, 1, 4, 5, 8, 12, 17, 23, 45, 56, 90, 100};
        int flag = 1;
        for (int i = 0; i < 12; i++) {
            if (a[i] == k) {
                System.out.println(k + "是数组中的第" + i + "个元素");
                flag = 0;
                break;
            }
        }
        if (flag == 1) {
            System.out.println(k + "不在数组中");
        }

    }
}
