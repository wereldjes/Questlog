package nl.delphinity.questlog.models;

import java.util.ArrayList;
import java.util.UUID;

import nl.delphinity.questlog.datalayers.TestAdventureDAO;

public class UserManager {

	private ArrayList<User> allUsers = new ArrayList<>();
	private User loginUser = new User(UUID.randomUUID(), "meneer", "test");
	private static UserManager instance = null;
	
	public static UserManager getInstance() {
		if(instance == null) {
			instance = new UserManager();
		}
		
		return instance;
	}

	public ArrayList<User> getAllUsers() {

		return allUsers;
	}

	public User getLoginUser() {
		return loginUser;
	}

	public void setLoginUser(User loginUser) {
		this.loginUser = loginUser;
	}

	public void setAllUsers(ArrayList<User> allUsers) {
		this.allUsers = allUsers;
	}

	public ArrayList<Adventure> getAllAdventuresOfUser(User user) {

		return TestAdventureDAO.getInstance().getAllAdventuresOfUser(user);
	}

}
