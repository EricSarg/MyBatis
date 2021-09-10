package com.example.demo.mapper;


import com.example.demo.models.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from useraaa")
    List<User> allUser();
}
