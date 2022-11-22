package com.github.haohuiw.experiment.experiment03.ex7175;

import java.util.Scanner;

/**
 * @author Haohui-W
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Employer employer = new BasicEmployer(scan.next(), scan.next(), scan.nextDouble());
        employer.showSalary();
        employer.showBonus();
        Employer employer1 = new GoodEmployer(scan.next(), scan.next(), scan.nextDouble(), scan.nextDouble());
        employer1.showSalary();
        employer1.showBonus();

    }
}

abstract class Employer {
    private final String name;
    private final String department;
    private final double salary;

    public Employer(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public void showSalary() {
        System.out.println("我叫" + name + ",在" + department + "部门" + "，我的工资是" + salary);
    }

    /**
     * 显示奖金
     */
    public abstract void showBonus();
}

class BasicEmployer extends Employer {

    public BasicEmployer(String name, String department, double salary) {
        super(name, department, salary);
    }

    @Override
    public void showBonus() {
        System.out.println("我是普通员工，没有奖金，加油升级！");
    }
}

class GoodEmployer extends Employer {
    private final double bonus;

    public GoodEmployer(String name, String department, double salary, double bonus) {
        super(name, department, salary);
        this.bonus = bonus;
    }

    @Override
    public void showBonus() {
        System.out.println("我是优秀员工，我的奖金是" + bonus);
    }
}