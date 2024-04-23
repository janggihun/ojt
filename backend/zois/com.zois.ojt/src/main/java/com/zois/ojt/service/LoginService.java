package com.zois.ojt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zois.ojt.dao.LoginDao;
import com.zois.ojt.dto.LoginDto;

@Service
public class LoginService {

	
	@Autowired
	LoginDao loginDao;

	public int idcheck(LoginDto loginDto) {
	
		
		return loginDao.idcheck(loginDto);
	}
	
	
	
}
