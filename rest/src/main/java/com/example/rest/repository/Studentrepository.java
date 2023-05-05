package com.example.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.rest.model.Student;

@Repository
public interface Studentrepository extends JpaRepository<Student,Integer>{

}
