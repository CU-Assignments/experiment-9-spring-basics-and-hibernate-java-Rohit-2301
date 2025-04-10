package com.example;

public class Student {
    private String name;
    private Course course;

    public Student(String name, Course course) {
        this.name = name;
        this.course = course;
    }

    public void display() {
        System.out.println("Student: " + name);
        System.out.println("Course: " + course.getCourseName());
        System.out.println("Duration: " + course.getDuration() + " months");
    }
}
