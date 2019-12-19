package com.patientfirst.repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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
	
	@Transactional
	public DoctorEntity getById(Long id) {
		return em.find(DoctorEntity.class, id);
	}
	
	@Transactional
	public List<DoctorEntity> getDoctorsBySpeciality(String speciality){
		
		Query q = em.createNamedQuery("findDoctorBySpeciality");
		q.setParameter("s", speciality);
		List<DoctorEntity> doctors = q.getResultList();
		return doctors;
	}

	public EntityManager getEm() {
		return em;
	}

	@PersistenceContext
	public void setEm(EntityManager em) {
		this.em = em;
	}

}
