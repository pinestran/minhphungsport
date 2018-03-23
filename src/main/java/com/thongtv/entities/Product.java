package com.thongtv.entities;

import java.util.Calendar;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity(name = "PRODUCT")
public class Product {

	/*
	 * @Id
	 * 
	 * @GeneratedValue(strategy=GenerationType.IDENTITY) private int id; private
	 * String name; private double price;
	 * 
	 * @ManyToMany(cascade=CascadeType.ALL)
	 * 
	 * @JoinTable(name="nhanvien_sanpham", joinColumns=
	 * {@JoinColumn(name="idSanPham", referencedColumnName="id")},
	 * inverseJoinColumns= {@JoinColumn(name="idNhanVien",
	 * referencedColumnName="id")} ) //@JoinColumn(name="id_employee") private
	 * Set<Employee> employees;
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private int amount;

	@Column(name = "price_factory")
	private double priceFactory;

	@Column(name = "price_distributor")
	private double priceDistributor;

	@Column(name = "price_customer")
	private double priceCustomer;

	@Column(name = "day_of_entry")
	private Calendar dayOfEntry;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_areas", nullable = false)
	private Area area;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_users", nullable = false)
	private Users users;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
	private Set<ProductDetail> lstProductDetails;

	public Product() {
	}

	public Product(long id, String name, int amount, double priceFactory,
			double priceDistributor, double priceCustomer, Calendar dayOfEntry) {
		this.id = id;
		this.name = name;
		this.amount = amount;
		this.priceFactory = priceFactory;
		this.priceDistributor = priceDistributor;
		this.priceCustomer = priceCustomer;
		this.dayOfEntry = dayOfEntry;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public double getPriceFactory() {
		return priceFactory;
	}

	public void setPriceFactory(double priceFactory) {
		this.priceFactory = priceFactory;
	}

	public double getPriceDistributor() {
		return priceDistributor;
	}

	public void setPriceDistributor(double priceDistributor) {
		this.priceDistributor = priceDistributor;
	}

	public double getPriceCustomer() {
		return priceCustomer;
	}

	public void setPriceCustomer(double priceCustomer) {
		this.priceCustomer = priceCustomer;
	}

	public Calendar getDayOfEntry() {
		return dayOfEntry;
	}

	public void setDayOfEntry(Calendar dayOfEntry) {
		this.dayOfEntry = dayOfEntry;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Set<ProductDetail> getLstProductDetails() {
		return lstProductDetails;
	}

	public void setLstProductDetails(Set<ProductDetail> lstProductDetails) {
		this.lstProductDetails = lstProductDetails;
	}

}
