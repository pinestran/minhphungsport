package com.thongtv.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.thongtv.sercices.Impl.LoginServiceImpl;

@Controller
@RequestMapping("login/")
public class LoginController {

	@Autowired
	LoginServiceImpl loginServiceImpl;
	
	@GetMapping
	public String pageDefault() {
		
		return "login";
	}
	
	
	@PostMapping
	@Transactional
	public String login(@RequestParam String email, @RequestParam String password, ModelMap model) {
		
		Map<String, String> result = loginServiceImpl.checkLogin(email, password);
		model.addAttribute("result", result.get("result"));
		
		return "login";
	}
}
