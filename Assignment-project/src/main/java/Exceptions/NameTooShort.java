package Exceptions;

public class NameTooShort extends Exception {

	/**
	 * @author manbatra4
	 */
	private static final long serialVersionUID = 1L;
	private String msg;
	public NameTooShort() {
		super();
		this.msg = "sorry name too small";
	}
	public NameTooShort(String msg) {
		super();
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "NameTooShort [msg=" + msg + "]";
	}
	
	

}
