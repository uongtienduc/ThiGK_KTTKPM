package com.example.OnThiGKKTTKPM.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orther")
public class Orther {
	@Id
	@Column(name = "idOrther")
	private String idOrther;
	@Column(name = "Name")
	private String name;
	@Column(name = "Price")
	private String price;
	
	public Orther() {
		// TODO Auto-generated constructor stub
	}

	public String getIdOrther() {
		return idOrther;
	}



	public void setIdOrther(String idOrther) {
		this.idOrther = idOrther;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getPrice() {
		return price;
	}



	public void setPrice(String price) {
		this.price = price;
	}



	public Orther(String idOrther, String name, String price) {
		super();
		this.idOrther = idOrther;
		this.name = name;
		this.price = price;
	}


	@Override
	public String toString() {
		return "Orther [idOrther=" + idOrther + ", name=" + name + ", price=" + price + "]";
	}
	
}
