package com.patientfirst.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.patientfirst.entities.DoctorEntity;

@Repository
public class DoctorRepository {

	private EntityManager em;

	@Transactional
	public void save(DoctorEntity doctor) {
		em.persist(doctor);
	}

	public EntityManager getEm() {
		return em;
	}

	@PersistenceContext
	public void setEm(EntityManager em) {
		this.em = em;
	}

}
