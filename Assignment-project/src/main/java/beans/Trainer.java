package beans;


/**
 * 
 * @author manbatra4
 *@see Trainer bean class
 *@version 1.0
 */
public class Trainer {
	private String firstName;
	private String lastName;
	private int trainerId;
	private String specialization;
	private String emailAddress;
	private String mobileNumber;
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
	public int getTrainerId() {
		return trainerId;
	}
	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
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
	@Override
	public String toString() {
		return "Trainer [firstName=" + firstName + ", lastName=" + lastName + ", trainerId=" + trainerId
				+ ", specialization=" + specialization + ", emailAddress=" + emailAddress + ", mobileNumber="
				+ mobileNumber + "]";
	}
	public Trainer(String firstName, String lastName, int trainerId, String specialization, String emailAddress,
			String mobileNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.trainerId = trainerId;
		this.specialization = specialization;
		this.emailAddress = emailAddress;
		this.mobileNumber = mobileNumber;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	
	
}

