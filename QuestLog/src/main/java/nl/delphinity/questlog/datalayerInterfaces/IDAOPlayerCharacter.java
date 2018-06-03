package nl.delphinity.questlog.datalayerInterfaces;

import nl.delphinity.questlog.models.PlayerCharacter;

public interface IDAOPlayerCharacter {
	//by-object
	public boolean create(PlayerCharacter pc);
	public boolean updateByPc(PlayerCharacter pc);
	public boolean deleteByPc(PlayerCharacter pc);
	//by-id
	public PlayerCharacter get(int id);
	public boolean deleteById(int id);
	
}
