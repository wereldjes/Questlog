package nl.delphinity.questlog.models;

import java.util.TreeSet;

import nl.delphinity.questlog.datalayers.TestPlayerSessionDAO;

public class SessionManager {

	private static SessionManager instance = null;

	public static SessionManager getInstance() {
		if (instance == null) {
			instance = new SessionManager();
		}

		return instance;
	}

	public void createSession(PlayerSession session, Adventure adventure) {

		TestPlayerSessionDAO.getInstance().createSession(session, adventure);
	}

	public void addSessionToAdventure(PlayerSession session, Adventure adventure) {
		//TestAdventureDAO.getInstance().addSessionToAdventure(adventure, session);
	}

	public TreeSet<PlayerSession> getAllSessionsOfAdventure(Adventure adventure) {

		return TestPlayerSessionDAO.getInstance().getAllSessionsOfAdventure(adventure);
	}

	public String getCurrentAdventureID() {
		return TestPlayerSessionDAO.getInstance().getCurrentAdventureID();
	}

	public void setCurrentAdventureID(String currentAdventureID) {
		TestPlayerSessionDAO.getInstance().setCurrentAdventureID(currentAdventureID);
	}
	
	public void updateSession(PlayerSession session, Adventure adventure) {
		TestPlayerSessionDAO.getInstance().updateSession(session, adventure);
	}
	
	public void deleteSession(String id, Adventure adventure) {
		TestPlayerSessionDAO.getInstance().deleteSession(id, adventure);
		
	}

}
