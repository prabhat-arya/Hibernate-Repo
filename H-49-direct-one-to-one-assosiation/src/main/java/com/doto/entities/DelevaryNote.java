package com.doto.entities;

import java.io.Serializable;
import java.util.Date;

public class DelevaryNote implements Serializable{
	protected int airwayBillNo;
	protected Date receivedDate;
	protected String receiver;
	protected Parcel parcel;
	public int getAirwayBillNo() {
	
		return airwayBillNo;
	
	}
	public void setAirwayBillNo(int airwayBillNo) {
	
		this.airwayBillNo = airwayBillNo;
	
	}
	public Date getReceivedDate() {
	
		return receivedDate;
	
	}
	public void setReceivedDate(Date receivedDate) {
	
		this.receivedDate = receivedDate;
	
	}
	public String getReceiver() {
	
		return receiver;
	
	}
	public void setReceiver(String receiver) {
	
		this.receiver = receiver;
	
	}
	public Parcel getParcel() {
	
		return parcel;
	
	}
	public void setParcel(Parcel parcel) {
	
		this.parcel = parcel;
	
	}
	
	
	@Override
	public int hashCode() {

		final int prime = 31;
		int result = 1;
		result = prime * result + airwayBillNo;
		result = prime * result + ((parcel == null) ? 0
				: parcel.hashCode());
		result = prime * result + ((receivedDate == null) ? 0
				: receivedDate.hashCode());
		result = prime * result + ((receiver == null) ? 0
				: receiver.hashCode());
		return result;

	}
	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DelevaryNote other = (DelevaryNote) obj;
		if (airwayBillNo != other.airwayBillNo)
			return false;
		if (parcel == null) {
			if (other.parcel != null)
				return false;
		} else if (!parcel.equals(other.parcel))
			return false;
		if (receivedDate == null) {
			if (other.receivedDate != null)
				return false;
		} else if (!receivedDate.equals(other.receivedDate))
			return false;
		if (receiver == null) {
			if (other.receiver != null)
				return false;
		} else if (!receiver.equals(other.receiver))
			return false;
		return true;

	}
	@Override
	public String toString() {

		return "DelevaryNote [airwayBillNo=" + airwayBillNo
				+ ", receivedDate=" + receivedDate + ", receiver="
				+ receiver + ", parcel=" + parcel + "]";

	}
	
	
	
	

}
