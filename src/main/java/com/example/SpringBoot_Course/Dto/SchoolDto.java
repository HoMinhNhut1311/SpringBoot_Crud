package com.example.SpringBoot_Course.Dto;

import jakarta.validation.constraints.NotEmpty;

public record SchoolDto(
        @NotEmpty
        String name
) {
}
