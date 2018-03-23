package com.thongtv.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/***
 * 
 * @author thong.tv
 *
 */

@Entity
@Table(name = "AREAS")
public class Area {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String name;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="area")
	private Set<Product> lstProducts;

	public Area() {
	}

	public Area(long id, String name) {
		this.id = id;
		this.name = name;
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

	public Set<Product> getLstProducts() {
		return lstProducts;
	}

	public void setLstProducts(Set<Product> lstProducts) {
		this.lstProducts = lstProducts;
	}

}
