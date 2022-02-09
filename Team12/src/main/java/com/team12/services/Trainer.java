package com.team12.services;


import com.team12.dao.TrainerDao;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;


import com.team12.beans.TrainerBeans;
import com.team12.dao.TrainerDao;

public class Trainer {

	
	private TrainerDao dao;
	private BufferedReader br;
	
	public Trainer() {
		br = new BufferedReader(new InputStreamReader(System.in));
		dao = new TrainerDao();
		
	}
	
	public void register() throws IOException {

		System.out.println("enter email : ");
		String email = br.readLine();
		System.out.println("enter password : ");
		String pass1 = br.readLine();
		System.out.println("reenter your password :");
		String pass2 = br.readLine();
		if (pass1.equals(pass2)) {
			System.out.println("Trainer created ..");
			TrainerBeans tb = new TrainerBeans();
			tb.setEmailAddress(email);
			tb.setPassword(pass1);
			dao.savaDataInDb(tb);
		} else {
			System.out.println("password dint match try again ...");
			register();
		}

	}

	public void loginTrainer() throws IOException {
		System.out.println("enter email : ");
		String email = br.readLine();
		TrainerBeans eb = dao.getTrainerData(email);
		
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
	
}
