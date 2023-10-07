package com.hcl.dto;

public class EmployeeDTO {
	
	private String name;
	private int id;
	private String branch;
	
	public EmployeeDTO(String name, int id, String branch) {
		super();
		this.name = name;
		this.id = id;
		this.branch = branch;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}

}
