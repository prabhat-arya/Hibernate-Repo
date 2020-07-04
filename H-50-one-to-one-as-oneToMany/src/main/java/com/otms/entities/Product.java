package com.otms.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


public class Product implements Serializable {

	protected int productNo;
	protected String productName;
	protected Date manufacturedDate;
	protected String manufacturerName;
	protected double price;
	protected Warranty warranty;
	public int getProductNo() {
	
		return productNo;
	
	}
	public void setProductNo(int productNo) {
	
		this.productNo = productNo;
	
	}
	public String getProductName() {
	
		return productName;
	
	}
	public void setProductName(String productName) {
	
		this.productName = productName;
	
	}
	public Date getManufacturedDate() {
	
		return manufacturedDate;
	
	}
	public void setManufacturedDate(Date manufacturedDate) {
	
		this.manufacturedDate = manufacturedDate;
	
	}
	public String getManufacturerName() {
	
		return manufacturerName;
	
	}
	public void setManufacturerName(String manufacturerName) {
	
		this.manufacturerName = manufacturerName;
	
	}
	public double getPrice() {
	
		return price;
	
	}
	public void setPrice(double price) {
	
		this.price = price;
	
	}
	public Warranty getWarranty() {
	
		return warranty;
	
	}
	public void setWarranty(Warranty warranty) {
	
		this.warranty = warranty;
	
	}
	@Override
	public String toString() {

		return "Product [productNo=" + productNo + ", productName="
				+ productName + ", manufacturedDate=" + manufacturedDate
				+ ", manufacturerName=" + manufacturerName + ", price="
				+ price + ", warranty=" + warranty + "]";

	}
	
	
	

}
