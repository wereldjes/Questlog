package nl.delphinity.questlog.controllers;

import java.util.Map;
import java.util.UUID;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import nl.delphinity.questlog.helper.MailHelper;
import nl.delphinity.questlog.models.Account;
import nl.delphinity.questlog.models.AccountManager;
import nl.delphinity.questlog.models.ValidationToken;

public class AccountController extends ActionSupport implements SessionAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Account account = new Account();
	public ValidationToken token = new ValidationToken();
	public String id;
	public String accountToken;
	private Map<String, Object> session;

	public String Execute() {

		return SUCCESS;
	}

	public String createAccount() {

		if (AccountManager.getInstance().createAccount(account)) {
			token.setAccount(account);
			token.setToken(UUID.randomUUID().toString());
			AccountManager.getInstance().createAccountToken(token);

			try {
				MailHelper.createAccountEmail(account.getEmail(), token.getToken(), account.getUserName());
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			addActionMessage("Er is een mail verstuurd");
			return SUCCESS;
		}
		addActionError("Oeps, er is iets mis gegaan");
		return SUCCESS;
	}

	public String activateAccount() {

		if (id == null || id.equals("") && accountToken == null || accountToken.equals("")) {
			addActionError("Oeps, er ging iets mis");
			
			return LOGIN;
		} else {
			ValidationToken validationtoken = AccountManager.getInstance().getAccountTokenByUsername(id);
			if (validationtoken == null) {
				addActionError("Oeps, er ging iets mis");
				
				return LOGIN;
			} else if (validationtoken.getAccount().getUserName().equals(id) && validationtoken.getToken().equals(accountToken)) {
				AccountManager.getInstance().enableAccount(id);
				AccountManager.getInstance().deleteAccountToken(validationtoken);
				addActionMessage("Account is geactiveerd !");
				
				return SUCCESS;
			} else {
				addActionError("Oeps, er ging iets mis");
				
				return LOGIN;
			}
		}
	}

	//Password still needs to be hashed to improve security
	public String userLogin() {

		if (AccountManager.getInstance().getAccountByUsername(account.getUserName()) != null && AccountManager.getInstance().getAccountByUsername(account.getUserName()).isEnabled()) {
			if (!AccountManager.getInstance().userLogin(account.getUserName(), account.getPassword())) {
				addActionError("Uw wachtwoord klopt niet");
				
				return LOGIN;
			} else {
				session.put("loggedOnUser", account);

				return SUCCESS;
			}
		} else {
			addActionError("Login mislukt");
			
			return LOGIN;
		}
	}
	
	public String resetPasswordSetup() {
		
		Account resetAccount = AccountManager.getInstance().getAccountByEmail(account.getEmail());
		
		if(resetAccount == null || !resetAccount.isEnabled()) {
			addActionError("Oeps, er ging iets mis");
			
			return SUCCESS;
		} else {
			token.setAccount(resetAccount);
			token.setToken(UUID.randomUUID().toString());
			AccountManager.getInstance().createAccountToken(token);
			
			try {
				MailHelper.passwordResetEmail(account.getEmail(), token.getToken(), resetAccount.getUserName());
			} catch (Exception e) {
				e.printStackTrace();
			}
			addActionMessage("Er is een mail verstuurd");
			
			return SUCCESS;
		}
	}
	
	public String executeResetPassword() {
		
		return SUCCESS;
	}
	
	public String resetPassword() {
		
		if(id == null || id.equals("") && accountToken == null || accountToken.equals("")) {
			return SUCCESS;
		} else {
			ValidationToken resetToken = AccountManager.getInstance().getAccountTokenByUsername(id);
			if (resetToken == null) {
				return SUCCESS;
			} else if (resetToken.getAccount().getUserName().equals(id) && resetToken.getToken().equals(accountToken)) {
				AccountManager.getInstance().overwriteAccountPassword(account.getPassword(), id);
				AccountManager.getInstance().deleteAccountToken(resetToken);
				
				addActionMessage("Wachtwoord is gewijzigd !");
				return SUCCESS;
			} else {
				addActionError("Oeps, er ging iets mis!");
				return SUCCESS;
			}
		}
	}

	public String logOut() {
		session.remove("loggedOnUser");

		return SUCCESS;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> map) {
		this.session = map;
	}

	public boolean invalidLogin() {

		return false;
	}
	
	//------------------function for testing purposes--------------------------
	public String quickUser() {
		
		Account quickuser = new Account();
		quickuser.setUserName("student");
		quickuser.setPassword("test");
		quickuser.setEnabled(true);
		AccountManager.getInstance().quickUser(quickuser);
		session.put("loggedOnUser", quickuser);
		
		return SUCCESS;
	}
	//-------------------------------------------------------------------------
}
