package com.example.demo.model.controller;

import java.util.List;


import com.example.demo.model.dto.portfolio;
import com.example.demo.model.service.TestService;

import com.example.demo.model.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class TestController {
    private final TestService testService;

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/test")
    public List<portfolio> test() {

        return testService.getAllDataList();
    }
}