package com.github.haohuiW.testOnly.threadTest;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread taskThead = new Thread(new MyTask());
        System.out.println("before start, state is " + taskThead.getState());
        taskThead.start();
        System.out.println("after start, state is " + taskThead.getState());
        Thread.sleep(1);
        System.out.println("in sleep, state is " + taskThead.getState());
        Thread.sleep(1);
        System.out.println("after sleep, state is " + taskThead.getState());
        Thread.sleep(1);
        System.out.println("task is completed, state is " + taskThead.getState());
    }
}
