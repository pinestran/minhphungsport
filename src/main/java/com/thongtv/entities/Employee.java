package com.thongtv.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import jdk.nashorn.internal.ir.annotations.Reference;

@Entity(name = "Employees")
public class Employee {
	
	@Column(name="id")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private int age;
	private String address;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="nhanvien_sanpham",
			joinColumns={@JoinColumn(name="idNhanVien", referencedColumnName="id")},
			inverseJoinColumns= {@JoinColumn(name="idSanPham", referencedColumnName="id")}
			)
	Set<Product> set;

	public Set<Product> getSet() {
		return set;
	}

	public void setSet(Set<Product> set) {
		this.set = set;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
