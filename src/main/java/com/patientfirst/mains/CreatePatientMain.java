package com.patientfirst.mains;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.patientfirst.entities.PatientEntity;
import com.patientfirst.repositories.PatientRepository;

public class CreatePatientMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
		PatientRepository pr = (PatientRepository) ctx.getBean("patientRepository");
		
		PatientEntity p1 = new PatientEntity();
		p1.setName("Sunny Leone");
		p1.setDate(new Date());
		p1.setEmail("sunny@gmail.com");
		p1.setLastFourSsn("4546");
		p1.setPhone("+8372922383");
		pr.save(p1);
		
	}
}
