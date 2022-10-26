package com.cogent.boot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Plans")
public class Plans {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private Long id;
	@Column(name = "Plan_Name")
	private String planName;
	@Column(name = "Cost")
	private double cost;
	@Column(name = "Validity")
	private String validity;
	
	public Plans() {
		super();
		
	}
	public Plans(Long id, String planName, double cost, String validity) {
		super();
		this.id = id;
		this.planName = planName;
		this.cost = cost;
		this.validity = validity;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getValidity() {
		return validity;
	}
	public void setValidity(String validity) {
		this.validity = validity;
	}
	@Override
	public String toString() {
		return "Plans [id=" + id + ", planName=" + planName + ", cost=" + cost + ", validity=" + validity + "]";
	}
	
	
}
