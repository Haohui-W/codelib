package com.github.haohuiW.experiment.experiment06.ex02;

import java.util.Scanner;

class Danger extends Exception {
    public void Show() {
        System.out.println("超重");
    }
}
class Boat {
    private int RealLoad;
    private int MaxLoad;
    public int getRealLoad() {
        return RealLoad;
    }
    public void setRealLoad(int realLoad) {
        RealLoad = realLoad;
    }
    public int getMaxLoad() {
        return MaxLoad;
    }
    public void setMaxLoad(int maxLoad) {
        MaxLoad = maxLoad;
    }
    public void add(int x)throws Danger {
        if(RealLoad+x>MaxLoad) {
            throw new Danger();
        }
        RealLoad+=x;
        System.out.println("当前载重量"+RealLoad);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Boat b=new Boat();
        b.setMaxLoad(scan.nextInt());
        int m=0;
        try {
            while (true) {
                m=scan.nextInt();
                b.add(m);
            }
        }catch (Danger e) {
            e.Show();
            System.out.println("无法再装"+m);
        }finally {
            System.out.println("货船启航");
        }
    }
}