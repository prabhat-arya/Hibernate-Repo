package com.mto.entities;

import java.io.Serializable;

public class Vehical implements Serializable {
	protected int vahicalNo;
	protected int chachishNo;
	protected String vehicalName;
	
	public int getVahicalNo() {
		return vahicalNo;
	}
	public void setVahicalNo(int vahicalNo) {
		this.vahicalNo = vahicalNo;
	}
	public int getChachishNo() {
		return chachishNo;
	}
	public void setChachishNo(int chachishNo) {
		this.chachishNo = chachishNo;
	}
	public String getVehicalName() {
		return vehicalName;
	}
	public void setVehicalName(String vehicalName) {
		this.vehicalName = vehicalName;
	}
	@Override
	public String toString() {
		return "Vehical [vahicalNo=" + vahicalNo + ", chachishNo=" + chachishNo + ", vehicalName=" + vehicalName + "]";
	}
	
	

}
