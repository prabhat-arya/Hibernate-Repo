package com.otms.entities;

import java.io.Serializable;

public class Member implements Serializable {
	protected int memberNo;
	protected String name;
	protected String experience;
	public int getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "Member [memberNo=" + memberNo + ", name=" + name + ", experience=" + experience + "]";
	}
	

}
