package com.bmchild.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SimplePojoChild {

	private Integer id;
	@JsonProperty("cName")
	private String childName;
	@JsonProperty("cDescription")
	private String childDescription;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getChildName() {
		return childName;
	}
	public void setChildName(String childName) {
		this.childName = childName;
	}
	public String getChildDescription() {
		return childDescription;
	}
	public void setChildDescription(String childDescription) {
		this.childDescription = childDescription;
	}
	
}
