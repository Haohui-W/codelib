package com.github.haohuiw.experiment.experiment04.ex7209;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Haohui-W
 */
public class Main{
    public static void main(String[] args){
        //write your own code
        HashMap<String, Integer> stringIntegerHashMap = new HashMap<>(100);
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        for (int i = 0; i < n; i++) {
            stringIntegerHashMap.put(scanner.next(), scanner.nextInt());
        }
        System.out.println(stringIntegerHashMap.get(scanner.next()));
        stringIntegerHashMap.forEach((x,y)-> System.out.println(x+" "+y));

    }
}