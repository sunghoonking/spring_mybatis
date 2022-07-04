package com.example.demo.model.mapper;

import java.util.List;
import com.example.demo.model.dto.portfolio;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface TestMapper {
    List<portfolio> getAllDataList();
}