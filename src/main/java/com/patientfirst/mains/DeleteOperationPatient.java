package com.patientfirst.mains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.patientfirst.repositories.PatientRepository;

public class DeleteOperationPatient {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
		PatientRepository pr = (PatientRepository) ctx.getBean("patientRepository");
		pr.deleteByName("Sunny Kumari");
		
	}

}
