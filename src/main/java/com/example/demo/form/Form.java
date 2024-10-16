package com.example.demo.form;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class Form {
    private String name;
    private String age;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate birth;

}
