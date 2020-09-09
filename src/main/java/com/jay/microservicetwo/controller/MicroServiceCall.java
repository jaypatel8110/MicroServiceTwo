package com.jay.microservicetwo.controller;

import com.jay.microservicetwo.dao.StudentDAO;
import com.jay.microservicetwo.models.Student;
import com.jay.microservicetwo.models.StudentList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/studentinfo")
public class MicroServiceCall {

    @Autowired
    StudentDAO studentDAO;

    @GetMapping(value = "/" ,produces = "application/json")
    public StudentList callMicroServiceTwo() {
        return studentDAO.getAllStudent();

    }
}
