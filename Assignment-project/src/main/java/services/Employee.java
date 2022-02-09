package services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.Transaction;
import static hibernate.HibernateUtil.getSessionFactory;

import beans.EmployeeBeans;

public class Employee {
	
	
	
 public void register() throws IOException {
	 
	 Session session = hibernate.HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction(); 
	 
	 
	 System.out.println("enter email : ");
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 String email = br.readLine();
	 System.out.println("enter password : ");
	 String pass1 = br.readLine();
	 System.out.println("reenter your password :");
	 String pass2 = br.readLine();
	 if(pass1 == pass2) {
		 System.out.println("employee created ..");
		 EmployeeBeans eb=new EmployeeBeans();
		 eb.setEmailId(email);
		 eb.setPassword(pass1);
		 savaDataInDb(eb);
	 }else {
		 System.out.println("password dint match try again ...");
		 register();
	 }
	 
 }
 
 
 
public void savaDataInDb(EmployeeBeans eb) {
	 
	 session.save(eb); 
		// the save to db will happen here 
		session.getTransaction().commit();
		System.out.println("Record Saved..");
 }


 
 
}
