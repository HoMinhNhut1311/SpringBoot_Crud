package com.example.SpringBoot_Course.Service;

import com.example.SpringBoot_Course.Dto.StudentDto;
import com.example.SpringBoot_Course.Reponsitories.StudentReponsitories;
import com.example.SpringBoot_Course.ResponeDto.StudentResponeDto;
import com.example.SpringBoot_Course.Util.MapperData;
import com.example.SpringBoot_Course.enity.Student;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class StudentService {

    private final StudentReponsitories reponsitories;
    private final MapperData mapperData;

    public StudentService(StudentReponsitories reponsitories, MapperData mapperData) {
        this.reponsitories = reponsitories;
        this.mapperData = mapperData;
    }

    public StudentResponeDto saveStudent(StudentDto dto) {
        Student student = this.reponsitories.save(this.mapperData.dtoToStudent(dto));
        return this.mapperData.ReturnStudentResponeDto(student);
    }

    public StudentResponeDto findById(Integer id) {
        Student student = this.reponsitories.findById(id).orElse(null);
        return (student != null) ? this.mapperData.ReturnStudentResponeDto(student) : null;
    }

    public List<StudentResponeDto> findAllByFirstNameContaining(String firstName) {
        return this.reponsitories.findAllByFirstNameContaining(firstName)
                .stream().map(this.mapperData::ReturnStudentResponeDto)
                .collect(Collectors.toList());
    }

    public List<StudentResponeDto> findAll() {
        return this.reponsitories.findAll().stream().
                map(this.mapperData::ReturnStudentResponeDto).collect(Collectors.toList());
    }
}
