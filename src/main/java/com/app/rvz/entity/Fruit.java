package com.app.rvz.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Fruit {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer fid;
	
	private String fname;
	
	private int price;
	
	public Integer getFid() {
		return fid;
	}
	
	public void setFid(Integer fid) {
		this.fid = fid;
	}
	
	public String getFname() {
		return fname;
	}
	
	public void setFname(String fname) {
		this.fname = fname;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public Fruit() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Fruit(Integer fid, String fname, int price) {
		super();
		this.fid = fid;
		this.fname = fname;
		this.price = price;
	}
	
	
	
}
