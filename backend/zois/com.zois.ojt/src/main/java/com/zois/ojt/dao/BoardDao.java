package com.zois.ojt.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.zois.ojt.dto.BoardDto;

@Mapper
public interface BoardDao {

	int boardInsert(BoardDto boardDto);

	List<Map<String, Object>> boardInfo();

}
