package com.example.springsocial.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springsocial.model.Student;
import com.example.springsocial.repository.StudentRepository;

@Service
public class StudentServiceImpl  implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student updateStudent(Long id, Student student) {

        Student updatedStudent =null;
     
       Student std = studentRepository.getById(id);
        if(std!=null){
           std.setFirstName(student.getFirstName());
           std.setLastName(student.getLastName());
           std.setEmailId(student.getEmailId());

          updatedStudent = studentRepository.save(std);
        }
       return updatedStudent;
    }

    @Override
    public Student getStudent(Long id) {
      return studentRepository.getById(id);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
    
}
