package nl.delphinity.questlog.models;

import java.util.TreeSet;
import java.util.UUID;

public class DungeonMaster extends User {

	private NonPlayerStorage npcStorage = NonPlayerStorage.getInstance();
	private Adventure CurrentAdventure;
	private TreeSet<NPCBase> npcBaseList = new TreeSet<>();

	public DungeonMaster(String name, String lastName) {
		super(UUID.randomUUID(), name, lastName);
	}

	public void addNpcToStorage(NPCBase npc) {
		try {
			if (npc.getClass().equals(Npc.class)) {
				npcStorage.getNpcList().add((Npc) npc);
			} else {
				npcStorage.getMonsterList().add((Monster) npc);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Npc getNpcFromStorageByID(int id) {
		TreeSet<Npc> npcList = npcStorage.getNpcList();
		try {
			for (Npc n : npcList) {
				if (n.getID() == id) {
					return n;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public Monster getMonsterFromStorageByID(int id) {
		TreeSet<Monster> npcList = npcStorage.getMonsterList();
		try {
			for (Monster m : npcList) {
				if (m.getID() == id) {
					return m;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public Adventure getCurrentAdventure() {
		return CurrentAdventure;
	}

	public void setCurrentAdventure(Adventure currentAdventure) {
		CurrentAdventure = currentAdventure;
	}

	public TreeSet<NPCBase> getNpcBaseList() {
		return npcBaseList;
	}

	public void setNpcBaseList(TreeSet<NPCBase> npcBaseList) {
		this.npcBaseList = npcBaseList;
	}

	@Override
	public String toString() {
		return "DungeonMaster [getName()=" + getName() + ", getLastName()=" + getLastName() + "]";
	}

}
