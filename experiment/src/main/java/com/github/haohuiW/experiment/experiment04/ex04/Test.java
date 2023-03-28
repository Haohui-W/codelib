package com.github.haohuiW.experiment.experiment04.ex04;


import com.github.haohuiW.experiment.experiment04.ex04.resource.DatabaseUtils;
import com.github.haohuiW.experiment.experiment04.ex04.service.impl.StudentServiceImpl;
import com.github.haohuiW.experiment.experiment04.ex04.entity.Student;

import java.util.List;
import java.util.Map;

/**
 * @author Haohui-W
 */
public class Test {

    public static void main(String[] args) {
        StudentServiceImpl studentService = new StudentServiceImpl();
        List<Student> students = studentService.addStudent(new Student(201207, Student.Sex.MALE, "张三", 2012));
        students.forEach(a-> System.out.println("id="+a.getId()+"\tsec="+a.getSex()+"\tname="+a.getName()+"\tyear="+a.getYear()));
        System.out.println();

        List<Student> students1 = studentService.listStudentsByYear(2012);
        students1.forEach(a-> System.out.println("id="+a.getId()+"\tsec="+a.getSex()+"\tname="+a.getName()+"\tyear="+a.getYear()));
        System.out.println();

        List<String> strings = studentService.listStudentsNames(2012, Student.Sex.MALE);
        strings.forEach(System.out::println);
        System.out.println();

        Map<Student.Sex, List<Student>> sexListMap = studentService.mapStudentsBySex();
        sexListMap.forEach((a,b)->{
            System.out.println(a+":");
            b.forEach(t-> System.out.println("id="+t.getId()+"\tsec="+t.getSex()+"\tname="+t.getName()+"\tyear="+t.getYear()));
        });
        System.out.println();

        System.out.println(studentService.removeStudent(201104));
        DatabaseUtils.getStudents().forEach(a-> System.out.println("id="+a.getId()+"\tsec="+a.getSex()+"\tname="+a.getName()+"\tyear="+a.getYear()));
        System.out.println();
    }
}
