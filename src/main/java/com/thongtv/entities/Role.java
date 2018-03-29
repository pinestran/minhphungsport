package com.thongtv.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * 
 * @author Thong Blue
 *
 */

@Entity(name="ROLE")
public class Role {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="name")
	private int nameRole;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="role")
	private Set<Users> lstUsers;
	
	public Role() {	}

	public Role(int id, int nameRole, Set<Users> lstUsers) {
		this.id = id;
		this.nameRole = nameRole;
		this.lstUsers = lstUsers;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNameRole() {
		return nameRole;
	}

	public void setNameRole(int nameRole) {
		this.nameRole = nameRole;
	}

	public Set<Users> getLstUsers() {
		return lstUsers;
	}

	public void setLstUsers(Set<Users> lstUsers) {
		this.lstUsers = lstUsers;
	}
	
}