package nl.delphinity.questlog.models;

import nl.delphinity.questlog.datalayers.TestAccountDAO;

public class AccountManager {
	
	private static AccountManager instance = null;
	
	public static AccountManager getInstance() {
		if(instance == null) {
			instance = new AccountManager();
		}
		return instance;
	}
	
	public boolean createAccount(Account account) {
		
		return TestAccountDAO.getInstance().createAccount(account);
	}
	
	public Account getAccountByUsername(String username) {
		
		return TestAccountDAO.getInstance().getAccountByUsername(username);
	}
	
	public boolean userLogin(String userName, String password) {
		
		return TestAccountDAO.getInstance().userLogin(userName, password);
	}
	
	public void createAccountToken(ValidationToken token) {
		
		TestAccountDAO.getInstance().createAccountToken(token);
	}

	public ValidationToken getAccountTokenByUsername(String id) {
		
		return TestAccountDAO.getInstance().getAccountTokenByUsername(id);
	}

	public void deleteAccountToken(ValidationToken validationtoken) {
		
		TestAccountDAO.getInstance().deleteAccountToken(validationtoken);
	}
	
	public void enableAccount(String id) {
		
		TestAccountDAO.getInstance().enableAccount(id);
	}
	
	public Account getAccountByEmail(String email) {
		
		return TestAccountDAO.getInstance().getAccountByEmail(email);
	}
	
	public void overwriteAccountPassword(String password, String id) {
		
		TestAccountDAO.getInstance().overwriteAccountPassword(password, id);
	}
	
	//-----------------------function for testing purposes-------------
	public void quickUser(Account account) {
		
		TestAccountDAO.getInstance().quickUser(account);
	}
	//-----------------------------------------------------------------

}
