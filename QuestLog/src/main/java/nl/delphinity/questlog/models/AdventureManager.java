package nl.delphinity.questlog.models;


import nl.delphinity.questlog.datalayers.TestAdventureDAO;

public class AdventureManager {
	
	private static AdventureManager instance = null;
	
	public static AdventureManager getInstance() {
		if(instance == null) {
			instance = new AdventureManager();
		}
		
		return instance;
	}
	
	public void addUserToAdventureList(Adventure adventure, User user) {
		TestAdventureDAO.getInstance().addUserToAdventureList(adventure, user);
	}
	
	public void createAdventure(Adventure adventure) {

		TestAdventureDAO.getInstance().createAdventure(adventure);
	}
	
	public Adventure getAdventure(String id) {
			
		return TestAdventureDAO.getInstance().getAdventure(id);
	}
	
	public void addSessionToAdventure(Adventure adventure, PlayerSession session) {
		
		
		TestAdventureDAO.getInstance().addSessionToAdventure(adventure, session);
	}
	
	public void deleteAdventure(String id) {
		
		TestAdventureDAO.getInstance().deleteAdventure(id);
	}
	
	public void updateAdventure(Adventure adventure) {
		
		TestAdventureDAO.getInstance().updateAdventure(adventure);
	}

}
