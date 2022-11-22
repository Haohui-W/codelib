package com.github.haohuiw.experiment.experiment04.ex04.service.impl;

import com.github.haohuiw.experiment.experiment04.ex04.entity.Student;
import com.github.haohuiw.experiment.experiment04.ex04.resource.DatabaseUtils;
import com.github.haohuiw.experiment.experiment04.ex04.service.StudentService;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Haohui-W
 */
public class StudentServiceImpl implements StudentService {
    @Override
    public List<Student> addStudent(Student student) {
        DatabaseUtils.getStudents().add(student);
        return DatabaseUtils.getStudents();
    }

    @Override
    public List<Student> listStudentsByYear(int year) {
        return DatabaseUtils.getStudents()
                .stream()
                .filter(a-> year==a.getYear())
                .collect(Collectors.toList());
    }

    @Override
    public List<String> listStudentsNames(int year, Student.Sex sex) {
        return DatabaseUtils.getStudents()
                .stream()
                .filter(a -> year==a.getYear())
                .filter(a -> sex==a.getSex())
                .map(Student::getName)
                .collect(Collectors.toList());
    }

    @Override
    public Map<Student.Sex, List<Student>> mapStudentsBySex() {

        return DatabaseUtils.getStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getSex));
    }

    @Override
    public boolean removeStudent(int id) {

        return DatabaseUtils.getStudents().removeIf(a -> a.getId()==id);
    }
}
