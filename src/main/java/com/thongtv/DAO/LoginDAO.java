package com.thongtv.DAO;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.thongtv.entities.Users;
import com.thongtv.sercices.LoginService;

@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class LoginDAO implements LoginService{
	
	@Autowired
	SessionFactory session;

	@Transactional
	public Map<String, String> checkLogin(String email, String password) {
		
		Session sec = session.getCurrentSession();
		Map<String, String> result = new HashMap<String, String>();
		String query = "from USERS where password = '"+password+"' and email = '" +email+"'";
		try {
			Users user = (Users) sec.createQuery(query).getSingleResult();
			if(user != null) {
				result.put("result", "Login Success");
			}else {
				result.put("result", "Login fail");
			}
		}
		catch(Exception ex) {
			result.put("result", "Login fail");
			ex.printStackTrace();
		}
		return result;
	}

}
