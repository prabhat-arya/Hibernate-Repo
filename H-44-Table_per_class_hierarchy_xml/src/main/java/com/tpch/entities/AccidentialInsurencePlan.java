package com.tpch.entities;

public class AccidentialInsurencePlan extends InsurancePlan {
	protected String coverageType;
	protected boolean internationalCoverage;
	protected String travelType;
	public String getCoverageType() {
		return coverageType;
	}
	public void setCoverageType(String coverageType) {
		this.coverageType = coverageType;
	}
	public boolean isInternationalCoverage() {
		return internationalCoverage;
	}
	public void setInternationalCoverage(boolean internationalCoverage) {
		this.internationalCoverage = internationalCoverage;
	}
	public String getTravelType() {
		return travelType;
	}
	public void setTravelType(String travelType) {
		this.travelType = travelType;
	}
	@Override
	public String toString() {
		return "AccidentialInsurencePlan [coverageType=" + coverageType + ", internationalCoverage="
				+ internationalCoverage + ", travelType=" + travelType + ", planNo=" + planNo + ", planName=" + planName
				+ ", minTenure=" + minTenure + ", maxTenute=" + maxTenute + ", minAge=" + minAge + ", maxAge=" + maxAge
				+ ", minInsuredAmount=" + minInsuredAmount + ", maxInsuredAmount=" + maxInsuredAmount + "]";
	}
	
}
