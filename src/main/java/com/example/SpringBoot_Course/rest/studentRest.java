package com.example.SpringBoot_Course.rest;

import com.example.SpringBoot_Course.Dto.StudentDto;
import com.example.SpringBoot_Course.Reponsitories.StudentReponsitories;
import com.example.SpringBoot_Course.ResponeDto.StudentResponeDto;
import com.example.SpringBoot_Course.Service.StudentService;
import com.example.SpringBoot_Course.enity.School;
import com.example.SpringBoot_Course.enity.Student;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student/*")
public class studentRest {

    private final  StudentService service;

    public studentRest(StudentService service) {
        this.service = service;
    }

    @GetMapping("/")
    public List<StudentResponeDto> get_allStudent() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public StudentResponeDto get_StudentById(
            @PathVariable("id") Integer id
    ) {
        return service.findById(id);
    }

    @PostMapping("/")
    public StudentResponeDto addStudent(
            @Valid @RequestBody StudentDto dto
    ) {
        return service.saveStudent(dto);
    }

    @GetMapping("/search/{f-name}")
    public List<StudentResponeDto> get_StudentContainName(
            @PathVariable("f-name") String firstName
    ) {
        return service.findAllByFirstNameContaining(firstName);
    }

}
