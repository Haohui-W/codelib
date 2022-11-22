package com.github.haohuiw.experiment.experiment03.ex7174;

import java.util.Scanner;

/**
 * @author Haohui-W
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        new Vehicle(scan.nextInt(), scan.nextDouble()).printInformation();
        new Car(scan.nextInt(), scan.nextDouble(), scan.nextInt()).printInformation();
        new Trunk(scan.nextInt(), scan.nextDouble(), scan.nextInt(), scan.nextDouble()).printInformation();

    }
}

class Vehicle {
    private final int wheelsNumber;
    private final double weight;

    public Vehicle(int wheelsNumber, double weight) {
        this.wheelsNumber = wheelsNumber;
        this.weight = weight;
    }

    public int getWheelsNumber() {
        return wheelsNumber;
    }

    public double getWeight() {
        return weight;
    }

    public void printInformation() {
        System.out.println("汽车:");
        System.out.println("轮子数:" + wheelsNumber + "个");
        System.out.println("自身重量:" + weight + "吨");

    }
}

class Car extends Vehicle {
    private final int passengerNumber;

    public Car(int wheelsNumber, double weight, int passengerNumber) {
        super(wheelsNumber, weight);
        this.passengerNumber = passengerNumber;
    }

    @Override
    public void printInformation() {
        System.out.println("小轿车:");
        System.out.println("轮子数:" + super.getWheelsNumber() + "个");
        System.out.println("自身重量:" + super.getWeight() + "吨");
        System.out.println("额定乘客数:" + passengerNumber + "人");

    }
}

class Trunk extends Vehicle {
    private final int passengerNumber;
    private final double load;

    public Trunk(int wheelsNumber, double weight, int passengerNumber, double load) {
        super(wheelsNumber, weight);
        this.passengerNumber = passengerNumber;
        this.load = load;
    }

    @Override
    public void printInformation() {
        System.out.println("卡车:");
        System.out.println("轮子数:" + super.getWheelsNumber() + "个");
        System.out.println("自身重量:" + super.getWeight() + "吨");
        System.out.println("额定乘客数" + passengerNumber + "人");
        System.out.println("载重量" + load + "吨");
    }
}