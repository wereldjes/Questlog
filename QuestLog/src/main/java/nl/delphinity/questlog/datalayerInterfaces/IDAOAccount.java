package nl.delphinity.questlog.datalayerInterfaces;

import nl.delphinity.questlog.models.Account;
import nl.delphinity.questlog.models.ValidationToken;

public interface IDAOAccount {
	
	public boolean createAccount(Account account);
	
	public Account getAccountByUsername(String username);
	
	public boolean userLogin(String userName, String password);
	
	public void createAccountToken(ValidationToken token);
	
	public ValidationToken getAccountTokenByUsername(String id);
	
	public void deleteAccountToken(ValidationToken deleteToken);
	
	public void enableAccount(String id);
	
	public Account getAccountByEmail(String email);
	
	public void overwriteAccountPassword(String password, String id);

}
