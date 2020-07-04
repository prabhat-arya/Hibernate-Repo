package com.otms.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



public class Warranty implements Serializable {

	protected int warrantyNo;
	protected int warrantyInMonths;
	protected String termsAndConditions;
	protected Date effectiveDate;
	protected Date expiryDate;
	protected String retailerBusinessName;
	public int getWarrantyNo() {
	
		return warrantyNo;
	
	}
	public void setWarrantyNo(int warrantyNo) {
	
		this.warrantyNo = warrantyNo;
	
	}
	public int getWarrantyInMonths() {
	
		return warrantyInMonths;
	
	}
	public void setWarrantyInMonths(int warrantyInMonths) {
	
		this.warrantyInMonths = warrantyInMonths;
	
	}
	public String getTermsAndConditions() {
	
		return termsAndConditions;
	
	}
	public void setTermsAndConditions(String termsAndConditions) {
	
		this.termsAndConditions = termsAndConditions;
	
	}
	public Date getEffectiveDate() {
	
		return effectiveDate;
	
	}
	public void setEffectiveDate(Date effectiveDate) {
	
		this.effectiveDate = effectiveDate;
	
	}
	public Date getExpiryDate() {
	
		return expiryDate;
	
	}
	public void setExpiryDate(Date expiryDate) {
	
		this.expiryDate = expiryDate;
	
	}
	public String getRetailerBusinessName() {
	
		return retailerBusinessName;
	
	}
	public void setRetailerBusinessName(String retailerBusinessName) {
	
		this.retailerBusinessName = retailerBusinessName;
	
	}
	@Override
	public String toString() {

		return "Warranty [warrantyNo=" + warrantyNo
				+ ", warrantyInMonths=" + warrantyInMonths
				+ ", termsAndConditions=" + termsAndConditions
				+ ", effectiveDate=" + effectiveDate + ", expiryDate="
				+ expiryDate + ", retailerBusinessName="
				+ retailerBusinessName + "]";

	}
	

}
