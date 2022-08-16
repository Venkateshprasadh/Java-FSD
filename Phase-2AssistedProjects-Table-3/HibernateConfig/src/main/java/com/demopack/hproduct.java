package com.demopack;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class hproduct 
{	@Id
	private int prod_id;
	@Column
	private String prod_name;
	@Column
	private double prod_price;

	public int getProd_id() {
		return prod_id;
	}
	public void setProd_id(int prod_id) {
		this.prod_id = prod_id;
	}
	public String getProd_name() {
		return prod_name;
	}
	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}
	public double getProd_price() {
		return prod_price;
	}
	@Override
	public String toString() {
		return "hproduct [prod_id=" + prod_id + ", prod_name=" + prod_name + ", prod_price=" + prod_price + "]";
	}
	public void setProd_price(double prod_price) {
		this.prod_price = prod_price;
	}
	
}
