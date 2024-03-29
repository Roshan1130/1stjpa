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
		d1.setName("Dr. Mahim Karim");
		d1.setPhone("+82353452345");
		d1.setSpeciality("Physician");
		d1.setDepartment("ENT");
		dr.save(d1);	
		
		/* finddoctorbyid
		 * DoctorEntity d2 = dr.getById(1l); System.out.println(d2.toString());
		 */
		

	}
}
