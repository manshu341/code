package Exceptions;

public class EmployeeNotFound extends Exception {

	/**
	 * @author manbatra4
	 */
	private static final long serialVersionUID = 1L;
	private String msg;
	public EmployeeNotFound() {
		this.msg = "Sorry Employee not found";
	}
	public EmployeeNotFound(String msg) {
		super();
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "EmployeeNotFound [msg=" + msg + "]";
	}
	
	

	
}
