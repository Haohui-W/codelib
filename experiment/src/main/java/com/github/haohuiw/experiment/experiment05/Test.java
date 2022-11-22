package com.github.haohuiw.experiment.experiment05;

import com.github.haohuiw.experiment.experiment05.entity.College;
import com.github.haohuiw.experiment.experiment05.entity.Student;
import com.github.haohuiw.experiment.experiment05.entity.Teacher;
import com.github.haohuiw.experiment.experiment05.resource.DatabaseUtils;

import java.util.List;

/**
 * @author Haohui-W
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(getCollegeName(DatabaseUtils.getStudents(),201001));
        printCollegeName(DatabaseUtils.getStudents(), 201103, 1002);
    }

    /**
     * 基于给定学生集合，学生编号，实现获取学生的导师的所在学院名称。
     * 任何一项不存在或失败，返回 未知学院
     * 结合collection stream findFirst()方法实现
     * 可直接通过一条方法链实现
     * @param students 学生集合
     * @param sNumber 学生编号
     * @return 学院名
     */
    private static String getCollegeName(List<Student> students, int sNumber) {
        return students.stream()
                .filter(e->e.getNumber()==sNumber)
                .findFirst()
                .map(Student::getTeacher)
                .map(Teacher::getCollege)
                .orElseGet(()->new College("未知学院"))
                .getName();
    }

    /**
     * 实现在给定学生集合中查询指定编号学生，如果学生导师编号为指定编号，打印显式导师所在学院名称。
     * 任何一项不存在或失败，打印显式 未知学院
     * 结合collection stream findFirst()方法实现
     * 可直接通过一条方法链实现
     * @param students 学生集合
     * @param sNumber 学生编号
     * @param tNumber 教师编号
     */
    private static void printCollegeName(List<Student> students, int sNumber, int tNumber) {
        System.out.println(students.stream()
                .filter(e -> sNumber == e.getNumber())
                .findFirst()
                .map(Student::getTeacher)
                .filter(e -> tNumber == e.getNumber())
                .map(Teacher::getCollege)
                .orElseGet(() -> new College("未知学院"))
                .getName());

    }

}