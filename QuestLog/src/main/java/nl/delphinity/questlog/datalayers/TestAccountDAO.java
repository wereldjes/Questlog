package nl.delphinity.questlog.datalayers;

import java.util.HashSet;
import java.util.TreeSet;

import org.mindrot.jbcrypt.BCrypt;

import nl.delphinity.questlog.models.Account;
import nl.delphinity.questlog.models.ValidationToken;
import nl.delphinity.questlog.datalayerInterfaces.IDAOAccount;

public class TestAccountDAO implements IDAOAccount{
	
	TreeSet<Account> allAccounts = new TreeSet<>();
	HashSet<ValidationToken> allTokens = new HashSet<>();
	private static TestAccountDAO instance = null;
	
	public static TestAccountDAO getInstance() {
		if(instance == null) {
			instance = new TestAccountDAO();
		}
		
		return instance;
	}

	@Override
	public boolean createAccount(Account account) {
		account.setPassword(BCrypt.hashpw(account.getPassword(), BCrypt.gensalt()));
		return allAccounts.add(account);
	}
	
	public Account getAccountByUsername(String username) {
		
		for (Account account : allAccounts) {
			if (account.getUserName().equals(username)) {
				return account;
			}
		}
		return null;
	}

	@Override
	public boolean userLogin(String userName, String password) {
		boolean isValid = false;
		
		for (Account a : allAccounts) {
			if(a.getUserName().equals(userName) && BCrypt.checkpw(password, a.getPassword())) {
				isValid = true;
			}
		}
		return isValid;
	}
	
	@Override
	public void createAccountToken(ValidationToken token) {
		allTokens.add(token);
	}
	
	@Override
	public void deleteAccountToken(ValidationToken deleteToken) {
		 ValidationToken removeMe = null;
		
		for (ValidationToken token : allTokens) {
			if (token.equals(deleteToken)) {
				removeMe = token;
			}
		}
		
		allTokens.remove(removeMe);
	}
	
	@Override
	public ValidationToken getAccountTokenByUsername(String id) {
		
		for (ValidationToken token : allTokens) {
			if (token.getAccount().getUserName().equals(id)) {
				return token;
			}
		}
		return null;
	}
	
	@Override
	public void enableAccount(String id) {
		
		for (Account account : allAccounts) {
			if(account.getUserName().equals(id)) {
				account.setEnabled(true);
			}
		}
	}
	
	@Override
	public Account getAccountByEmail(String email) {
		
		for(Account account : allAccounts) {
			if(account.getEmail().equals(email)) {
				return account;
			}
		}
		return null;
	}
	
	@Override
	public void overwriteAccountPassword(String password, String id) {
		for(Account account : allAccounts) {
			if(account.getUserName().equals(id)) {
				account.setPassword(BCrypt.hashpw(password, BCrypt.gensalt()));
			}
		}
	}

	//--------------------------------Test function---------------------------
	public void quickUser(Account account) {
		account.setPassword(BCrypt.hashpw(account.getPassword(), BCrypt.gensalt()));
		allAccounts.add(account);
	}
	//------------------------------------------------------------------------
}
