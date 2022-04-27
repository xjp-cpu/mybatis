package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Dept;

import java.util.List;

public interface DeptMapper {

    int deleteByPrimaryKey(Integer did);


    int insert(Dept record);


    Dept selectByPrimaryKey(Integer did);

    List<Dept> selectAll();


    int updateByPrimaryKey(Dept record);
}