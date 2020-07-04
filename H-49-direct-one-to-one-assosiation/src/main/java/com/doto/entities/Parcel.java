package com.doto.entities;

import java.io.Serializable;
import java.util.Date;

public class Parcel implements Serializable {
	protected int airwayBillNo;
	protected Date delevaryDate;
	protected String type;
	public int getAirwayBillNo() {
	
		return airwayBillNo;
	
	}
	public void setAirwayBillNo(int airwayBillNo) {
	
		this.airwayBillNo = airwayBillNo;
	
	}
	public Date getDelevaryDate() {
	
		return delevaryDate;
	
	}
	public void setDelevaryDate(Date delevaryDate) {
	
		this.delevaryDate = delevaryDate;
	
	}
	public String getType() {
	
		return type;
	
	}
	public void setType(String type) {
	
		this.type = type;
	
	}
	
	
	@Override
	public int hashCode() {

		final int prime = 31;
		int result = 1;
		result = prime * result + airwayBillNo;
		result = prime * result + ((delevaryDate == null) ? 0
				: delevaryDate.hashCode());
		result = prime * result + ((type == null) ? 0
				: type.hashCode());
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
		Parcel other = (Parcel) obj;
		if (airwayBillNo != other.airwayBillNo)
			return false;
		if (delevaryDate == null) {
			if (other.delevaryDate != null)
				return false;
		} else if (!delevaryDate.equals(other.delevaryDate))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;

	}
	@Override
	public String toString() {

		return "Parcel [airwayBillNo=" + airwayBillNo
				+ ", delevaryDate=" + delevaryDate + ", type=" + type
				+ "]";

	}
	

}
