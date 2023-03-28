package com.github.haohuiW.experiment.experiment07.ex8690;

import java.util.HashSet;

/**
 * @author Haohui-W
 */
public class Main {
    public static void main(String[] args) {
        String[] person = {"刘一","陈二","张三","李四","王五","赵六","钱七","孙八","周九","吴十"};
        HashSet<Integer> integers = new HashSet<>();
        while (integers.size()<10){
            integers.add((int) (Math.random() * 10));
        }
        CrossBridge crossBridge = new CrossBridge();
        for (Integer integer : integers) {
            new Thread(crossBridge,person[integer]).start();
        }
    }
}
class CrossBridge implements Runnable{

    @Override
    synchronized public void run() {
        System.out.println(Thread.currentThread().getName() + "正在过桥");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "已经过桥");
    }
}
