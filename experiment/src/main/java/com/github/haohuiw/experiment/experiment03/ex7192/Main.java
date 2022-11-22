package com.github.haohuiw.experiment.experiment03.ex7192;

interface Paper {
    String getName();
}

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print(new A4Paper());
        printer.print(new A6Paper());
    }
}

class Printer {
    public void print(Paper p) {
        System.out.println(p.getName());
    }
}

class A4Paper implements Paper {
    @Override
    public String getName() {
        return "A4";
    }
}

class A6Paper implements Paper {

    @Override
    public String getName() {
        return "A6";
    }
}