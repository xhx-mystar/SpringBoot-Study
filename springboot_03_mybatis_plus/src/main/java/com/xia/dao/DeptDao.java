package com.xia.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xia.domain.Dept;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DeptDao extends BaseMapper<Dept> {
}
