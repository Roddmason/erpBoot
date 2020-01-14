package com.elitsoft.erp.model;

import java.io.Serializable;

public class LoginValidationModel implements Serializable{
	/**
	 * Serialized model for login
	 * @author Elitsoft21
	 *
	 */
	private static final long serialVersionUID = -966377215771637106L;
	private String user;
	private String pass;
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
}