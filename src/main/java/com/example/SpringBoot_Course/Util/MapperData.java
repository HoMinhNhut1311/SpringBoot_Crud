package com.example.SpringBoot_Course.Util;

import com.example.SpringBoot_Course.Dto.SchoolDto;
import com.example.SpringBoot_Course.Dto.StudentDto;
import com.example.SpringBoot_Course.ResponeDto.StudentResponeDto;
import com.example.SpringBoot_Course.enity.School;
import com.example.SpringBoot_Course.enity.Student;
import org.springframework.stereotype.Service;

@Service
public class MapperData {

    public Student dtoToStudent(StudentDto dto) {
        Student student = new Student();
        student.setFirstName(dto.firstName());
        student.setAge(dto.age());
        student.setLastName(dto.lastName());
        student.setEmail(dto.email());

        School school = new School();
        school.setId(dto.schoolId());
        student.setSchool(school);

        return student;
    }

    public StudentResponeDto ReturnStudentResponeDto(Student student) {
        return new StudentResponeDto(
                student.getFirstName(),student.getLastName(), student.getEmail()
        );
    }

    public School toSchool(SchoolDto schoolDto) {
        School school = new School();
        school.setName(schoolDto.name());
        return school;
    }

    public SchoolDto toSchoolDTO(School school) {
        return new SchoolDto(school.getName());
    }
}
