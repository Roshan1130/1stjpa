package com.patientfirst.repositories;

import java.sql.SQLException;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.orm.hibernate5.HibernateQueryException;
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

	@Transactional
	public PatientEntity findByname(String pname) {
		Query q = em.createQuery("FROM PatientEntity p where p.name =:name ");
		q.setParameter("name", pname);
		return (PatientEntity) q.getSingleResult();
	}
	
	@Transactional
	public void deleteByName(String pname) {
		Query q = em.createQuery("DELETE FROM PatientEntity p where p.name =:name");
		q.setParameter("name", pname);
		try {
		q.executeUpdate();
		System.out.println("deletion successfull");
		}catch(HibernateQueryException h){
			System.out.println("Not deleted");
		}
	}
	
	@Transactional
	public void update(PatientEntity patient) {
		try {
			em.merge(patient);
			System.out.println("update successfull");
		}catch(IllegalArgumentException e){
			System.out.println("Not updated");
		}
	}
	
	public EntityManager getEm() {
		return em;
	}

	@PersistenceContext
	public void setEm(EntityManager em) {
		this.em = em;
	}
	
	
	
}
