package com.github.haohuiw.experiment.experiment02.ex7202;

import java.util.Scanner;

/**
 * @author Haohui-W
 */
public class Main {
    public static void main(String[] args) {
        int m, n;    //第一个数的实部和虚部
        int p, q;    //第二个数的实部和虚部
        Scanner scanner = new Scanner(System.in);
        m = scanner.nextInt();
        n = scanner.nextInt();
        p = scanner.nextInt();
        q = scanner.nextInt();
        Complex t = new Complex(m, n);
        Complex s = new Complex(t);
        Complex r = new Complex(p, q);
        (s.Add(r)).Print();
        (t.Sub(r)).Print();
    }
}

// Write your own code
class Complex {
    int a, b;

    public Complex(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Complex(Complex complex) {
        this.a = complex.a;
        this.b = complex.b;
    }

    public Complex Add(Complex complex) {
        return new Complex(complex.a + a, complex.b + b);
    }

    public Complex Sub(Complex complex) {
        return new Complex(a - complex.a, b - complex.b);
    }

    public void Print() {
        System.out.print(a + " ");
        if (b == 0) {
            System.out.println();
        } else {
            System.out.println(b + "i");
        }
    }
}