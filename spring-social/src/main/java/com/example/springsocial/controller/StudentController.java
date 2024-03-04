package com.example.springsocial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springsocial.dto.StudentDto;
import com.example.springsocial.model.Student;
import com.example.springsocial.service.StudentService;

@RestController
@RequestMapping("/api/")
public class StudentController {
    
    @Autowired
    private StudentService studentService;

    @PostMapping("student/create")
    public ResponseEntity<Student> saveStudent(@RequestBody Student student)
    {
       Student stud = studentService.saveStudent(student);

        return new ResponseEntity<>(stud , HttpStatus.OK);
    }
    @PutMapping("student/update/{id}")
    public ResponseEntity<Student> updateStudent( @PathVariable Long id ,@RequestBody Student student)
    {
       Student stud = studentService.updateStudent(id , student);

        return new ResponseEntity<>(stud , HttpStatus.OK);
    }

    @DeleteMapping("student/delete/{id}")
    public ResponseEntity<Student> deleteStudent( @PathVariable Long id)
    {
        studentService.deleteStudent(id);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    // @GetMapping("student/get/{id}")
    // public ResponseEntity<Student> getSingleStudent( @PathVariable Long id)
    // {
    //    Student stud = studentService.getStudent(id);

    //     return new ResponseEntity<>(stud , HttpStatus.OK);
    // }
    @GetMapping("student/get/{id}")
public ResponseEntity<StudentDto> getSingleStudent(@PathVariable Long id) {
    Student student = studentService.getStudent(id);
    if (student == null) {
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    StudentDto studentDTO = convertToDTO(student);
    return new ResponseEntity<>(studentDTO, HttpStatus.OK);
}

    // @GetMapping("student/get-all")
    // public ResponseEntity<Student> getAllStudents()
    // {
    //    List<Student> stud = studentService.getAllStudents();

    //     return new ResponseEntity<>(stud , HttpStatus.OK);
    // }
    @GetMapping("/student/get-all")
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> students = studentService.getAllStudents();
        return ResponseEntity.ok().body(students);
    }

    private StudentDto convertToDTO(Student student) {
        
        return new StudentDto(student.getId(), student.getFirstName(), student.getLastName() , student.getEmailId());
    }
}
