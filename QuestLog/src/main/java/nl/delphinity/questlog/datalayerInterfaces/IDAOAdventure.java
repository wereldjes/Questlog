package nl.delphinity.questlog.datalayerInterfaces;

import java.util.ArrayList;
import nl.delphinity.questlog.models.Adventure;
import nl.delphinity.questlog.models.PlayerSession;
import nl.delphinity.questlog.models.User;

public interface IDAOAdventure {
	
	public void updateAdventure(Adventure adventure);
	
	public Adventure getAdventure(String id); 
	
	public void deleteAdventure(String id);
	
	public void createAdventure(Adventure adventure);
	
	public ArrayList<Adventure> getAllAdventuresOfUser(User user);
	
	public void addUserToAdventureList(Adventure adventure,User user);
	
	public void addSessionToAdventure(Adventure adventure, PlayerSession session);

}
