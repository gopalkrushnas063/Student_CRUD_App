package com.example.student_crud_app.services;

import com.example.student_crud_app.entity.Student;
import com.example.student_crud_app.exception.StudentException;
import com.example.student_crud_app.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentServiceImpl implements StudentServices{
    @Autowired
    private StudentRepository studentRepo;

    @Override
    public Student registerNewStudent(Student student) throws StudentException {
        return studentRepo.save(student);
    }

    @Override
    public List<Student> getAllStudent() throws StudentException {
        List<Student> studentList = studentRepo.findAll();

        if(studentList.isEmpty()){
            throw new StudentException("No any record founds");
        }
        return studentList;
    }
}
