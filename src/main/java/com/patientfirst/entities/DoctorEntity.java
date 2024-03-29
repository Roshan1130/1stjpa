package com.patientfirst.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQuery(
		name="findDoctorBySpeciality",
		query="FROM DoctorEntity d where d.speciality=:s"
)

@Entity
@Table (name="doctors")
public class DoctorEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="name")
	private String name;

	@Column(name="speciality")
	private String speciality;
	

	@Column(name="department")
	private String department;

	@Column(name="phone")
	private String phone;

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

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "DoctorEntity [id=" + id + ", name=" + name + ", speciality=" + speciality + ", department=" + department
				+ ", phone=" + phone + "]";
	}
	
	
}
