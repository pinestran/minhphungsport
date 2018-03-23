package com.thongtv.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/***
 * 
 * @author thong.tv
 *
 */

@Entity(name="BANK")
public class Bank {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String name;
	
	@Column(name="account_num")
	private String accountNum;
	
	@Column(name="card_num")
	private String cardNum;
	
	/**
	 *  a card only has a user, otherwise a user has many cards.
	 *  LAZY: fetch when needed.
	 *  EAGER: fetch immediately.
	 */
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_users", nullable=false)
	private Users users;

	public Bank(){}
	
	public Bank(long id, String name, String accountNum, String cardNum,
			Users users) {
		this.id = id;
		this.name = name;
		this.accountNum = accountNum;
		this.cardNum = cardNum;
		this.users = users;
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

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public String getCardNum() {
		return cardNum;
	}

	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}
	
}
