package nl.delphinity.questlog.models;

import java.util.TreeSet;

public class NonPlayerStorage {

	private static NonPlayerStorage instance = null;

	public TreeSet<Monster> monsterList = new TreeSet<Monster>();

	public TreeSet<Npc> npcList = new TreeSet<Npc>();

	public TreeSet<Monster> getMonsterList() {
		return monsterList;
	}

	public void setMonsterList(TreeSet<Monster> monsterList) {
		this.monsterList = monsterList;
	}

	public TreeSet<Npc> getNpcList() {
		return npcList;
	}

	public void setNpcList(TreeSet<Npc> npcList) {
		this.npcList = npcList;
	}

	public static NonPlayerStorage getInstance() {
		if (instance == null) {
			instance = new NonPlayerStorage();
		}
		return instance;
	}

}
