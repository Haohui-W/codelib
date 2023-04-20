package com.github.haohuiW.testOnly.threadTest;

public class MyTask implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ": task start...");
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + ": task completed...");
    }
}
