package com.patientfirst.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.patientfirst.entities.PatientEntity;

@Repository
public class PatientRepository {
	private EntityManager em;
	
	@Transactional
	public void save(PatientEntity patient) {
		em.persist(patient);
	}

	public EntityManager getEm() {
		return em;
	}

	@PersistenceContext
	public void setEm(EntityManager em) {
		this.em = em;
	}
	
	
	
}
