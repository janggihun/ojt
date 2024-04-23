package com.zois.ojt.controller;

import java.net.http.HttpRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zois.ojt.dto.LoginDto;
import com.zois.ojt.service.LoginService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/login")
public class RestLoiginController {

	@Autowired
	LoginService loginService;

	@GetMapping("/Status")
	public int loginStatus(HttpSession session) {
		
		Object userId = session.getAttribute("userId");
		log.info("{}",session.getAttribute("userId"));
		
		if (userId == null) {
			return 0;
		} else {
			return 1;
		}
	}

	@PostMapping("/idcheck")
	public int idcheck(@RequestBody LoginDto loginDto, HttpSession session) {
		
		int result = loginService.idcheck(loginDto);
		
		if (result == 1) {
			session.setAttribute("userId", loginDto.getUserId());
			log.info("result : {}", session.getAttribute("userId"));
			session.setMaxInactiveInterval(1800);
			
		}

		return result;
	}

}
