package com.fortech.carbuyback.acces;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.persistence.Query;

@ManagedBean 
@SessionScoped
public class LoginBean extends AbstractBuyBackAcces {

	private String name;
	private String password;
	private String userName;

	public LoginBean() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 *  Method To Check User's Authentication Credentials.
	 */
	public String validateLoginCredentials() {
		String validationResult = "";
		
		Query queryObj = createEm().createQuery("SELECT u FROM UserEntity u WHERE u.login = :login AND u.password = :password");
		queryObj.setParameter("login", userName);
		queryObj.setParameter("password", password);
		try {
			UserEntity userResultSetObj = (UserEntity) queryObj.getSingleResult();				
			if ((userResultSetObj != null) && (userName.equalsIgnoreCase(userResultSetObj.getLogin()) && password.equals(userResultSetObj.getPassword()))) {
				validationResult ="success";
				name = userResultSetObj.getName();
			} 
		} catch(Exception exObj) {
			validationResult = "login";
			FacesContext.getCurrentInstance().addMessage("loginForm:loginName", new FacesMessage("Username Or Password Is Incorrect"));			
		}
		return validationResult;
	}
	
	
	
	
	
}