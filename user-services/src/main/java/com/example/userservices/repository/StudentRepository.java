package com.example.userservices.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.userservices.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

  Optional<Student> findByEmailAndPassword(String email, String password);
  Optional<Student> findByEmail(String email);

}
