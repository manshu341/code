package beans;

/**
 * 
 * @author manbatra4
 *@see TrainerRegistration bean class
 *@version 1.0
 */
public class TrainerRegistration {
	private String username;
	private String password;
	private String confirmPassword;
	private double dob;
	public TrainerRegistration(String username, String password, String confirmPassword, double dob) {
		super();
		this.username = username;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.dob = dob;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public double getDob() {
		return dob;
	}
	public void setDob(double dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "TrainerRegistration [username=" + username + ", password=" + password + ", confirmPassword="
				+ confirmPassword + ", dob=" + dob + "]";
	}
	
}
