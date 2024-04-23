package com.zois.ojt.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zois.ojt.dao.BoardDao;
import com.zois.ojt.dto.BoardDto;

@Service
public class BoardService {

	
	@Autowired
	BoardDao boardDao;
	public int boardInsert(BoardDto boardDto) {
		
		return boardDao.boardInsert(boardDto);
	}

	public List<Map<String, Object>> boardInfo() {
		// TODO Auto-generated method stub
		return boardDao.boardInfo();
	}

}
