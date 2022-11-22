package com.github.haohuiw.experiment.experiment03.ex7173;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SpottedDog spottedDog = new SpottedDog(scanner.next(), scanner.nextInt(), scanner.next(), scanner.next());
        UnspottedDog unspottedDog = new UnspottedDog(scanner.next(), scanner.nextInt(), scanner.next());
        spottedDog.show();
        unspottedDog.show();
    }
}

class Dog {
    private String breed;
    private int weight;
    private String color;

    public Dog(String breed, int weight, String color) {
        this.breed = breed;
        this.weight = weight;
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    void show() {
        System.out.println("这是一只" + breed + "体重为" + weight + ",颜色为" + color);
    }
}

class SpottedDog extends Dog {
    private String spotColor;

    public SpottedDog(String breed, int weight, String color, String spotColor) {
        super(breed, weight, color);
        this.spotColor = spotColor;
    }

    public String getSpotColor() {
        return spotColor;
    }

    public void setSpotColor(String spotColor) {
        this.spotColor = spotColor;
    }

    @Override
    void show() {
        super.show();

        System.out.println("这是一只" + getBreed() + ",颜色为" + getColor() + ",斑点颜色为" + getSpotColor());

    }
}

class UnspottedDog extends Dog {
    public UnspottedDog(String breed, int weight, String color) {
        super(breed, weight, color);
    }

    @Override
    void show() {
        System.out.println("这是一只" + getBreed() + "犬");
    }
}