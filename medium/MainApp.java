package com.example;

public class MainApp {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();

        // Create
        Student s1 = new Student("John Doe", 21);
        dao.createStudent(s1);

        // Read
        Student fetched = dao.getStudent(s1.getId());
        System.out.println("Fetched: " + fetched);

        // Update
        dao.updateStudent(s1.getId(), "John Updated", 22);

        // Delete
        dao.deleteStudent(s1.getId());
    }
}
