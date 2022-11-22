package com.github.haohuiw.homework.homework03;


public class CourseTest {
    private static void testNewStudent() {
        Course course = new Course();
        course.setNum("2018001");
        course.setCompulsory(true);
        course.setName("Java程序设计");
        System.out.println(course.getName() + " " + course.getNum() + " " + course.isCompulsory());
        course.setNum("2018001");
        course.setCompulsory(false);
        course.setName("Web开发技术");
        System.out.println(course.getName() + " " + course.getNum() + " " + course.isCompulsory());
    }

    public static void main(String[] args) {
        testNewStudent();
    }
}
