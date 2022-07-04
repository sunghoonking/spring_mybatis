package com.example.demo.model.service;

import java.util.List;

import com.example.demo.model.mapper.TestMapper;
import com.example.demo.model.dto.portfolio;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TestServiceImpl implements TestService {
    private final TestMapper testMapper;

    @Override
    public List<portfolio> getAllDataList() {
        return testMapper.getAllDataList();
    }
}