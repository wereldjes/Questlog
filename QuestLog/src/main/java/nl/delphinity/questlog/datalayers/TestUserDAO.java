package nl.delphinity.questlog.datalayers;

import java.util.ArrayList;
import java.util.UUID;

import nl.delphinity.questlog.models.User;
import nl.delphinity.questlog.datalayerInterfaces.IDAOUser;

public class TestUserDAO implements IDAOUser{
	
	ArrayList<User> allUsers = new ArrayList<>();
	
	private static TestUserDAO instance = null;
	
	public static TestUserDAO getInstance() {
		if(instance == null) {
			instance = new TestUserDAO();
		}
		
		return instance;
	}

	@Override
	public void updateUser(User user) {
		for(User u :  allUsers) {
			if(u.getUserID().equals(user.getUserID())) {
				u = user;
			}
		} 	
	}

	@Override
	public User getUser(UUID id) {
		for(User u :  allUsers) {
			if(u.getUserID().equals(id)) {
				return u;
			}
		}
		return null;
		
	}

	@Override
	public void deleteUser(UUID id) {
		for(User u :  allUsers) {
			if(u.getUserID().equals(id)) {
				allUsers.remove(u);
			}
		}		
	}

	@Override
	public void createUser(User user) {
		allUsers.add(user);
		
	}

}
