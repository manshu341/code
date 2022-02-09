package com.team12.beans;


/**
 * 
 * @author manbatra4
 * @see bean of TOC
 * @version1.0 
 *
 */
public class TableofContent {
	private String courseName;
	private String prerequisites;
    private int timeDuration;
    private String softwareRequirements;
    private String courseobjective;
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getPrerequisites() {
		return prerequisites;
	}
	public void setPrerequisites(String prerequisites) {
		this.prerequisites = prerequisites;
	}
	public int getTimeDuration() {
		return timeDuration;
	}
	public void setTimeDuration(int timeDuration) {
		this.timeDuration = timeDuration;
	}
	public String getSoftwareRequirements() {
		return softwareRequirements;
	}
	public void setSoftwareRequirements(String softwareRequirements) {
		this.softwareRequirements = softwareRequirements;
	}
	public String getCourseobjective() {
		return courseobjective;
	}
	public void setCourseobjective(String courseobjective) {
		this.courseobjective = courseobjective;
	}
    
}
