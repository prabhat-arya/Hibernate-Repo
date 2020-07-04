package com.tpch.entities;

public class MedicaInsurancePlane extends InsurancePlan {
	protected String networkType;
	protected int copay;
	protected boolean cashlessFacilityAvailable;
	public String getNetworkType() {
		return networkType;
	}
	public void setNetworkType(String networkType) {
		this.networkType = networkType;
	}
	public int getCopay() {
		return copay;
	}
	public void setCopay(int copay) {
		this.copay = copay;
	}
	public boolean isCashlessFacilityAvailable() {
		return cashlessFacilityAvailable;
	}
	public void setCashlessFacilityAvailable(boolean cashlessFacilityAvailable) {
		this.cashlessFacilityAvailable = cashlessFacilityAvailable;
	}
	@Override
	public String toString() {
		return "MedicaInsurancePlane [networkType=" + networkType + ", copay=" + copay + ", cashlessFacilityAvailable="
				+ cashlessFacilityAvailable + ", planNo=" + planNo + ", planName=" + planName + ", minTenure="
				+ minTenure + ", maxTenute=" + maxTenute + ", minAge=" + minAge + ", maxAge=" + maxAge
				+ ", minInsuredAmount=" + minInsuredAmount + ", maxInsuredAmount=" + maxInsuredAmount + "]";
	}
	

}
