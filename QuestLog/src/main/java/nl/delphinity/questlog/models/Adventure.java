package nl.delphinity.questlog.models;

import java.util.TreeSet;

public class Adventure implements Comparable<Adventure> {

	private String adventureID;
	private String adventureName;
	private int minLevel;
	private int maxLevel;
	
	private TreeSet<PlayerSession> allSessions = new TreeSet<>();
	private TreeSet<User> allAdventureUsers = new TreeSet<>();
	private TreeSet<Npc> allNpcs = new TreeSet<>();
	private TreeSet<Monster> allMonsters = new TreeSet<>();

	public Adventure() {

	}

	public Adventure(String adventureName, String adventureID) {
		this.adventureID = adventureID;
		this.adventureName = adventureName;
	}
	public String getAdventureName() {
		return adventureName;
	}

	public void setAdventureName(String adventureName) {
		this.adventureName = adventureName;
	}

	public int getMinLevel() {
		return minLevel;
	}

	public void setMinLevel(int minLevel) {
		this.minLevel = minLevel;
	}

	public int getMaxLevel() {
		return maxLevel;
	}

	public void setMaxLevel(int maxLevel) {
		this.maxLevel = maxLevel;
	}

	public TreeSet<PlayerSession> getAllSessions() {
		return allSessions;
	}

	public void setAllSessions(TreeSet<PlayerSession> allSessions) {
		this.allSessions = allSessions;
	}

	public String getAdventureID() {
		return adventureID;
	}

	public void setAdventureID(String adventureID) {
		this.adventureID = adventureID;
	}

	public TreeSet<User> getAllAdventureUsers() {
		return allAdventureUsers;
	}

	public void setAllAdventureUsers(TreeSet<User> allAdventureUsers) {
		this.allAdventureUsers = allAdventureUsers;
	}

	public TreeSet<Npc> getAllNpcs() {
		return allNpcs;
	}

	public void setAllNpcs(TreeSet<Npc> allNpcs) {
		this.allNpcs = allNpcs;
	}

	public TreeSet<Monster> getAllMonsters() {
		return allMonsters;
	}

	public void setAllMonsters(TreeSet<Monster> allMonster) {
		this.allMonsters = allMonster;
	}

	public int compareTo(Adventure o) {
		if (adventureID.equals(o.getAdventureID())) {
			return 0;
		} else {
			return adventureName.compareTo(o.getAdventureName());
		}
	}

}
