package nl.delphinity.questlog.models;

public class PlayerSession implements Comparable<PlayerSession>{

	private String adventureHistory;
	private String sessionID;
	private String sessionName;
	private String sessionDate;

	public PlayerSession() {

	}

	public String getAdventureHistory() {
		return adventureHistory;
	}

	public void setAdventureHistory(String adventureHistory) {
		this.adventureHistory = adventureHistory;
	}

	public String getSessionID() {
		return sessionID;
	}

	public String getSessionName() {
		return sessionName;
	}

	public void setSessionName(String sessionName) {

		this.sessionName = sessionName;

	}

	public void setSessionID(String sessionID) {
		this.sessionID = sessionID;
	}

	public String getSessionDate() {
		return sessionDate;
	}

	public void setSessionDate(String string) {
		this.sessionDate = string;
	}

	@Override
	public int compareTo(PlayerSession o) {
		
		if(sessionID.equals(o.getSessionID())) {
			return 0;
		} else {
			return sessionDate.compareTo(o.getSessionDate());
		}
	}

	@Override
	public boolean equals(Object obj) {
		
		PlayerSession ps = (PlayerSession) obj;
		return this.getSessionID().equals(ps.getSessionID());
	}

	@Override
	public int hashCode() {
		PlayerSession ps = new PlayerSession();
		return ps.getSessionID().hashCode();
	}
	
	

}
