package com.thongtv.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.thongtv.entities.Users;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@Autowired
	SessionFactory sessionFactory;
	
	@GetMapping
	@Transactional
	public String loginPage() {
		
		Session session = this.sessionFactory.getCurrentSession();
				
/*		Users user = new Users( );
		user.setUsername("thong.tv");
		user.setEmail("thong.tv@mail.com");
		user.setPassword("12345");
		user.setPhone("0987234234");
		user.setAddress("Gò Vấp");

		session.save(user);
*/		
		return "index";
	}
	
	@RequestMapping("/cart")
	public String cartPage(){
		return "cart";
	}
	
	@RequestMapping("/addproduct")
	public String cartaddproduct(){
		return "addproduct";
	}
	@RequestMapping("/dashboard")
	public String dashboardPage(){
		return "dashboard";
	}
	@RequestMapping("/detail")
	public String detailPage(){
		return "detail";
	}
	@RequestMapping("/index")
	public String indexPage(){
		return "index";
	}

	@RequestMapping("/product")
	public String productPage(){
		return "product";
	}
}