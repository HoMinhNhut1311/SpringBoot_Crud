package com.example.SpringBoot_Course.Reponsitories;

import com.example.SpringBoot_Course.enity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentReponsitories  extends JpaRepository<Student, Integer> {
    List<Student> findAllByFirstNameContaining(String cContain);
}
