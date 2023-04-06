package com.example.student_crud_app.services;

import com.example.student_crud_app.entity.Student;
import com.example.student_crud_app.exception.StudentException;

public interface StudentServices {
    public Student registerNewStudent(Student student) throws StudentException;
}
