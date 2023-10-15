package com.hcl.f.dto;

public class StudentMarksDTO {
	
	private String name;
	private int hallTicketNo;
	private int telugu;
	private int hindi;
	private int english;
	private int mathes;
	private int science;
	private int social;
	
	
	/*
	 * { "name": "Bhavisha", "hallTicketNo": "090522", "telugu": "78", "hindi":
	 * "89", "english": "56", "mathes": "99", "science": "89", "social": "98" }
	 */
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHallTicketNo() {
		return hallTicketNo;
	}
	public void setHallTicketNo(int hallTicketNo) {
		this.hallTicketNo = hallTicketNo;
	}
	public int getTelugu() {
		return telugu;
	}
	public void setTelugu(int telugu) {
		this.telugu = telugu;
	}
	public int getHindi() {
		return hindi;
	}
	public void setHindi(int hindi) {
		this.hindi = hindi;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getMathes() {
		return mathes;
	}
	public void setMathes(int mathes) {
		this.mathes = mathes;
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}
	public int getSocial() {
		return social;
	}
	public void setSocial(int social) {
		this.social = social;
	}
	

}
