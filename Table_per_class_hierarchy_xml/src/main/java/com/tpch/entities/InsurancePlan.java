package com.tpch.entities;

public class InsurancePlan {

	protected int planNo;
	protected String planName;
	protected int minTenure;
	protected int maxTenute;
	protected int minAge;
	protected int maxAge;
	protected double minInsuredAmount;
	protected double maxInsuredAmount;
	public int getPlanNo() {
		return planNo;
	}
	public void setPlanNo(int planNo) {
		this.planNo = planNo;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public int getMinTenure() {
		return minTenure;
	}
	public void setMinTenure(int minTenure) {
		this.minTenure = minTenure;
	}
	public int getMaxTenute() {
		return maxTenute;
	}
	public void setMaxTenute(int maxTenute) {
		this.maxTenute = maxTenute;
	}
	public int getMinAge() {
		return minAge;
	}
	public void setMinAge(int minAge) {
		this.minAge = minAge;
	}
	public int getMaxAge() {
		return maxAge;
	}
	public void setMaxAge(int maxAge) {
		this.maxAge = maxAge;
	}
	public double getMinInsuredAmount() {
		return minInsuredAmount;
	}
	public void setMinInsuredAmount(double minInsuredAmount) {
		this.minInsuredAmount = minInsuredAmount;
	}
	public double getMaxInsuredAmount() {
		return maxInsuredAmount;
	}
	public void setMaxInsuredAmount(double maxInsuredAmount) {
		this.maxInsuredAmount = maxInsuredAmount;
	}
	@Override
	public String toString() {
		return "InsurancePlan [planNo=" + planNo + ", planName=" + planName + ", minTenure=" + minTenure
				+ ", maxTenute=" + maxTenute + ", minAge=" + minAge + ", maxAge=" + maxAge + ", minInsuredAmount="
				+ minInsuredAmount + ", maxInsuredAmount=" + maxInsuredAmount + "]";
	}
	
}
