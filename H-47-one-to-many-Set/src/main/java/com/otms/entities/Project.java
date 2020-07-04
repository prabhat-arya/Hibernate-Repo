package com.otms.entities;

import java.io.Serializable;
import java.util.Set;

public class Project implements Serializable {
	protected int projectNo;
	protected String projectName;
	protected int duration;
	protected Set<Member> members;
	
	public int getProjectNo() {
		return projectNo;
	}
	public void setProjectNo(int projectNo) {
		this.projectNo = projectNo;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}


	public Set<Member> getMembers() {
		return members;
	}
	public void setMembers(Set<Member> members) {
		this.members = members;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + duration;
		result = prime * result + ((projectName == null) ? 0 : projectName.hashCode());
		result = prime * result + projectNo;
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
		Project other = (Project) obj;
		if (duration != other.duration)
			return false;
		if (projectName == null) {
			if (other.projectName != null)
				return false;
		} else if (!projectName.equals(other.projectName))
			return false;
		if (projectNo != other.projectNo)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Project [projectNo=" + projectNo + ", projectName=" + projectName + ", duration=" + duration
				+ "]";
	}
	

}
