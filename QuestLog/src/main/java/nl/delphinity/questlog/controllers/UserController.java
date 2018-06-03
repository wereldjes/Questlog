package nl.delphinity.questlog.controllers;

import com.opensymphony.xwork2.ActionSupport;

import nl.delphinity.questlog.models.User;

public class UserController extends ActionSupport{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8968485372744611613L;
	public User userLogin;
	
	public String execute() {
		
		return SUCCESS;
	}
	
	

}
