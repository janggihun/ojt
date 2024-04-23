package com.zois.ojt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zois.ojt.dto.BoardDto;
import com.zois.ojt.service.BoardService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/board")
public class RestBoardController {

	@Autowired
	BoardService boardService;

	
	@GetMapping("info")
	public List<Map<String, Object>> boardInfo(){

		return boardService.boardInfo();
	}
	
	
	@PostMapping("/insert")
	public int boardInsert(@RequestBody BoardDto boardDto) {
		
		return boardService.boardInsert(boardDto);
	}


	
	
}
