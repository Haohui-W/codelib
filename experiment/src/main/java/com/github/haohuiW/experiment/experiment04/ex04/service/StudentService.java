package com.github.haohuiW.experiment.experiment04.ex04.service;

import com.github.haohuiW.experiment.experiment04.ex04.entity.Student;

import java.util.List;
import java.util.Map;

/**
 * @author Haohui-W
 */
public interface StudentService {
    /**
     * 向集合添加一个学生，返回当前全部学生
     * @param student 学生
     * @return 学生列表
     */
    List<Student> addStudent(Student student);

    /**
     * 返回指定届的全部学生
     * @param year 指定的年份
     * @return 学生列表
     */
    List<Student> listStudentsByYear(int year);

    /**
     * 返回指定届，指定性别的全部学生的姓名
     * @param year 指定的年份
     * @param sex 指定的性别
     * @return 学生姓名列表
     */
    List<String> listStudentsNames(int year, Student.Sex sex);

    /**
     * 将所有学生，以性别分组
     * @return 学生性别-学生列表 map
     */
    Map<Student.Sex, List<Student>> mapStudentsBySex();

    /**
     * 删除指定学号的学生，返回是否成功删除
     * @param  id 学生id
     * @return 是否删除成功
     */
    boolean removeStudent(int id);
}
