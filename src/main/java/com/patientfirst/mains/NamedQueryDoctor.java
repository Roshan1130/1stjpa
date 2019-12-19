package com.patientfirst.mains;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.patientfirst.entities.DoctorEntity;
import com.patientfirst.repositories.DoctorRepository;

public class NamedQueryDoctor {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
		DoctorRepository dr = (DoctorRepository) ctx.getBean("doctorRepository");
		
		List<DoctorEntity> doctors = dr.getDoctorsBySpeciality("Surgeon");
		
		for(DoctorEntity doctor : doctors) {
			System.out.println(doctor.toString());
		}

	}

}
