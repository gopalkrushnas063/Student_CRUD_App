package com.example.student_crud_app.controller;


import com.example.student_crud_app.entity.Student;
import com.example.student_crud_app.exception.StudentException;
import com.example.student_crud_app.services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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


    @GetMapping("/")
    public ResponseEntity<List<Student>> getAllStudentHandler() throws StudentException{
        List<Student> students = studentService.getAllStudent();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Student> updateStudentBYIDHandler(@PathVariable("id") Long id,Student student) throws StudentException{
        Student students = studentService.updateStudentByID(id,student);
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteStudentBYIDHandler(@PathVariable("id") Long id) throws StudentException{
        String res = studentService.deleteByID(id);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }
}
