package com.example.springsocial.repository;

import com.example.springsocial.model.Student;
import com.example.springsocial.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    // Optional<User> findByEmail(String email);

    // Boolean existsByEmail(String email);

}
