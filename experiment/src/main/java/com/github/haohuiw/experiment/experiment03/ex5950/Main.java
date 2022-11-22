package com.github.haohuiw.experiment.experiment03.ex5950;

import java.util.Scanner;

interface ComputerAverage {
    //start
    //write your code between start and  end,do not  delete any code
    double average(double[] data);
    //end
}

class Gymnastics implements ComputerAverage {
    @Override
    public double average(double[] data) {
        double sum = 0;
        double temp;
        //start
        //write your code between start and  end,do not  delete any code
        temp = data[0];
        for (double datum : data) {
            sum += datum;
            if (datum > temp) {
                temp = datum;
            }
        }
        sum -= temp;
        for (double datum : data) {
            if (datum < temp) {
                temp = datum;
            }
        }
        sum -= temp;
        return sum / (data.length - 2);
        //end
    }
}

class School implements ComputerAverage {
    //start
    //write your code between start and  end,do not  delete any code

    @Override
    public double average(double[] data) {
        double sum = 0;
        for (double datum : data) {
            sum += datum;
        }
        sum /= data.length;


        //end
        return sum;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double[] data = new double[n];
        for (int i = 0; i < n; i++) {
            data[i] = scan.nextDouble();
        }
        //start
        //write your code between start and  end,do not  delete any code
        ComputerAverage g = new Gymnastics();
        //end
        System.out.print("Gymnastics average is:");
        System.out.printf("%.2f\n", g.average(data));
        //start
        //write your code between start and  end,do not  delete any code
        g = new School();
        //end
        System.out.print("School average is:");
        System.out.printf("%.2f", g.average(data));
    }
}