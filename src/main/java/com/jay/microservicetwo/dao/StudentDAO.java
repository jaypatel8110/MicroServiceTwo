package com.jay.microservicetwo.dao;

import com.jay.microservicetwo.models.Employees;
import com.jay.microservicetwo.models.Student;
import com.jay.microservicetwo.models.StudentList;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class StudentDAO {
    private static StudentList list = new StudentList();

    static {
        list.getStudentList().add(new Student("Jay", 27));
        list.getStudentList().add(new Student("Prerna", 27));
    }

    public StudentList getAllStudent() {
        return list;
    }

    public void addStudentList(ArrayList<Student> studentList) {
        for (Student student : studentList) {
            list.getStudentList().add(student);
        }

    }
}
