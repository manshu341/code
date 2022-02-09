package com.team12.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 
 * @author manbatra4
 *@see TrainerBeans bean class
 *@version 1.0
 */
@Entity
@Table(name = "Trainer")
public class TrainerBeans {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int trainerId;
	private String firstName;
	private String lastName;
	private String specialization;
	private String emailAddress;
	private String password;
	private int mobileNumber;
	public TrainerBeans(int trainerId, String firstName, String lastName, String specialization, String emailAddress,
			String password, int mobileNumber) {
		super();
		this.trainerId = trainerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.specialization = specialization;
		this.emailAddress = emailAddress;
		this.password = password;
		this.mobileNumber = mobileNumber;
	}
	public TrainerBeans() {
		// TODO Auto-generated constructor stub
	}
	public int getTrainerId() {
		return trainerId;
	}
	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "TrainerBeans [trainerId=" + trainerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", specialization=" + specialization + ", emailAddress=" + emailAddress + ", password=" + password
				+ ", mobileNumber=" + mobileNumber + "]";
	}
	
	
	
	
}	