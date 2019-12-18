package com.patientfirst.mains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.patientfirst.entities.DoctorEntity;
import com.patientfirst.repositories.DoctorRepository;

public class CreateDoctorMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
		
		DoctorRepository dr = (DoctorRepository) ctx.getBean("doctorRepository");
		
		DoctorEntity d1 = new DoctorEntity();
		d1.setName("Dr. Roshan Ramtel");
		d1.setPhone("+92353452345");
		d1.setSpeciality("Surgeon");
		d1.setDepartment("ENT");
		dr.save(d1);	

	}
}
