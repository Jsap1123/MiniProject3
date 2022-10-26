package com.cogent.boot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CustomerCare")
public class CustomerCare {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private Long id;
	@Column(name = "Complaint")
	private String complaint;
	@Column(name = "Description")
	private String description;
	@Column(name = "User_Id")
	private Long userId;
	@Column(name = "Complaint_Status")
	private String complaintStatus;
	
	public CustomerCare() {
		super();
	}
	public CustomerCare(Long id, String complaint, String description, Long userId, String complaintStatus) {
		super();
		this.id = id;
		this.complaint = complaint;
		this.description = description;
		this.userId = userId;
		this.complaintStatus = complaintStatus;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getComplaint() {
		return complaint;
	}
	public void setComplaint(String complaint) {
		this.complaint = complaint;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getComplaintStatus() {
		return complaintStatus;
	}
	public void setComplaintStatus(String complaintStatus) {
		this.complaintStatus = complaintStatus;
	}
	@Override
	public String toString() {
		return "CustomerCare [id=" + id + ", complaint=" + complaint + ", description=" + description + ", userId="
				+ userId + ", complaintStatus=" + complaintStatus + "]";
	}
		
}
