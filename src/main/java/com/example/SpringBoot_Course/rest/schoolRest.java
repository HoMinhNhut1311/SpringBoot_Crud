package com.example.SpringBoot_Course.rest;

import com.example.SpringBoot_Course.Dto.SchoolDto;
import com.example.SpringBoot_Course.Reponsitories.SchoolReponsitories;
import com.example.SpringBoot_Course.Service.SchoolService;
import com.example.SpringBoot_Course.enity.School;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/school/*")
public class schoolRest {

    private final SchoolService service;

    public schoolRest(SchoolService service) {
        this.service = service;
    }


    @GetMapping("/")
    public List<SchoolDto> get_allSchool() {
       return this.service.findALl();
    }

    @GetMapping("/{id}")
    public SchoolDto get_SchoolId(
           @Valid @PathVariable Integer id
    ) {
        return this.service.findBSchool_byId(id);
    }

    @PostMapping("/")
    public SchoolDto createSchool(
          @Valid @RequestBody SchoolDto SchoolDto
    ) {
        return this.service.saveSchool(SchoolDto);
    }



}
