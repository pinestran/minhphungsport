package com.thongtv.controller;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.thongtv.entities.Employee;
import com.thongtv.entities.Product;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@Autowired
	SessionFactory sessionFactory;
	
	@GetMapping
	@Transactional
	public String loginPage(ModelMap model) {
		
		Session session = this.sessionFactory.getCurrentSession();
		
		Employee employee = new Employee();
		employee.setName("Bết Bánh");
		employee.setAddress("Vịnh Bắc Bộ");
		employee.setAge(14);
		
		Set<Product> listSet = new HashSet<>();
		Product product1 = new Product();
		product1.setName("Bánh Bao");
		product1.setPrice(13.000);
		
		Product product2 = new Product();
		product2.setName("Bánh Bèo");
		product2.setPrice(69.000);
		
		Product product3 = new Product();
		product3.setName("Bánh Ú");
		product3.setPrice(5.000);
		
		listSet.add(product1);
		listSet.add(product2);
		listSet.add(product3);
		
		employee.setSet(listSet);
		
		session.save(employee);
		
		return "index";
	}
}