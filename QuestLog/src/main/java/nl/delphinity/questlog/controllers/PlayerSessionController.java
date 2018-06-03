package nl.delphinity.questlog.controllers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TreeSet;
import java.util.UUID;

import com.opensymphony.xwork2.ActionSupport;

import nl.delphinity.questlog.models.Adventure;
import nl.delphinity.questlog.models.AdventureManager;
import nl.delphinity.questlog.models.PlayerSession;
import nl.delphinity.questlog.models.SessionManager;


public class PlayerSessionController extends ActionSupport{
	

	private static final long serialVersionUID = 3096021516201871100L;
	public PlayerSession session = new PlayerSession();
	public String adventureID;
	public String sessionID;
	public TreeSet<PlayerSession> allSessions = new TreeSet<>();
	private Adventure currentAdventure = new Adventure();
	
	public String Execute() {

		if(adventureID == null) {
			adventureID = SessionManager.getInstance().getCurrentAdventureID();
		}
		
		currentAdventure = AdventureManager.getInstance().getAdventure(adventureID);
		allSessions = SessionManager.getInstance().getAllSessionsOfAdventure(currentAdventure);
		
		SessionManager.getInstance().setCurrentAdventureID(adventureID);
		
		return SUCCESS;
	}
	
	public String createSession() {
		
		adventureID = SessionManager.getInstance().getCurrentAdventureID();
		currentAdventure = AdventureManager.getInstance().getAdventure(adventureID);
		
		session.setSessionID(UUID.randomUUID().toString());
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd MMM yyyy HH:mm:ss");
		session.setSessionDate(LocalDateTime.now().format(dateFormatter));
		
		SessionManager.getInstance().createSession(session, currentAdventure);
		SessionManager.getInstance().addSessionToAdventure(session, currentAdventure);

		SessionManager.getInstance().setCurrentAdventureID(adventureID);
		
		return SUCCESS;
	}

	public PlayerSession getPlayerSession() {
		return session;
	}

	public void setPlayerSession(PlayerSession session) {
		this.session = session;
	}
	
	public Adventure getCurrentAdventure() {
		return currentAdventure;
	}

	public void setCurrentAdventure(Adventure currentAdventure) {
		this.currentAdventure = currentAdventure;
	}
	
	public String updateSession() {
		adventureID = SessionManager.getInstance().getCurrentAdventureID();
		currentAdventure = AdventureManager.getInstance().getAdventure(adventureID);
		SessionManager.getInstance().updateSession(session, currentAdventure);
		
		return SUCCESS;
	}
	
	public String deleteSession() {
		adventureID = SessionManager.getInstance().getCurrentAdventureID();
		currentAdventure = AdventureManager.getInstance().getAdventure(adventureID);
		SessionManager.getInstance().deleteSession(sessionID, currentAdventure);
		
		return SUCCESS;
	}

}
