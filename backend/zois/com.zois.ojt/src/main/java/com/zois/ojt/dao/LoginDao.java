package com.zois.ojt.dao;

import org.apache.ibatis.annotations.Mapper;

import com.zois.ojt.dto.LoginDto;

@Mapper
public interface LoginDao {

	int idcheck(LoginDto loginDto);

}
