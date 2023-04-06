package com.example.student_crud_app.services;

import com.example.student_crud_app.entity.Student;
import com.example.student_crud_app.exception.StudentException;
import com.example.student_crud_app.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentServiceImpl implements StudentServices{
    @Autowired
    private StudentRepository studentRepo;

    @Override
    public Student registerNewStudent(Student student) throws StudentException {
        return studentRepo.save(student);
    }
}
