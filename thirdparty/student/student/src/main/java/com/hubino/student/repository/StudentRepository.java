package com.hubino.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hubino.student.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
