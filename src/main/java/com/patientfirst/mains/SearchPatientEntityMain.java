package com.patientfirst.mains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.patientfirst.entities.PatientEntity;
import com.patientfirst.repositories.PatientRepository;

public class SearchPatientEntityMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
		PatientRepository pr = (PatientRepository) ctx.getBean("patientRepository");
		PatientEntity p2 = pr.findByname("Sunny Leone");
		System.out.println(p2.toString());
	}

}
