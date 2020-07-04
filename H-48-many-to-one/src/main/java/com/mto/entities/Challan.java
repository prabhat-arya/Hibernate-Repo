package com.mto.entities;

import java.io.Serializable;
import java.util.Date;

public class Challan implements Serializable{
	protected int challanNo;
	protected Date challanDate;
	protected Vehical vehical;
	
	public int getChallanNo() {
		return challanNo;
	}
	public void setChallanNo(int challanNo) {
		this.challanNo = challanNo;
	}
	public Date getChallanDate() {
		return challanDate;
	}
	public void setChallanDate(Date challanDate) {
		this.challanDate = challanDate;
	}
	public Vehical getVehical() {
		return vehical;
	}
	public void setVehical(Vehical vaVehical) {
		this.vehical = vaVehical;
	}
	@Override
	public String toString() {
		return "challan [challanNo=" + challanNo + ", challanDate=" + challanDate + ", vaVehical=" + vehical + "]";
	}
	

}
