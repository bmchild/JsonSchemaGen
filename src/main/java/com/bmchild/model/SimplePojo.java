package com.bmchild.model;

import java.util.List;

public class SimplePojo {

	private Integer id;
	private String name;
	private String description;
	private List<SimplePojoChild> children;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<SimplePojoChild> getChildren() {
		return children;
	}
	public void setChildren(List<SimplePojoChild> children) {
		this.children = children;
	}
	
}
