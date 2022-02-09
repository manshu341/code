package beans;


/**
 * 
 * @author manbatra4
 *@see TrainerLogin bean class
 *@version 1.0
 */

public class TrainerLogin {
	private String username;
	private String password;
	public TrainerLogin(String username, String password) {
		super();
		this.username = username;
		this.password = password;
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
	@Override
	public String toString() {
		return "TrainerLogin [username=" + username + ", password=" + password + "]";
	}
	
}
