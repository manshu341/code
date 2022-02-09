package com.team12.Exceptions;

public class PasswordMismatch extends Exception {

	/**
	 * @author manbatra4
	 */
	private static final long serialVersionUID = 1L;
	private String msg;
	public PasswordMismatch() {
		super();
		this.msg = "Password and conform password did not match";
	}
	public PasswordMismatch(String msg) {
		super();
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "PasswordMismatch [msg=" + msg + "]";
	}
	
	
	

}
