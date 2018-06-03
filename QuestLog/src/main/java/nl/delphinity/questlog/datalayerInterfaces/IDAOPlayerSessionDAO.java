package nl.delphinity.questlog.datalayerInterfaces;


import java.util.TreeSet;

import nl.delphinity.questlog.models.Adventure;
import nl.delphinity.questlog.models.PlayerSession;

public interface IDAOPlayerSessionDAO {
	
	public void updateSession(PlayerSession session, Adventure adventure);
	
	public PlayerSession getSession(String id, Adventure adventure);
	
	public void deleteSession(String id, Adventure adventure);
	
	public void createSession(PlayerSession session, Adventure adventure);
	
	public TreeSet<PlayerSession> getAllSessionsOfAdventure(Adventure adventure);

}
