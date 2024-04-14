package com.example.SpringBoot_Course.Dto;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public record StudentDto(
        @NotEmpty
        String firstName,
        @NotEmpty
        String lastName,
        @NotEmpty
          String email,
        @NotNull
        Integer age,
        @NotNull
        Integer schoolId
) {
}
