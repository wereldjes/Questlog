package nl.delphinity.questlog.models;

import java.util.UUID;

public class ValidationToken {
	
	private String token;
	private Account account;
	
	public ValidationToken () {
		
	}
	
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = UUID.randomUUID().toString();
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}

}
