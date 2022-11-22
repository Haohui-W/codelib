package com.github.haohuiw.experiment.experiment02.ex7203;

import java.util.Scanner;

class ObjectCounter {
    //write your code here
    private static int count;

    public ObjectCounter() {
        count++;
    }

    public static int getCount() {
        return count;
    }

}

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            ObjectCounter str1 = new ObjectCounter();
        }
        System.out.println(ObjectCounter.getCount());
    }
}
