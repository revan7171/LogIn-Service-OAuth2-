package com.example.springsocial.service;


import java.util.List;

import com.example.springsocial.model.Student;

public interface StudentService {

    public Student saveStudent(Student student);

    public Student updateStudent(Long id , Student student);

    public void deleteStudent(Long id);

    public Student getStudent(Long id);
 
    public List<Student> getAllStudents();
} 