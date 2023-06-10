package kz.bitlab.spring1.controller;

import kz.bitlab.spring1.db.Student;

import java.util.ArrayList;

public class DBManager {

    private static ArrayList<Student> students = new ArrayList<>();
    private static Long id=3L;

    static {
        students.add(new Student(1L, "Almira", "Ashygali", 49));
        students.add(new Student(2L, "Ben", "B", 90));
    }

    public static ArrayList<Student> getStudents(){
        return students;
    }

    public static void add(Student student){
        student.setId(id);
        id++;
        students.add(student);
    }
}
