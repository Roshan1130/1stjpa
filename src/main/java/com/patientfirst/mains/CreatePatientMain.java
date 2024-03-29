package com.patientfirst.mains;

import java.util.Calendar;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.patientfirst.entities.PatientEntity;
import com.patientfirst.repositories.PatientRepository;

public class CreatePatientMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
		PatientRepository pr = (PatientRepository) ctx.getBean("patientRepository");
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 1983);
		cal.set(Calendar.MONTH, 05);
		cal.set(Calendar.DAY_OF_MONTH,15);
		Date date = cal.getTime();
		
		PatientEntity p1 = new PatientEntity();
		p1.setName("Sunny Kumari");
		p1.setDate(date);
		p1.setEmail("kumari@gmail.com");
		p1.setLastFourSsn("4446");
		p1.setPhone("+9372922383");
		pr.save(p1);
			
		
		
	}
}
