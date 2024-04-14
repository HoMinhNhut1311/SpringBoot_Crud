package com.example.SpringBoot_Course.Reponsitories;

import com.example.SpringBoot_Course.enity.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolReponsitories  extends JpaRepository<School,Integer> {

}
