package com.github.haohuiw.experiment.experiment02.ex7187;

import java.util.Scanner;

/**
 * @author Haohui-W
 */
public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        Scanner scanner = new Scanner(System.in);
        box.setDemo(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        System.out.println("体积=" + box.getVolume());
    }
}

class Box {
    private int x, y, z;

    public void setDemo(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getVolume() {
        return x * y * z;
    }
}