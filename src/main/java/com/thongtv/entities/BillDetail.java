package com.thongtv.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/***
 * 
 * @author thong.tv
 *
 */

@Entity
@Table(name="BILL_DETAILS")
public class BillDetail {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_bill", nullable=false)
	private Bill bill;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_user_factory", nullable=false)
	private Users users;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_product_details", nullable=false)
	private ProductDetail productDetails;
	
	@Column(name="amount_s")
	private int amountS;
	
	@Column(name="amount_m")
	private int amountM;
	
	@Column(name="amount_l")
	private int amountL;
	
	@Column(name="amount_xl")
	private int amountXl;
	
	@Column(name="total_amount")
	private int totalAmount;
	
	private double price;

	public BillDetail() {
	}

	public BillDetail(int amountS, int amountM,
			int amountL, int amountXl, int totalAmount, double price) {
		this.amountS = amountS;
		this.amountM = amountM;
		this.amountL = amountL;
		this.amountXl = amountXl;
		this.totalAmount = totalAmount;
		this.price = price;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Bill getBill() {
		return bill;
	}

	public void setBill(Bill bill) {
		this.bill = bill;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public ProductDetail getProductDetails() {
		return productDetails;
	}

	public void setProductDetails(ProductDetail productDetails) {
		this.productDetails = productDetails;
	}

	public int getAmountS() {
		return amountS;
	}

	public void setAmountS(int amountS) {
		this.amountS = amountS;
	}

	public int getAmountM() {
		return amountM;
	}

	public void setAmountM(int amountM) {
		this.amountM = amountM;
	}

	public int getAmountL() {
		return amountL;
	}

	public void setAmountL(int amountL) {
		this.amountL = amountL;
	}

	public int getAmountXl() {
		return amountXl;
	}

	public void setAmountXl(int amountXl) {
		this.amountXl = amountXl;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}
