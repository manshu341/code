package com.team12.utility;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import beans.EmployeeBeans;


public class HibernateUtil {
	static SessionFactory sessionFactory = null; 
	private HibernateUtil() {}
	public static SessionFactory getSessionFactory() {
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
		
		configuration.addAnnotatedClass(EmployeeBeans.class); 

		ServiceRegistry serviceRegistry = 
				new StandardServiceRegistryBuilder().
					applySettings(configuration.getProperties()).build();
		
		return configuration.buildSessionFactory(serviceRegistry);
	}
}