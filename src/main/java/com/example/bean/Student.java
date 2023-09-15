package com.example.bean;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Data
@Component
@Slf4j
public class Student {

    private Long id;

    private String name;

    public Student() {
        log.info("Student:{}", this.getClass().getSimpleName());
    }

}
