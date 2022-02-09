package services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import beans.EmployeeBeans;
import dao.EmployeeDao;

public class Employee {

	private EmployeeDao dao;
	private BufferedReader br;

	public Employee() {
		br = new BufferedReader(new InputStreamReader(System.in));
		dao = new EmployeeDao();
	}

	public void register() throws IOException {

		System.out.println("enter email : ");
		String email = br.readLine();
		System.out.println("enter password : ");
		String pass1 = br.readLine();
		System.out.println("reenter your password :");
		String pass2 = br.readLine();
		if (pass1.equals(pass2)) {
			System.out.println("employee created ..");
			EmployeeBeans eb = new EmployeeBeans();
			eb.setEmailId(email);
			eb.setPassword(pass1);
			dao.savaDataInDb(eb);
		} else {
			System.out.println("password dint match try again ...");
			register();
		}

	}

	public void loginEmp() throws IOException {
		System.out.println("enter email : ");
		String email = br.readLine();
		EmployeeBeans eb = dao.getEmpData(email);
		
//		System.out.println(eb);
		
		System.out.println("enter password : ");
		String pass = br.readLine();
		if(eb.getPassword().equals(pass)) {
			System.out.println("Login Success!");
			
			// Send user to dashboard
			
		}
		else {
			System.out.println("Invalid password !");
		}
	}

	public void updateEmpProfile(EmployeeBeans eb) throws IOException {
		System.out.println("Enter name : ");
		String name = br.readLine();
		System.out.println("Enter Feedback : ");
		String feedback = br.readLine();
		System.out.println("Enter Mobile no : ");
		String mobileNo = br.readLine();
		eb.setMobileNumber(mobileNo);
		eb.setName(name);
		eb.setFeedback(feedback);
		dao.updateDataInDb(eb);
	}

}
