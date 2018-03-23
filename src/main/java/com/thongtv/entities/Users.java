package com.thongtv.entities;

import java.util.Calendar;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name="USERS")
public class Users {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String username;
	private String password;
	private String email;
	private String phone;
	
	@Column(name="date_of_birth")
	private Calendar dateOfBirth;
	private boolean sex;
	private String address;
	
	@Column(name="date_of_account")
	private Calendar dataOfAccount;
	private String role;

	/**
	 * LAZY = fetch when needed 
	 * EAGER = fetch immediately
	 */
	@OneToMany(fetch=FetchType.LAZY,  mappedBy="users")
	private Set<Bank> lstBank;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="users")
	private Set<Product> lstProducts;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="users")
	private Set<Image> lstImg;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="users")
	private Set<BillDetail> lstBillDetails;
	
	public Users() {
	}

	public Users(String username, String password, String email,
			String phone, String address,
			Calendar dataOfAccount, String role) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.dataOfAccount = dataOfAccount;
		this.role = role;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Calendar getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Calendar dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Calendar getDataOfAccount() {
		return dataOfAccount;
	}

	public void setDataOfAccount(Calendar dataOfAccount) {
		this.dataOfAccount = dataOfAccount;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Set<Bank> getLstBank() {
		return lstBank;
	}

	public void setLstBank(Set<Bank> lstBank) {
		this.lstBank = lstBank;
	}

	public Set<Product> getLstProducts() {
		return lstProducts;
	}

	public void setLstProducts(Set<Product> lstProducts) {
		this.lstProducts = lstProducts;
	}

	public Set<Image> getLstImg() {
		return lstImg;
	}

	public void setLstImg(Set<Image> lstImg) {
		this.lstImg = lstImg;
	}

}
