package nl.delphinity.questlog.datalayers;

import java.util.TreeSet;

import nl.delphinity.questlog.datalayerInterfaces.IDAOPlayerSessionDAO;
import nl.delphinity.questlog.models.Adventure;
import nl.delphinity.questlog.models.PlayerSession;


public class TestPlayerSessionDAO implements IDAOPlayerSessionDAO{
	
	private String currentAdventureID;
	
	private static TestPlayerSessionDAO instance = null;
	
	public static TestPlayerSessionDAO getInstance() {
		if(instance == null) {
			instance = new TestPlayerSessionDAO();
		}
		
		return instance;
	}

	@Override
	public void updateSession(PlayerSession session, Adventure adventure) {
		for(PlayerSession ps : adventure.getAllSessions()) {
			if(ps.getSessionID().equals(session.getSessionID())) {
				ps.setSessionName(session.getSessionName());
			}
		}
	}

	@Override
	public PlayerSession getSession(String id, Adventure adventure) {
		for(PlayerSession ps :  adventure.getAllSessions()) {
			if(ps.getSessionID().equals(id)) {
				return ps;
			}
		}
		return null;
	}

	@Override
	public void deleteSession(String id, Adventure adventure) {

		adventure.getAllSessions().remove(getSession(id, adventure));
	}

	@Override
	public void createSession(PlayerSession session, Adventure adventure) {
		adventure.getAllSessions().add(session);
	}
	
	@Override
	public TreeSet<PlayerSession> getAllSessionsOfAdventure(Adventure adventure) {
		
		return adventure.getAllSessions();
	}

	public String getCurrentAdventureID() {
		return currentAdventureID;
	}

	public void setCurrentAdventureID(String currentAdventureID) {
		this.currentAdventureID = currentAdventureID;
	}
	
	

}
