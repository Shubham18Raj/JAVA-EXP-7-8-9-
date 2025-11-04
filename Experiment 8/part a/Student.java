package com.example.springdi;

public class Student {
    private Course course;

    public Student(Course course) { // Constructor-based Injection
        this.course = course;
    }

    public void showInfo() {
        System.out.println("Student enrolled in course: " + course.getCourseName());
    }
}

