package com.thongtv.sercices;

import java.util.Map;

public interface LoginService {

	Map<String,String> checkLogin(String email, String password);
	
}
