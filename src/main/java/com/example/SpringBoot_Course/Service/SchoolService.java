package com.example.SpringBoot_Course.Service;

import com.example.SpringBoot_Course.Dto.SchoolDto;
import com.example.SpringBoot_Course.Reponsitories.SchoolReponsitories;
import com.example.SpringBoot_Course.Util.MapperData;
import com.example.SpringBoot_Course.enity.School;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SchoolService {

    private final SchoolReponsitories reponsitories;
    private final MapperData mapperData;

    public SchoolService(SchoolReponsitories reponsitories, MapperData mapperData) {
        this.reponsitories = reponsitories;
        this.mapperData = mapperData;
    }

    public List<SchoolDto> findALl() {
        return reponsitories.findAll().stream().
                map(this.mapperData::toSchoolDTO).collect(Collectors.toList());
    }
    public SchoolDto saveSchool(SchoolDto SchoolDto) {
        School school = this.mapperData.toSchool(SchoolDto);
        this.reponsitories.save(school);
        return SchoolDto;
    }

    public SchoolDto findBSchool_byId(Integer id) {
        School school =  this.reponsitories.findById(id).orElse(null);
        return this.mapperData.toSchoolDTO(school);
    }

}
