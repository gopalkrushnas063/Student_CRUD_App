package com.example.student_crud_app.controller;


import com.example.student_crud_app.entity.Student;
import com.example.student_crud_app.exception.StudentException;
import com.example.student_crud_app.services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentServices studentService;


    @PostMapping("/")
    public ResponseEntity<Student> registerNewStudentHandler(@RequestBody Student student) throws StudentException{
        Student student1 = studentService.registerNewStudent(student);
        return new ResponseEntity<>(student1, HttpStatus.ACCEPTED);
    }
}
