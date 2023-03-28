package com.github.haohuiW.experiment.experiment03.ex7176;

import java.util.Scanner;

interface Lecture {

    void lecture(String str);
}

/**
 * @author Haohui-W
 */
public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Teacher teacher = new Teacher();
        teacher.setLecture(new Lecture() {
            @Override
            public void lecture(String str) {
                System.out.println("我是英语老师，I say " + str);
            }
        });
        teachingRace(teacher);
        Teacher teacher1 = new Teacher();
        teacher1.setLecture(new Lecture() {
            @Override
            public void lecture(String str) {
                System.out.println("我是数学老师，I say " + str);
            }
        });
        teachingRace(teacher1);
    }

    public static void teachingRace(Teacher t) {
        t.getLecture().lecture(scanner.next());
    }
}

class Teacher {
    private Lecture lecture;

    public Lecture getLecture() {
        return lecture;
    }

    public void setLecture(Lecture lecture) {
        this.lecture = lecture;
    }


}