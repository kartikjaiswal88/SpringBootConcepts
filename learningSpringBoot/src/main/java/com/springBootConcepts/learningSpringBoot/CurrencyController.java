package com.springBootConcepts.learningSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CurrencyController {
    @Autowired
    private CurrencyServiceConfiguration currencyServiceConfiguration;

    @GetMapping("/currency")
    public CurrencyServiceConfiguration retrieveAllCourses(){
        return currencyServiceConfiguration;
    }
}
