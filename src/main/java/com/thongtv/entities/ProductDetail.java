package com.thongtv.entities;

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

/**
 * 
 * @author thong.tv
 *
 */
@Entity(name = "PRODUCT_DETAILS")
public class ProductDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String color;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "productDetail")
	private Set<Image> lstimage;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_product", nullable = false)
	private Product product;

	@Column(name = "amount_s")
	private int amountS;

	@Column(name = "amount_m")
	private int amountM;

	@Column(name = "amount_l")
	private int amountL;

	@Column(name = "amount_xl")
	private int amountXL;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="productDetails")
	private Set<BillDetail> lstBillDetails;

	public ProductDetail() {
	}

	public ProductDetail(String name, String color, int amountS, int amountM,
			int amountL, int amountXL) {
		this.name = name;
		this.color = color;
		this.amountS = amountS;
		this.amountM = amountM;
		this.amountL = amountL;
		this.amountXL = amountXL;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Set<Image> getLstimage() {
		return lstimage;
	}

	public void setLstimage(Set<Image> lstimage) {
		this.lstimage = lstimage;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
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

	public int getAmountXL() {
		return amountXL;
	}

	public void setAmountXL(int amountXL) {
		this.amountXL = amountXL;
	}

	public Set<BillDetail> getLstBillDetails() {
		return lstBillDetails;
	}

	public void setLstBillDetails(Set<BillDetail> lstBillDetails) {
		this.lstBillDetails = lstBillDetails;
	}

}
