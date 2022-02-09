package dao;

import static com.team12.utility.HibernateUtil.getSessionFactory;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import beans.EmployeeBeans;

public class EmployeeDao {

	private Session session;
	private Transaction transaction;

	public EmployeeDao() {
		session = getSessionFactory().openSession();
		transaction = session.beginTransaction();
	}

	public void savaDataInDb(EmployeeBeans eb) {
		session.save(eb);
		session.getTransaction().commit();
		System.out.println("Record Saved..");
	}

	public EmployeeBeans getEmpData(String email) {
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<EmployeeBeans> query = criteriaBuilder.createQuery(EmployeeBeans.class);
        Root<EmployeeBeans> root = query.from(EmployeeBeans.class);
        query.select(root).where(criteriaBuilder.equal(root.get("emailId"), email));
        Query<EmployeeBeans> employeeQuery = session.createQuery(query);
        return employeeQuery.getSingleResult();
	}
	
	public void updateDataInDb(EmployeeBeans eb) {
		//
	}

}
