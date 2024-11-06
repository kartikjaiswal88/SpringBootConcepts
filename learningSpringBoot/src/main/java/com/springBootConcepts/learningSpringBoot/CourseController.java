package com.springBootConcepts.learningSpringBoot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @GetMapping("/courses")
    public List<Course> retrieveAllCourses(){
        System.out.println("Hello Kartik");
        return Arrays.asList(
                new Course(1,"Learn React", "Kartik Jaiswal"),
                new Course(2,"Learn Kafka", "Kartik Jaiswal"),
                new Course(3,"Learn Spark", "Kartik Jaiswal"),
                new Course(4,"Learn Java","Kartik Jaiswal")

        );
    }
}
