package com.github.haohuiw.experiment.experiment04.ex04.entity;

/**
 * @author Haohui-W
 */
public class Student {
    public enum Sex {
        //性别
        MALE, FEMALE
    }

    private int id;
    private Sex sex;
    private String name;
    private int year;

    public Student(int id, Sex sex, String name, int year) {
        this.id = id;
        this.sex = sex;
        this.name = name;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}