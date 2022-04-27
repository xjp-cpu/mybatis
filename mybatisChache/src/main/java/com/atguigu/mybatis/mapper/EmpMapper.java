package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Emp;

import java.util.List;

public interface EmpMapper {

    int deleteByPrimaryKey(Integer id);


    int insert(Emp record);


    Emp selectByPrimaryKey(Integer id);


    List<Emp> selectAll();


    int updateByPrimaryKey(Emp record);
}