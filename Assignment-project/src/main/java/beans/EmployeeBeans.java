package beans;


/**
 * 
 * @author manbatra4
 *
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

	@Entity
	@Table(name ="employee")
public class EmployeeBeans {
	@Id
	@Column(name ="emdid")
	private String eId;
	@Column(name ="empname")
	private String name;
	@Column(name ="empemail")
	private String emailId;
	@Column(name ="emdid")
	private String password;
	
	
	public EmployeeBeans() {
		super();
		this.eId = eId;
		this.name = name;
		this.emailId = emailId;
		this.password = password;
		this.mobileNumber = mobileNumber;
		this.feedback = feedback;
	}
	
	@Override
	public String toString() {
		return "EmployeeBeans [eId=" + eId + ", name=" + name + ", emailId=" + emailId + ", password=" + password
				+ ", mobileNumber=" + mobileNumber + ", feedback=" + feedback + "]";
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private String mobileNumber;
	private String feedback;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String geteId() {
		return eId;
	}
	public void seteId(String eId) {
		this.eId = eId;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	
}
