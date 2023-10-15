package com.hcl.e.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//Model class.
@Entity
@Table(name = "StundentMarksEntity")
public class StundentMarksEntity {
	@Column(name = "name")
	private String name;
	@Id	 
	private int hallTicketNo;
	 @Column(name = "telugu")
	private int telugu;
	 @Column(name = "hindi")
	private int hindi;
	 @Column(name = "english")
	private int english;
	 @Column(name = "mathes")
	private int mathes;
	 @Column(name = "science")
	private int science;
	 @Column(name = "social")
	private int social;
	 @Column(name = "total")
	private int total;
	 @Column(name = "percentage")
	private float percentage;
	 @Column(name = "result")
	private String result;
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
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}

}
