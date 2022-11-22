package com.github.haohuiw.experiment.experiment07.ex7180;

/**
 * @author Haohui-W
 */
public class Main {
    public static void main(String[] args) {
        TrainStation trainStation = new TrainStation();
        new Thread(trainStation, "哈站").start();
        new Thread(trainStation, "哈东站").start();
        new Thread(trainStation, "哈西站").start();


    }
}

class TrainStation implements Runnable {

    private int tickets = 200;

    @Override
    public void run() {
        while (tickets > 0) {
            synchronized (this) {
                System.out.println(Thread.currentThread().getName() + "卖了第" + tickets + "张票");
                tickets--;
            }

        }
    }
}
