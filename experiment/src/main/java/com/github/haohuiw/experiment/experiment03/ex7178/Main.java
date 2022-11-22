package com.github.haohuiw.experiment.experiment03.ex7178;

interface Usb {
    void turnOn();

    void turnOff();

}

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.add(new Mouse());
        computer.add(new KeyBoard());
        computer.add(new Mic());
        computer.powerOn();
        computer.powerOff();
    }
}

class Mouse implements Usb {

    @Override
    public void turnOn() {
        System.out.println("鼠标启动了");
    }

    @Override
    public void turnOff() {
        System.out.println("鼠标关闭了");
    }
}

class KeyBoard implements Usb {

    @Override
    public void turnOn() {
        System.out.println("键盘启动了");
    }

    @Override
    public void turnOff() {
        System.out.println("键盘关闭了");
    }
}

class Mic implements Usb {

    @Override
    public void turnOn() {
        System.out.println("麦克启动了");
    }

    @Override
    public void turnOff() {
        System.out.println("麦克关闭了");
    }
}

class Computer {
    private Usb[] usbs = new Usb[10];

    public Usb[] getUsbs() {
        return usbs;
    }

    public void setUsbs(Usb[] usbs) {
        this.usbs = usbs;
    }

    void add(Usb usb) {
        for (int i = 0; i < 10; i++) {
            if (usbs[i] == null) {
                usbs[i] = usb;
                break;
            }
        }
    }

    void powerOn() {
        for (int i = 0; i < 10; i++) {
            if (usbs[i] != null) {
                usbs[i].turnOn();
            }
        }
        System.out.println("计算机开机成功");
    }

    void powerOff() {
        for (int i = 0; i < 10; i++) {
            if (usbs[i] != null) {
                usbs[i].turnOff();
            }
        }
        System.out.println("计算机关机成功");
    }
}