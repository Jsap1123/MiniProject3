package com.cogent.boot.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="Purchases")
public class Purchase {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id")
	private Long id;
	@Column(name="ProductName")
	private String productName;
	@Column(name="Cost")
	private double cost;
	@Column(name="DateOfPurchase")
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate dop;
	@Column(name="DeliveryDate")
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate dd;
	@Column(name="CustomerFeedback")
	private String custFeedback;
	
	public Purchase() {
		super();
		
	}
	
	public Purchase(Long id, String productName, double cost, LocalDate dop, LocalDate dd, String custFeedback) {
		super();
		this.id = id;
		this.productName = productName;
		this.cost = cost;
		this.dop = dop;
		this.dd = dd;
		this.custFeedback = custFeedback;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public LocalDate getDop() {
		return dop;
	}
	public void setDop(LocalDate dop) {
		this.dop = dop;
	}
	public LocalDate getDd() {
		return dd;
	}
	public void setDd(LocalDate dd) {
		this.dd = dd;
	}
	public String getCustFeedback() {
		return custFeedback;
	}
	public void setCustFeedback(String custFeedback) {
		this.custFeedback = custFeedback;
	}
	@Override
	public String toString() {
		return "Purchase [id=" + id + ", productName=" + productName + ", cost=" + cost + ", dop=" + dop
				+ ", dd=" + dd + ", custFeedback=" + custFeedback + "]";
	}
	
}
