package com.github.haohuiw.experiment.experiment07.ex7179;

/**
 * @author Haohui-W
 */
public class Main {
    public static void main(String[] args) {
        Run run = new Run();
        Thread thread0 = new Thread(run, "兔子");
        Thread thread1 = new Thread(run, "乌龟");
        thread0.start();
        thread1.start();
    }
}

class Run implements Runnable {

    private int rabbit = 0;
    private int tortoise = 0;

    @Override
    public void run() {
        while (true) {
            int distance = 100;
            if("乌龟".equals(Thread.currentThread().getName())){
                tortoise+=1;
                if(tortoise>= distance){
                    System.out.println("乌龟到终点了");
                    break;
                }else {
                    System.out.println("乌龟距离终点还有" + (distance - tortoise) + "米");
                }

            } else {
                rabbit+=10;
                if(rabbit>= distance){
                    System.out.println("兔子到终点了");
                    break;
                }else {
                    System.out.println("兔子距离终点还有" + (distance - rabbit) + "米");
                }
                if(rabbit>tortoise){

                    System.out.println("我跑得快，睡一觉");
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        }

    }
}