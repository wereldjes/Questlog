package nl.delphinity.questlog.datalayerInterfaces;

import java.util.UUID;

import nl.delphinity.questlog.models.User;

public interface IDAOUser {
	
	public void updateUser(User user);
	
	public User getUser(UUID id);
	
	public void deleteUser(UUID id);
	
	public void createUser(User user);


}
