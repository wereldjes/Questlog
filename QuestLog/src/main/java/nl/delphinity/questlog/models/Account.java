package nl.delphinity.questlog.models;

public class Account implements Comparable<Account> {
	
	private String password;
	private String userName;
	private String email;
	private boolean isEnabled = false;
	
	public boolean isEnabled() {
		return isEnabled;
	}

	public void setEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
	}

	public Account() {
		
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
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int compareTo(Account o) {
		if(userName.equals(o.getUserName()) || email.equals(o.getEmail())) {
			return 0;
		} else {
			return userName.compareTo(o.getUserName());
		}
		
	}

}
