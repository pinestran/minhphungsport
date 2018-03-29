package com.thongtv.sercices.Impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thongtv.DAO.LoginDAO;
import com.thongtv.sercices.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginDAO loginDAO;
	
	public Map<String, String> checkLogin(String email, String password) {
		
		return loginDAO.checkLogin(email, password);
	}

}
