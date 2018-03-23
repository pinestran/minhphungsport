package com.thongtv.entities;

import java.util.Calendar;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * 
 * @author thong.tv
 *
 */

@Entity(name = "BILL")
public class Bill {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "day_of_bill")
	private Calendar dayOfBill;

	@Column(name = "total_bill")
	private double totalBill;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "id_user_send")
	private Users idUserSend;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "id_user_receive")
	private Users idUserRecieve;

	@Column(name = "status_bill")
	private String statusBill;

	@OneToMany(fetch=FetchType.LAZY, mappedBy="bill")
	private Set<BillDetail> lstBillDetails;
	
	public Bill() {
	}

	public Bill(Calendar dayOfBill, double totalBill, String statusBill) {
		this.dayOfBill = dayOfBill;
		this.totalBill = totalBill;
		this.statusBill = statusBill;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Calendar getDayOfBill() {
		return dayOfBill;
	}

	public void setDayOfBill(Calendar dayOfBill) {
		this.dayOfBill = dayOfBill;
	}

	public double getTotalBill() {
		return totalBill;
	}

	public void setTotalBill(double totalBill) {
		this.totalBill = totalBill;
	}

	public Users getIdUserSend() {
		return idUserSend;
	}

	public void setIdUserSend(Users idUserSend) {
		this.idUserSend = idUserSend;
	}

	public Users getIdUserRecieve() {
		return idUserRecieve;
	}

	public void setIdUserRecieve(Users idUserRecieve) {
		this.idUserRecieve = idUserRecieve;
	}

	public String getStatusBill() {
		return statusBill;
	}

	public void setStatusBill(String statusBill) {
		this.statusBill = statusBill;
	}

	public Set<BillDetail> getLstBillDetails() {
		return lstBillDetails;
	}

	public void setLstBillDetails(Set<BillDetail> lstBillDetails) {
		this.lstBillDetails = lstBillDetails;
	}

}
