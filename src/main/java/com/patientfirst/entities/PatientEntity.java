package com.patientfirst.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="patients")
public class PatientEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="name")
	private String name;
	

	@Column(name="email")
	private String email;
	

	@Column(name="phone")
	private String phone;

	@Column(name="last_four_ssn")
	private String lastFourSsn;

	@Column(name="dob")
	private Date date;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getLastFourSsn() {
		return lastFourSsn;
	}

	public void setLastFourSsn(String lastFourSsn) {
		this.lastFourSsn = lastFourSsn;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "PatientEntity [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", lastFourSsn="
				+ lastFourSsn + ", date=" + date + "]";
	}
	
	
}
