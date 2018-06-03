package nl.delphinity.questlog.datalayers;

import java.util.ArrayList;

import nl.delphinity.questlog.models.Adventure;
import nl.delphinity.questlog.models.PlayerSession;
import nl.delphinity.questlog.models.User;
import nl.delphinity.questlog.datalayerInterfaces.IDAOAdventure;

public class TestAdventureDAO implements IDAOAdventure {
	
	ArrayList<Adventure> allAdventures = new ArrayList<>();
	
	private static TestAdventureDAO instance = null;
	
	public static TestAdventureDAO getInstance() {
		if(instance == null) {
			instance = new TestAdventureDAO();
		}
		
		return instance;
	}

	@Override
	public void updateAdventure(Adventure adventure) {
		for(Adventure a : allAdventures) {
			if(a.getAdventureID().equals(adventure.getAdventureID())) {
				a.setAdventureName(adventure.getAdventureName());
				a.setMaxLevel(adventure.getMaxLevel());
				a.setMinLevel(adventure.getMinLevel());
			}
		}
	}

	@Override
	public Adventure getAdventure(String id) {
		for(Adventure a : allAdventures) {
			if(a.getAdventureID().equals(id)) {
				return a;
			}
		}
		return null;
	}

	@Override
	public void deleteAdventure(String id) {
		Adventure removeAdventure = null;
		for(Adventure a : allAdventures) {
			if(a.getAdventureID().equals(id)) {
				removeAdventure = a;
			}
		}
		
		if(removeAdventure != null) {
			allAdventures.remove(removeAdventure);
		}
	}

	@Override
	public void createAdventure(Adventure adventure) {
		allAdventures.add(adventure);
		
	}

	@Override
	public ArrayList<Adventure> getAllAdventuresOfUser(User user) {
		ArrayList<Adventure> allUserAdventures = new ArrayList<>();
		for(Adventure a : allAdventures) {
			for(User u : a.getAllAdventureUsers()) {
				if(u.getUserID().equals(user.getUserID())) {
					allUserAdventures.add(a);
				}
			}
		}
		
		return allUserAdventures;
	}

	@Override
	public void addUserToAdventureList(Adventure adventure, User user) {
		for(Adventure a : allAdventures) {
			if(a.getAdventureID().equals(adventure.getAdventureID())) {
				a.getAllAdventureUsers().add(user);
			}
		}
		
	}
	
	@Override
	public void addSessionToAdventure(Adventure adventure, PlayerSession session) {

		adventure.getAllSessions().add(session);
		
	}
	
}
