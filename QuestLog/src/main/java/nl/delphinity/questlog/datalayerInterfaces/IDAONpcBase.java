package nl.delphinity.questlog.datalayerInterfaces;

import nl.delphinity.questlog.models.Monster;
import nl.delphinity.questlog.models.Npc;

public interface IDAONpcBase {

	//Npc methods
	public void CreateNpc(Npc npc);

	public Npc getNpc(int id);

	public void removeNpc(int id);

	
	//Monster methods
	public void createMonster(Monster monster);

	public Monster getMonster(int id);
	
	public void removeMonster(int id);

}
