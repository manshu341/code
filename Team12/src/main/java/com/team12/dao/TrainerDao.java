package com.team12.dao;

import static com.team12.utility.HibernateUtil.getSessionFactory;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.team12.beans.EmployeeBeans;
import com.team12.beans.TrainerBeans;
public class TrainerDao {

	private Session session;
	private Transaction transaction;

	public TrainerDao() {
		session = getSessionFactory().openSession();
		transaction = session.beginTransaction();
	}


	public TrainerBeans getTrainerData(String email) {
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<TrainerBeans> query = criteriaBuilder.createQuery(TrainerBeans.class);
        Root<TrainerBeans> root = query.from(TrainerBeans.class);
        query.select(root).where(criteriaBuilder.equal(root.get("emailId"), email));
        Query<TrainerBeans> TrainerQuery = session.createQuery(query);
        return TrainerQuery.getSingleResult();
	}
	
	
	public void savaDataInDb(TrainerBeans tb) {
		session.save(tb);
		session.getTransaction().commit();
		System.out.println("Record Saved..");
		
	}
	public void updateDataInDb(EmployeeBeans eb) {
		//
	}

}
