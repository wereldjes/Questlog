package nl.delphinity.questlog.services;

import java.util.TreeMap;

import nl.delphinity.questlog.datalayers.HibernatePlayerCharacterDAO;
import nl.delphinity.questlog.models.PlayerCharacter;
import nl.delphinity.questlog.models.RolePlayer;
import nl.delphinity.questlog.services.interfaces.IServiceAddCharacter;

public class PlayerAdderServiceHardCoded implements IServiceAddCharacter {
	
	private static PlayerAdderServiceHardCoded instance = null;
	
	public static PlayerAdderServiceHardCoded getInstance() {
		if(null == instance) {
			instance = new PlayerAdderServiceHardCoded();
		}
		return instance;
	}
	
	
	private final int PLAYER = 1;
	
	
	private TreeMap<Integer, RolePlayer> players = new TreeMap<Integer,RolePlayer>();
	
	public PlayerAdderServiceHardCoded() {
		RolePlayer rp0 = new RolePlayer("HALLO","rplastname");
		RolePlayer rp1 = new RolePlayer("MOGGUH","rp1lastname");
		
		players.put(0, rp0);
		players.put(1, rp1);
	}
	
	
	
	
	@Override
	public void addPlayerCharacterToPlayer(PlayerCharacter  pc) {
		players.get(PLAYER).addCharacter(pc);
		HibernatePlayerCharacterDAO.getInstance().create(pc);
	}

}
