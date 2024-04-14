package com.example.SpringBoot_Course.handle;


import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class methodHandle {

    // Method Handle

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public String handleAgrumentNotValid(
            MethodArgumentNotValidException exp
    ) {
        StringBuilder builder = new StringBuilder();
        exp.getAllErrors().forEach(error ->
                {
                    FieldError fieldError = (FieldError) error;
                    builder.append(fieldError.getField() + " : "+error.getDefaultMessage() + "\n");
                }
        );
        return builder.toString();
    }
}
